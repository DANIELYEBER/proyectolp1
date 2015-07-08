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
            <c:url var="saveEstadoArea"  value="guardarEstadoArea.upeu" />
            <fm:form modelAttribute="ModeloEstadoArea" method="post" action="${saveEstadoArea}">
                <table>
                    <tr>
                        <td><fm:label path="estadometa">Estadometa</fm:label> </td>
                        <td><fm:input path="estadometa" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="estadoAavance">EstadoAavance</fm:label> </td>
                        <td><fm:input path="estadoAavance" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="estadopoa">Estadopoa</fm:label> </td>
                        <td><fm:input path="estadopoa" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="estadopm">Estadopm</fm:label> </td>
                        <td><fm:input path="estadopm" size="60" /></td>
                    </tr>
                    
                    <tr>
                        <td><fm:label path="idDepartArea.idDepartArea">DepartArea</fm:label> </td>
                        <td>
                        <fm:select path="idDepartArea.idDepartArea">
                            <fm:options items="${listaDepartAreaX}" itemLabel="idArea" itemValue="idDepartArea" />
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
                        <td colspan="2">
                        <fm:hidden path="idEstadoArea" />
                            <input type="submit" value="Guardar" >
                        </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>