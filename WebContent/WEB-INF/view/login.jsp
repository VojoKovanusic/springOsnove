<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<title>FIRIST WEB APP</title>
<style>.erorKojiJaHocu{
	color: red;
}</style>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">


</head>
<body bgcolor="#3399ff">
	<div id="wraper">

		<div id="header" align="center" >
			<b >WELCOME TO LOGING PAGE</b>
		</div>
	</div>

	 
		<h6>Fill blank fields:</h6>
		<form:form action="validateAdmin" modelAttribute="admin"
			method="POST">
			<!-- potrebno je da asociate ovaj podatak sasa customer id -->
		 
			<table>
				<tbody>
					<tr>
						<td><label>Username(*):</label></td>
						<td><form:input path="name" />  
					</tr>
					<tr>
						<td><label>Password(*):</label></td>
						<td><br><form:input path="pass" />
						
						<br><br>
						 ${admin.msg}   
					<tr>
						 
					
					 
					<tr>
				
						<td><label></label></td>
						<td><input type="submit" value="Login !" class="save" /></td>
					</tr>

				</tbody>

			</table>

		</form:form>
		 
 


</body>
</html>