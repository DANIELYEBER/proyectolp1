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
            <c:url var="saveDepartArea"  value="guardarDepartArea.upeu" />
            <fm:form modelAttribute="modeloDepartArea" method="post" action="${saveDepartArea}">
                <table>
                      <tr>
                        <td><fm:label path="idAreas.idAreas">Areas</fm:label> </td>
                        <td>
                        <fm:select path="idAreas.idAreas">
                            <fm:options items="${listaAreasX}" itemLabel="nombre" itemValue="idAreas" />
                        </fm:select>
                            
                        </td>
                    </tr>
                    <tr>
                        <td><fm:label path="idDepartamentoFilial.idDepartamentoFilial">DepartamentoFilial</fm:label> </td>
                        <td>
                        <fm:select path="idDepartamentoFilial.idDepartamentoFilial">
                            <fm:options items="${listaDepartamentoFilialX}" itemLabel="idDepartamento" itemValue="idDepartamentoFilial" />
                        </fm:select>
                            
                        </td>
                    </tr>                  
                    
                    <tr>        
                                               
                        <td colspan="2">
                        <fm:hidden path="idDepartArea" />
                            <input type="submit" value="Guardar" >
                        </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>