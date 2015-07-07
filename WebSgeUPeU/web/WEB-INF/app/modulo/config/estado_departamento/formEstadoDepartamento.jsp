<%-- 
    Document   : formPeriodo
    Created on : 23-jun-2015, 10:23:00
    Author     : SistemasUpeu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <c:url var="saveperiodox"  value="guardarPeriodo.upeu" />
            <fm:form modelAttribute="modeloPeriodo" method="post" action="${saveperiodox}">
                <table>
                    <tr>
                        <td><fm:label path="periodo">Periodo</fm:label> </td>
                        <td><fm:input path="periodo" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="descripcion">Descripci&oacute;n</fm:label> </td>
                        <td><fm:input path="descripcion" size="60" /></td>
                    </tr>
                    
                    <tr>
                        <td><fm:label path="idTemporada.idTemporada">Temporada</fm:label> </td>
                        <td>
                        <fm:select path="idTemporada.idTemporada">
                            <fm:options items="${listaTemporadaX}" itemLabel="descripcion" itemValue="idTemporada" />
                        </fm:select>
                            
                        </td>
                    </tr>                    
                    <tr>
                        <td><fm:label path="fechaInicio">F. Inicio</fm:label> </td>
                        <td><fm:input path="fechaInicio" /></td>
                    </tr>                    
                    <tr>
                        <td><fm:label path="fechaFin">F. Fin</fm:label> </td>
                        <td><fm:input path="fechaFin" /></td>
                    </tr>                    
                    <tr>
                        <td><fm:label path="estado">Estado:</fm:label> </td>
                        <td>
                        <fm:select path="estado">
                            <fm:option value="1">Activo</fm:option>
                            <fm:option value="0">Desactivo</fm:option>
                        </fm:select>
                            
                        </td>
                    </tr>
                    
                    <tr>                        
                        <td colspan="2"><input type="submit" value="Enviar" > </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>
