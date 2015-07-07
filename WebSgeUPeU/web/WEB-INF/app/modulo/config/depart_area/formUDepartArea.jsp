<%-- 
    Document   : formUAreas
    Created on : 06/07/2015, 06:23:44 PM
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
<!--            ``id_depart_area``id_areas``id_departamento_filial`
            <c:url var="updatedepartarea"  value="actualizardepartarea.upeu" />
            <fm:form modelAttribute="Modelodepartarea" method="post" action="${updateAreas}">
                <table>

                    <tr>
                        <td><fm:label path="id_depart_area">Nombre</fm:label> </td>
                        <td><fm:input path="id_depart_area" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="id_areas">Descripci&oacute;n</fm:label> </td>
                        <td><fm:input path="id_areas" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="id_departamento_filial">Codigo</fm:label> </td>
                        <td><fm:input path="id_departamento_filial" size="60" /></td>
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