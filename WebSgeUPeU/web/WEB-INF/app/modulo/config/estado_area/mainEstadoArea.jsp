<%-- 
    Document   : mainDepartAreas
    Created on : 05/07/2015, 12:25:02 PM
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
        
        <h1>Administracion de Estado Area!</h1>
        <a href="dmp1.upeu">Regresar inicio</a> &emsp14;
        <a href="formEstadoArea.upeu">Crear EstadoArea</a>
        
        
        <div id="idFormulario" align="center">
            
        <form  id="formBuscar" action="buscarEstadoAreax.upeu"  method="post" name="formBuscar" >
        <table align="center"  class="myform">
        
        <tr align="center">
        &nbsp;&nbsp;
        <td  style="color:black">
        EstadoArea <input type="text" class="myinput" id="EstadoArea" size="50" name="EstadoArea"  value="">
        
        <input  type="submit"  class="button2" value="Buscar" >&nbsp;
        </td>
        </tr>
        </table>
        </form>
        </div> 
        
        
        <c:if test="${!empty ListaEstadoArea}">
            <table >
                <tr>
                    <th>EstadoMeta</th>
                    <th>EstadoAvance</th>
                    <th>EstadoPoa</th>
                    <th>EstadoPm</th>
                    <th>idDepartArea</th>
                    <th>idPeriodo</th>
                    <th>Opciones</th>
                    
                </tr>
                
                <c:forEach items="${ListaEstadoArea}" var= "dato">   
                <tr>
                    <td><c:out value="${dato.estadometa}"/></td>
                    <td><c:out value="${dato.estadoAavance}"/></td>
                    <td><c:out value="${dato.estadopoa}"/></td>
                    <td><c:out value="${dato.estadopm}"/></td>
                    <td><c:out value="${dato.idDepartArea.idAreas}"/></td>
                    <td><c:out value="${dato.idPeriodo.descripcion}"/></td>
                   
                    <td></td>
                    <td>
                        <a href="eliminarEstadoArea.upeu?idEstadoAreax=${dato.idEstadoArea}">Eliminar</a>&emsp14;
                        <a href="modificarEstadoAreaX.upeu?idEstadoArea=${dato.idEstadoArea}">Modificar</a>
                    </td>
                    
                </tr>
                </c:forEach>
            </table>          
    Hola Grupo N° 01
        </c:if>
        
    </body>
</html>

