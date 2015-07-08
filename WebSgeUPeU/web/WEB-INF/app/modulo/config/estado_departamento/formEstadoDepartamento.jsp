<%-- 
    Document   : formAreas
    Created on : 06/07/2015, 06:24:11 PM
    Author     : USERS
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
<!--            `id_areas``nombre``descripcion``codigo`-->
            <c:url var="saveEstadoDepartamento"  value="guardarEstadoDepartamento.upeu" />
            <fm:form modelAttribute="modeloEstadoDepartamento" method="post" action="${saveEstadoDepartamento}">
                <table>
                    <tr>
                        <td><fm:label path="idDepartamentoFilial.idDepartamentoFilial">DepartamentoFilial</fm:label> </td>
                        <td>
                        <fm:select path="idDepartamentoFilial.idDepartamentoFilial">
                            <fm:options items="${listaDepartamentoFilialX}" itemLabel="descripcion" itemValue="idDepartamentoFilial" />
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
                        <td><fm:label path="estadometa">estadometa</fm:label> </td>
                        <td><fm:input path="estadometa" size="60" /></td>
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
                        
                        
                        
                        
                        <td colspan="2">
                        <fm:hidden path="idEstadoDepartamento" />
                            <input type="submit" value="Guardar" >
                        </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>