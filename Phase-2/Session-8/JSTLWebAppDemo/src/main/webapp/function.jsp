<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Function TAG Demo</h1>

<br>

<c:set var="name" value="Simplilearn"></c:set>
<c:set var="name1" value="learn"></c:set>


LowerCase:  ${fn:toLowerCase(name) }<br>
UPPERCASE:  ${fn:toUpperCase(name) }<br>


<c:if test="${fn:contains(name,name1) }">
			
				String contains the defined Value<br>

</c:if>



<c:set var="str" value="Hello Wolrd Message"></c:set>
<c:set var="str1" value="${fn:split(str,' ') }"></c:set>


${fn:join(str1,' - ') }<br>

Substring : ${fn:substring(name,0,6) }<br>


<c:forEach items="${str1 }" var="x">

			<c:out value="${fn:toUpperCase(x) }"></c:out><br>
			
</c:forEach>

</body>

</html>