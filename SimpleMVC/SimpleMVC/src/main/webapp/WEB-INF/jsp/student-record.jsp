<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.ibm.training.bootcamp.simplemvc.model.Student"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Record</title>
</head>
<body>
	<%
		if (request.getAttribute("studentRecord") != null) {
			Student student = (Student) request.getAttribute("studentRecord");
	%>

	<h1>Student Record</h1>
	<div>
		ID:
		<%=student.getId()%></div>
	<div>
		First Name:
		<%=student.getFirstName()%></div>
	<div>
		Last Name:
		<%=student.getLastName()%></div>

	<%
		} else {
	%>

	<h1>No student record found.</h1>

	<%
		}
	%>
	<form action="./studentrecord">
		Student ID No.: <input type="text" name="id" /><input type="submit"
			name="Submit" value="Find Student" />
	</form>
</body>
</html>

</body>
</html>