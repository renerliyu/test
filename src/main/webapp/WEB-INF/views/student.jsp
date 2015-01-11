<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="springTag" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>spring mvc</title>


<style type="text/css">
.error {
	color: red;
	font-size: 5
}
</style>
</head>

<body>
	<table align="center">
		<spring:form method="post" commandName="student" action="saveStudent">
			<center>
				<table border="2">
					<tr>
						<td colspan="2" align="center">Add Student</td>
					</tr>
					<tr>

						<td>Student Number</td>
						<td><spring:input path="sno" /> <spring:errors path="sno" cssClass="error"/></td>
					</tr>
					<tr>
						<td>Student Name</td>
						<td><spring:input path="sname" /> <spring:errors path="sname" cssClass="error"/></td>
					</tr>
					<tr>
						<td>Course</td>
						<td><spring:input path="course" /> <spring:errors path="course" cssClass="error"/></td>
					</tr>
					<tr>
						<td>Fee</td>
						<td><spring:input path="fee" /> <spring:errors path="fee" cssClass="error"/></td>
					</tr>

					<tr>
						<td colspan="2" align="center"><input type="submit" name="saveStudent" value="Save" /></td>
					</tr>
				</table>
			</center>
		</spring:form>
	</table>
</body>
</html>






