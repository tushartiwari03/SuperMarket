<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter 1 to list the items</h1>
	<h2>Enter 2 to add the items</h2>
	<h3>Enter 3 to delete an item</h3>

	<form method="post" action="/create">

  <label  for="choice">choice (between 1 and 3):</label>
  <input type="number" id="choice" name="choice" min="1" max="3">
  <input type="submit"/> 
</form>

</body>
</html>