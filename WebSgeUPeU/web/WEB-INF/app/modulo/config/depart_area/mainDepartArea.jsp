

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
        
        <h1>Administracion de DepartArea!</h1>
        <a href="dmp1.upeu">Regresar inicio</a> &emsp14;
        <a href="formDepartArea.upeu">Crear DepartArea</a>

        <div id="idFormulario" align="center">
            
        <form  id="formBuscar" action="buscarDepartAreax.upeu"  method="post" name="formBuscar" >
        <table align="center"  class="myform">
        
        <tr align="center">
        &nbsp;&nbsp;
        <td  style="color:black">
        DepartArea <input type="text" class="myinput" id="DepartArea" size="50" name="DepartArea"  value="">
        
        <input  type="submit"  class="button2" value="Buscar" >&nbsp;
        </td>
        </tr>
        </table>
        </form>
        </div> 
 
        <c:if test="${!empty ListaDepartArea}">
            <table >
                <tr>
                    <th>idAreas</th>
                    <th>idDepartamentoFilial</th>

                </tr>
                
                <c:forEach items="${ListaDepartArea}" var= "dato">   
                <tr>
                    <td><c:out value="${dato.idAreas.nombre}"/></td>
                    <td><c:out value="${dato.idDepartamentoFilial.idDepartamento}"/></td>

                    <td></td>
                    <td>
                        <a href="eliminarDepartArea.upeu?iddepartAreax=${dato.idDepartArea}">Eliminar</a>&emsp14;
                        <a href="modificarDepartAreaX.upeu?idDepartArea=${dato.idDepartArea}">Modificar</a>
                    </td>
                    
                </tr>
                </c:forEach>
            </table>
            
            Holasss
        </c:if>
        
    </body>
</html>
