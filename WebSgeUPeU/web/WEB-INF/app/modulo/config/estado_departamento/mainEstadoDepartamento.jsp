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
        
        <h1>Administracion de EstadoDepartamento!</h1>
        <a href="dmp1.upeu">Regresar inicio</a> &emsp14;
        <a href="formEstadoDepartamento.upeu">Crear Estado.Dpto</a>
        
        
        <div id="idFormulario" align="center">
            
        <form  id="formBuscar" action="buscarEstadoDepartamentox.upeu"  method="post" name="formBuscar" >
        <table align="center"  class="myform">
        
        <tr align="center">
        &nbsp;&nbsp;
        <td  style="color:black">
        Periodo <input type="text" class="myinput" id="periodo" size="50" name="EstadoDepartamento"  value="">
        
        <input  type="submit"  class="button2" value="Buscar" >&nbsp;
        </td>
        </tr>
        </table>
        </form>
        </div> 
        
        
        <c:if test="${!empty ListaEstadoDepartamento}">
            <table >
                <tr>
                    <th>estadometa</th>
                    <th>estadoavance</th>
                    <th>estadopoa</th>
                    <th>estadopm</th>
                    <th>DepartamentoFilial</th>
                    <th>Periodo</th>
                    <th>Opciones</th>
                    
                </tr>
                
                <c:forEach items="${ListaEstadoDepartamento}" var= "dato">   
                <tr>
                    <td><c:out value="${dato.estadometa}"/></td>
                    <td><c:out value="${dato.estadoavance}"/></td>
                    <td><c:out value="${dato.estadopoa}"/></td>
                    <td><c:out value="${dato.estadopm}"/></td>
                    <td><c:out value="${dato.idDepartamentoFilial.idDepartamento}"/></td>
                    <td><c:out value="${dato.idPeriodo.descripcion}"/></td>
                    
                    <td></td>
                    <td>
                        <a href="eliminarEstadoDepart.upeu?idEstadodepartamentox=${dato.idEstadodepartamento}">Eliminar</a>&emsp14;
                        <a href="modificarEstadoDepartamentoX.upeu?idEstadodepartamento=${dato.idEstadodepartamento}">Modificar</a>
                    </td>
                    
                </tr>
                </c:forEach>
            </table>            
       Hola Grupo N° 01
        </c:if>
        
    </body>
</html>
