
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="resource/bootstrap-3.1.1-dist/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container">
            <h1>Formulario Crear Areas</h1>
<!--            `id_areas``nombre``descripcion``codigo`-->
            <c:url var="saveAreas"  value="guardarAreas.upeu" />
            <fm:form cssClass="form-horizontal" modelAttribute="modeloAreas" method="post" action="${saveAreas}">
                <table>
                    <tr>
                        <td><fm:label  path="nombre">Nombre</fm:label> </td>
                        <td><fm:input cssClass="form-control" path="nombre" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="descripcion">Descripci&oacute;n</fm:label> </td>
                        <td><fm:input cssClass="form-control" path="descripcion" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="codigo">Codigo</fm:label> </td>
                        <td><fm:input cssClass="form-control" path="codigo" size="60" /></td>
                    
                        
                    </tr>
                    <tr>
                        <td  class="text-center"colspan="2">
                        <fm:hidden path="idAreas" />
                        <input class="btn btn-success" type="submit" value="Guardar" >
                        </td>
                    
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>