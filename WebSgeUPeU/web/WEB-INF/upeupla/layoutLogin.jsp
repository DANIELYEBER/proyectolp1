<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link type="text/css" rel="stylesheet" href="<c:url value="/resource/css/style.css" />" />
<script src="<c:url value="/resource/js/jquery.js" />" type="text/javascript" ></script>
</head>
<body>
    <div align="center">        
        <tiles:insertAttribute name="body" />
    </div>
</body>
</html>