<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>XML TAG Example</h1>

<br>
<c:set var="books">
		<books>
				<book>
						<name>The Complete Reference</name>
						<author>Mac Grow</author>
				</book>
				<book>
						<name>Origin of Species</name>
						<author>Charls Darwin</author>
				</book>
		
		</books>

</c:set>


<x:parse xml="${books }" var="data"></x:parse>


1st book Name: <x:out select="$data/books/book[1]/name"/><br><br>
2nd book Author: <x:out select="$data/books/book[2]/author"/>



</body>
</html>