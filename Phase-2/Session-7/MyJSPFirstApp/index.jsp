<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Scriptlet -->

<% out.print("Hello World") ;%>
<br>

<%
 
int a=10;
int b=20;
int c=a+b;

out.print("Result is: "+c);

%>
<br>


<!-- Declaration -->
<%! String name="Nikunj Soni"; %>

<!-- Expression -->
<h1><%= "My Name is "+name %></h1>


<%! int cube(int  n){
	
	return n*n*n;
}
%>

<br>
<%= "Cube of 5 is :"+cube(5) %>
<br>

<%="Today is: "+ new Date() %>
</body>
</html>