<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Formatting Demo</h1>

<c:set var="num" value="1234.5678"></c:set>

<h2>Formatting Number</h2><br>
<!-- grouping=true will print coma between numbers  -->

Number: <fmt:formatNumber maxFractionDigits="2" value="${num }"></fmt:formatNumber><br>

<fmt:formatNumber maxFractionDigits="2" groupingUsed="true"  value="${num }" var="newNum"></fmt:formatNumber>

old: <c:out value="${num }"></c:out><br>

New Number: <c:out value="${newNum }"></c:out>
<br>



<h2>Formatting Date</h2>

<c:set var="today" value="<%=new Date() %>"></c:set>

Small Date: <fmt:formatDate value="${today }" dateStyle="short" timeStyle="short" type="both"/><br>
Medium Date: <fmt:formatDate value="${today }" dateStyle="medium" timeStyle="medium" type="both"/><br>
Long Date: <fmt:formatDate value="${today }" dateStyle="long" timeStyle="long" type="both"/><br>

Formatted Date: <fmt:formatDate value="${today }" pattern="yyyy-MM-dd"/>


</body>
</html>