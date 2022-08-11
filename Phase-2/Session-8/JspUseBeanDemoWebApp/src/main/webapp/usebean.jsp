<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- id is an object of class -->
<jsp:useBean id="obj" class="com.simplilearn.demo.Student" scope="session"></jsp:useBean>

<h3>Value Before Set</h3>


<!-- Let's Call getter Setter Method -->

Roll No: <jsp:getProperty property="rollNo" name="obj"/><br>
Name: <jsp:getProperty property="name" name="obj"/><br>


<!-- let's  try to set some value -->


<jsp:setProperty property="rollNo" name="obj" value="20"/><br>
<jsp:setProperty property="name" name="obj" value="Nikunj Soni"/><br>


<h3> Value After Set</h3>

<!-- Let's Call getter Setter Method -->

Roll No: <jsp:getProperty property="rollNo" name="obj"/><br>
Name: <jsp:getProperty property="name" name="obj"/><br>
<br>

<a href="next.jsp">Next Page</a>
</body>
</html>