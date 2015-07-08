
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
            <c:url var="saveDepartamentosFilial"  value="guardarDepartementosFi.upeu" />
            <fm:form modelAttribute="modeloDepartamentosFi" method="post" action="${saveDepartamentosFilial}">
                <table>
                    <tr>
                        <td><fm:label path="idFilial.idFilial">Filial</fm:label> </td>
                        <td>
                        <fm:select path="idFilial.idFilial">
                            <fm:options items="${listaFilialX}" itemLabel="idFilial" itemValue="idFilial" />
                        </fm:select>
                            
                        </td>
                    </tr>                    
                    <tr>
                        <td><fm:label path="idDepartamento.idDepartamento">Departamento</fm:label> </td>
                        <td>
                        <fm:select path="idDepartamento.idDepartamento">
                            <fm:options items="${listaDepartamentoX}" itemLabel="descripcion" itemValue="idDepartamento" />
                        </fm:select>
                            
                        </td>
                    </tr>                    
                    <tr>
                        <td><fm:label path="idTipoarea.idTipoarea">TipoArea</fm:label> </td>
                        <td>
                        <fm:select path="idTipoarea.idTipoarea">
                            <fm:options items="${listaTipoareaX}" itemLabel="descripcion" itemValue="idTipoarea" />
                        </fm:select>
                            
                        </td>
                    </tr> 
                    
                    <tr>                        
                        <td colspan="2"><input type="submit" value="Enviar" > </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>
