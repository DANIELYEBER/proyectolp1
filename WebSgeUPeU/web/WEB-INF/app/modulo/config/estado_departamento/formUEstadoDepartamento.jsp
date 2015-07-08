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
            <c:url var="saveEstadoDepartamentoControllerx"  value="actualizarEstadoDepartamentoController.upeu" />
            <fm:form modelAttribute="modeloEstadoDepartamentoController" method="post" action="${EstadoDepartamentoControllerx}">
                <table>
                    <tr>
                        <td><fm:label path="estadometa">estadometa</fm:label> </td>
                        <td><fm:input path="estadometa" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="estadoavance">estadoavance</fm:label> </td>
                        <td><fm:input path="estadoavance" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="estadopoa">estadopoa</fm:label> </td>
                        <td><fm:input path="estadopoa" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="estadopm">estadopm</fm:label> </td>
                        <td><fm:input path="estadopm" size="60" /></td>
                    </tr>
                    
                    <tr>
                        <td><fm:label path="idDepartamentoFilial.idDepartamentoFilial">DepartamentoFilial</fm:label> </td>
                        <td>
                        <fm:select path="idDepartamentoFilial.idDepartamentoFilial">
                            <fm:options items="${listaDepartamentoFilialX}" itemLabel="idDepartamentoFilial" itemValue="idDepartamentoFilial" />
                        </fm:select>
                            
                        </td>
                    </tr>                    
                    <tr>
                        <td><fm:label path="idPeriodo.idPeriodo">Periodo</fm:label> </td>
                        <td>
                        <fm:select path="idPeriodo.idPeriodo">
                            <fm:options items="${listaPeriodoX}" itemLabel="descripcion" itemValue="idPeriodo" />
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
