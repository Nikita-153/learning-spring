<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="student">
	
	Firstname: <form:input path="firstName"/> 
	<br>

	Lastname: <form:input path="lastName"/>
	<br>
	 
	<!--  
	<form:select path="country">
		<form:option value="Brazil" label="Brazil"/>
		<form:option value="France" label="France"/>
		<form:option value="Japan" label="Japan"/>
		<form:option value="Italy" label="Italy"/>
	</form:select>
	Instead of hard coding values on form get it from java code
	 -->
	
	<!-- Drop down Dynamic 
	 <form:select path="country">
		<form:options items="${student.countryOptions}"/>		
	</form:select>
	
	--> 
	
	<!-- Radio buttons Dynamic -->
	
	<form:radiobuttons path="country" items="${student.countryOptions}"  />
	
	<input type=submit value="Submit"/>
	
	</form:form>
</body>
</html>