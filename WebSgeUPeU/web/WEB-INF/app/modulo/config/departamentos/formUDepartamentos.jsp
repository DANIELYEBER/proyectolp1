    
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
            <c:url var="savedepartamentosx"  value="actualizarPeriodo.upeu" />
            <fm:form modelAttribute="ModeloDepartamentos" method="post" action="${savedepartamentosx}">
                <table>
                    <tr>
                        <td><fm:label path="nombre">Nombre</fm:label> </td>
                        <td><fm:input path="nombre" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="descripcion">Descripci&oacute;n</fm:label> </td>
                        <td><fm:input path="descripcion" size="60" /></td>
                    </tr>
                      <tr>
                        <td><fm:label path="codigo">Codigo</fm:label> </td>
                        <td><fm:input path="codig" size="60" /></td>
                    </tr>
                   
                                 
                    <tr>                        
                        <td colspan="2">
                        <fm:hidden path="idPeriodo" />
                            <input type="submit" value="Guardar" >
                        </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>

    
    
    
    
    
    
    
    
</html>