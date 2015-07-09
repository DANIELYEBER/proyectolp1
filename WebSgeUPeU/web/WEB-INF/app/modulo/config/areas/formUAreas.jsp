
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
            <h1>Update Area</h1>
<!--            `id_areas``nombre``descripcion``codigo`-->
            <c:url var="updateAreas"  value="actualizarAreas.upeu" />
            <fm:form modelAttribute="ModeloAreas"  method="post" action="${updateAreas}">
                <table>

                    <tr>
                        <td><fm:label path="nombre">Nombre</fm:label> </td>
                        <td><fm:input path="nombre" cssClass="form-control" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="descripcion">Descripci&oacute;n</fm:label> </td>
                        <td><fm:input path="descripcion" cssClass="form-control" size="60" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="codigo">Codigo</fm:label> </td>
                        <td><fm:input path="codigo" cssClass="form-control" size="60" /></td>
                    </tr>

                    <tr>        
                        
                        <td colspan="2">
                        <fm:hidden path="idAreas" />
                        <button type="submit" class="btn btn-success"><i class="glyphicon glyphicon-save"></i> Guardar</button>
                        
                        </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>