<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link type="text/css" rel="stylesheet" href="<c:url value="/recursos/css/style.css" />" />
<script src="<c:url value="/recursos/js/jquery.js" />" type="text/javascript" ></script>
</head>
<body>
    <table border="1" cellpadding="2" cellspacing="2" align="center" width="90%" >
	<tr>
		<td height="30" colspan="2"><tiles:insertAttribute name="header" />
		</td>
	</tr>
	<tr>
            <td height="100%" width="15%"><tiles:insertAttribute name="menu" /></td>
            <td width="85%" ><tiles:insertAttribute name="body" /></td>
	</tr>
	<tr>
		<td height="30"  colspan="2"><tiles:insertAttribute name="footer" />
		</td>
	</tr>
</table>
</body>
</html>
