<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title>SysSge@life</title>  	

    <meta http-equiv="content-type" content="text/html; charset=utf-8" />	
    <link rel="stylesheet" href="resource/bootstrap-3.1.1-dist/css/bootstrap.min.css"/>



    <script src="<c:url value="/resource/jquery/jquery.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resource/slide/js/slide.js"/>" type="text/javascript"></script>
    <link rel="stylesheet" href="resource/bootstrap-3.1.1-dist/js/bootstrap.min"/>
	
	
	
</head>

<body>
<!-- Panel -->
<div id="toppanel">
	<div id="panel">
		<div class="content">
			
			<div class="left">
				<!-- Login Form -->
                                <form class="clearfix" action="main.upeu" method="get">
					
                                        <h1>Ingresar al Sistema</h1>                         
					<label class="grey" for="log">User Name:</label>
                                        <input class="field" type="text" name="persona" id="username" value="" size="23"  required="required"/>
                                        <label class="grey" for="pwd">Password:</label>
                                        <input class="field" type="password" name="clave" id="password" size="23" accept="required"/>	            	        			
                                        <input type="submit" name="submit" value="Login" class="bt_register" />
					
				</form>
			</div>

		</div>
	</div> <!-- /login -->	

	<!-- The tab on top -->	
	<div class="tab">
		<ul class="login">
			<li class="left">&nbsp;</li>			
			<li id="toggle">
				<a id="open" class="open" href="#">Iniciar Sesión</a>
				<a id="close" style="display: none;" class="close" href="#">Cerrar Panel</a>			
			</li>
			<li class="right">&nbsp;</li>
		</ul> 
	</div> <!-- / top -->
	
</div> <!--panel -->
    <div id="container">	
		<div id="content" style="padding-top:100px;">

                             <MARQUEE SCROLLDELAY =200> <h1>Bienvenidos al Sistema de Gestion Estratégica</h1> </MARQUEE>
		</div>		
	</div>
</body>
</html>
