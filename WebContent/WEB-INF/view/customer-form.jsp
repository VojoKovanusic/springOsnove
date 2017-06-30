<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<title>Insert title here</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

<style>
.erorKojiJaHocu {
	color: red
}
</style>

</head>
<body bgcolor=#0099ff>
	<div id="wraper">

		<div id="header">
			<b>ADD CUSTOMER:</b>
		</div>
	</div>

	<div id="container">
		<h6>Fill blank fields:</h6>
		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST">
			<!-- potrebno je da asociate ovaj podatak sasa customer id -->
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /> <form:errors
								path="lastName" cssClass="erorKojiJaHocu" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label>Salary:</label></td>
						<td><form:input path="salary" /></td>
					</tr>
				
					<tr>
						<td><label>Jib:</label></td>
						<td><form:input path="jib" /></td>

					</tr>
					<tr>
						<td><label>Phone:</label></td>
						<td><form:input path="phoneNumber" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save!" class="save" /></td>
					</tr>
				</tbody>

			</table>

		</form:form>
		<!-- bec to customer list -->
		<div style=""></div>
		<p>
			<input type="button" value="MAIN MENU"
				onclick="window.location.href='list';return false;"
				class="add-button" /> <a
				href="${pageContext.request.contextPath}/customer/list"> Back to
				list customer in DB</a>
		</p>
	</div>
	

</body>
</html>