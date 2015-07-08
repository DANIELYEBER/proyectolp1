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
        
        <h1>Administracion de Departamentos</h1>
        <a href="dmp1.upeu">Regresar inicio</a> &emsp14;
        <a href="formDepartamentos.upeu">Crear Departamentos</a>
       
        
        <div id="idFormulario" align="center">
            
        <form  id="formBuscar" action="buscarDepartamento.upeu"  method="post" name="formBuscar" >
        <table align="center"  class="myform">
        
        <tr align="center">
        &nbsp;&nbsp;
        <td  style="color:black">
            
        Areas <input type="text" class="myinput" id="departamentos" size="50" name="departamentos"  value="">
        
        <input  type="submit"  class="button2" value="Buscar" >&nbsp;
        </td>
        </tr>
        </table>
        </form>
        </div> 
        <!--            `id_areas``nombre``descripcion``codigo`-->
        
        <c:if test="${!empty ListaDepartamentos}">
            <table >
                <tr>
                    
                    <th>Nombre</th>
                    <th>Descripcion</th>
                    <th>Codigo</th>
                    <th>Opciones</th>

                    
                </tr>
                
                <c:forEach items="${ListaDepartamentos}" var= "dato">   
                <tr>
                    
                    <td><c:out value="${dato.nombre}"/></td>
                    <td><c:out value="${dato.descripcion}"/></td>
                    <td><c:out value="${dato.codigo}"/></td>
                    <td>
                        <a href="eliminardepartamentos.upeu?idDepartamentox=${dato.idDepartamento}">Eliminar</a>&emsp14;
                        <a href="modificarDepartamentosX.upeu?idDepartamento=${dato.idDepartamentos}">Modificar</a>
                    </td>
                    
                </tr>
                </c:forEach>
            </table>
            
            Holasss
        </c:if>
        
    </body>
</html>
