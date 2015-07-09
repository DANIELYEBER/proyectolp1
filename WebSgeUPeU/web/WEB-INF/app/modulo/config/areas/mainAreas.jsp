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
        <link rel="stylesheet" href="resource/bootstrap-3.1.1-dist/css/bootstrap.min.css"/>

    </head>
    <body>




        <c:out value="${saludo}"/>

        <h1>Administracion de Areas!</h1>
        <a href="dmp1.upeu" class="btn btn-info">Regresar inicio</a> &emsp14;
        <a href="formAreas.upeu" class="btn btn-primary"><i class="glyphicon glyphicon-open"></i> Crear Area</a>

        <br>
        <br>
        <div id="idFormulario" align="center">

            <form  id="formBuscar" action="buscarAreasX.upeu" class="form-inline"  method="post" name="formBuscar" >
                <div class="form-group"> 
                    <label>Areas</label>
                    <input  type="text" class="myinput form-control" id="area" size="50" name="area"  value="">


                </div>
                <button type="submit" class="btn btn-primary"> <i class="glyphicon glyphicon-search"></i> Buscar </button>
               
            </form>
        </div> 
        <!--            `id_areas``nombre``descripcion``codigo`-->
        <br>
        <c:if test="${!empty ListaAreas}">
            <table  class="table table-bordered" >
                <tr>

                    <th>nombre</th>
                    <th>descripcion</th>
                    <th>codigo</th>
                    <th>opciones</th>


                </tr>

                <c:forEach items="${ListaAreas}" var= "dato">   
                    <tr>

                        <td><c:out value="${dato.nombre}"/></td>
                        <td><c:out value="${dato.descripcion}"/></td>
                        <td><c:out value="${dato.codigo}"/></td>
                        <td>
                            <a class="btn btn-danger" href="eliminarareas.upeu?idareasx=${dato.idAreas}"><i class="glyphicon glyphicon-trash"></i> Eliminar</a>&emsp14;
                            <a  class="btn btn-primary" href="modificarAreasX.upeu?idAreas=${dato.idAreas}"><i class="glyphicon glyphicon-check"></i> Modificar</a>
                        </td>

                    </tr>
                </c:forEach>
            </table>

            Holasss
        </c:if>

    </body>
</html>
