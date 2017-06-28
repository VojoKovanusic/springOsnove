<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<title>Insert title here</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>
<body bgcolor="red">
	<div id="wraper">

		<div id="header">
			<h2>ADD CUSTOMER.....</h2>
		</div>
	</div>

	<div id="container">
		<h3>Fill blank fields:</h3>
		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST">
			<!-- potrebno je da asociate ovaj podatak sasa customer id -->
			<form:hidden path="id"/>
			<table>
				<tbody >
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>

					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>

					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>

					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save!" class="save" /></td>


					</tr>
				</tbody>


			</table>

		</form:form>
<!-- bec to customer list -->
<div style="clear;both;"> </div >
<p>

<a href="${pageContext.request.contextPath}/customer/list"> Back to list customer in DB</a>
</p>
	</div>
</body>
</html>