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
            <c:url var="saveAreas"  value="guardarAreas.upeu" />
            <fm:form modelAttribute="modeloAreas" method="post" action="${saveAreas}">
                <table>
                   
                    <tr>
                        <td><fm:label path="nombre">Nombre</fm:label> </td>
                        <td><fm:input path="nombre" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="descripcion">Descripci&oacute;n</fm:label> </td>
                        <td><fm:input path="descripcion" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="codigo">Codigo</fm:label> </td>
                        <td><fm:input path="codigo" size="60" /></td>
                    </tr>

                    <tr>        
                        
                        
                        
                        
                        <td colspan="2">
                        <fm:hidden path="idAreas" />
                            <input type="submit" value="Guardar" >
                        </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>