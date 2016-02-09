<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<html>
<head>
	<title> SringBoard</title>	
</head>
<body>

<table>
<c:forEach items="${results}" var="result">
<tr>
 <td>${result.no}</td>
 <td>${result.title}</td>
 <td>${result.content}</td>
</tr>
</c:forEach>
</table>


</body>
</html>
