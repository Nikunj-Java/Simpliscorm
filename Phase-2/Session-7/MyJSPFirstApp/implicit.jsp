<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
 String responseCheck=request.getParameter("office");

if(responseCheck!=null){
	response.setStatus(response.SC_MOVED_TEMPORARILY);
	response.setHeader("Location", "response-redirect.jsp?office="+responseCheck);
}

%>


<a href="implicit.jsp?office=head_office">Check the use of Response and Request</a>
<br><br>

<!-- implicit objects -->

<%

String serverName=request.getServerName();

out.print("Server Name: "+serverName+"<br>");
out.print("Selvlet Name: "+config.getServletName()+"<br>");
out.print("Server Info: "+application.getServerInfo()+"<br>");
out.print("Page Details: "+page.toString()+"<br>");
pageContext.setAttribute("userid", "test@gmail.com");
out.print("Page Context Attribute: "+pageContext.getAttributesScope("userid"));

%>

</body>
</html>