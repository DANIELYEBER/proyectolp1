<%-- 
    Document   : mainPeriodo
    Created on : 19-jun-2015, 15:15:57
    Author     : SistemasUpeu
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
        
        <h1>Administracion de Estado Departamento!</h1>
        <a href="EstadoDepartamento.upeu">Regresar inicio</a> &emsp14;
        <a href="formEstadoDepartamento.upeu">Crear Estado Departamento</a>
        
        
        <div id="idFormulario" align="center">
            
        <form  id="formBuscar" action="buscarEstadoDepartamentox.upeu"  method="post" name="formBuscar" >
        <table align="center"  class="myform">
        
        <tr align="center">
        &nbsp;&nbsp;
        <td  style="color:black">
        Estado Departamento <input type="text" class="myinput" id="EstadoDepartamento" size="50" name="EstadoDepartamento"  value="">
        
        <input  type="submit"  class="button2" value="Buscar" >&nbsp;
        </td>
        </tr>
        </table>
        </form>
        </div> 
        
        
        <c:if test="${!empty ListaEstadoDepartamento}">
            <table >
                <tr>
                    <th>Periodo</th>
                    <th>F. Inicio</th>
                    <th>F. fin</th>
                    <th>Periodo</th>
                    <th>Temporada</th>
                    <th>Estado</th>
                    <th>Opciones</th>
                    
                </tr>
                
                <c:forEach items="${ListaEstadoDepartamento}" var= "dato">   
                <tr>
                    <td><c:out value="${dato.periodo}"/></td>
                    <td><c:out value="${dato.fechaInicio}"/></td>
                    <td><c:out value="${dato.fechaFin}"/></td>
                    <td><c:out value="${dato.idTemporada.descripcion}"/></td>
                    <td><c:out value="${dato.estado}"/></td>
                    <td></td>
                    <td>
                        <a href="eliminarper.upeu?idEstadoDepartamentox=${dato.idEstadoDepartamento}">Eliminar</a>&emsp14;
                        <a href="modificarEstadoDepartamentoX.upeu?idEstadoDepartamento=${dato.idEstadoDepartamento}">Modificar</a>
                    </td>
                    
                </tr>
                </c:forEach>
            </table>
            
            Holasss
        </c:if>
        
    </body>
</html>