<%-- 
    Document   : mainAreas
    Created on : 05/07/2015, 12:23:49 PM
    Author     : USERS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:out value="${saludo}"/>
        
        <h1>Administracion de Areas!</h1>
        <a href="dmp1.upeu">Regresar inicio</a> &emsp14;
        <a href="formArea.upeu">Crear Area</a>
       
        
        <div id="idFormulario" align="center">
            
        <form  id="formBuscar" action="buscarAreas.upeu"  method="post" name="formBuscar" >
        <table align="center"  class="myform">
        
        <tr align="center">
        &nbsp;&nbsp;
        <td  style="color:black">
            
        Periodo <input type="text" class="myinput" id="area" size="50" name="area"  value="">
        
        <input  type="submit"  class="button2" value="Buscar" >&nbsp;
        </td>
        </tr>
        </table>
        </form>
        </div> 
        <!--            `id_areas``nombre``descripcion``codigo`-->
        
        <c:if test="${!empty ListaAreas}">
            <table >
                <tr>
                    <th>id_areas</th>
                    <th>nombre</th>
                    <th>descripcion</th>
                    <th>codigo</th>

                    
                </tr>
                
                <c:forEach items="${ListaAreas}" var= "dato">   
                <tr>
                    <td><c:out value="${dato.id_areas}"/></td>
                    <td><c:out value="${dato.nombre}"/></td>
                    <td><c:out value="${dato.descripcion}"/></td>
                    <td><c:out value="${dato.codigo}"/></td>
                    <td></td>
                    <td>
                        <a href="eliminarper.upeu?idperiodox=${dato.idAreas}">Eliminar</a>&emsp14;
                        <a href="modificarAreaX.upeu?idPeriodo=${dato.idAreas}">Modificar</a>
                    </td>
                    
                </tr>
                </c:forEach>
            </table>
            
            Holasss
        </c:if>
        
    </body>
</html>
