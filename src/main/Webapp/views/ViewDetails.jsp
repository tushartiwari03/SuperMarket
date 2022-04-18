<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>name</th>
<th>quantity</th>
<th>dateOfAdding<th>
</tr>
<c:forEach items="${listToDisplay}" var="var">
<tr>
<td>
${var.name}
</td>
<td>
${var.quantity }
</td>
<td>
${var.dateOfAdding}
</td>
</tr>
</c:forEach>
</table>
</body>
</html>
