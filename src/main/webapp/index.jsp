<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Options Circle</h1>
	<p><a href="<s:url action='hello'/>">Hello World</a></p>
	<p><a href="<s:url action='strikes'/>">Strikes!</a></p>
	<p><a href="<s:url action='expirations'/>">Expirations!</a></p>
	<p><a href="<s:url action='askbid'/>">Ask Bid!</a></p>
	</body>
</html>