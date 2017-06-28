<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>LIST CUSTOMER</title>
<!-- references our style sheet -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body bgcolor="#3399ff">

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager </h2>
			<p>in:list-customer.jsp</p>
		</div>
	</div>

	<div id="container">

		<div id="content">
			<!-- dodavanj
			e dugmeta  -->
			<input type="button" value="Add customer"
				onclick="window.location.href='showFormADD';return false;"
				class="add-button" />
			
				 <input type="button" value="Sort by: Salary"
				onclick="window.location.href='sortBySalary';return false;"
				class="add-button" />
				
				 <input type="button" value="Sort by: Last name"
				onclick="window.location.href='list';return false;"
				class="add-button" />
				
			<table>

				<tr>

					<th>First name:</th>
					<th>Last Name:</th>
					<th>Email:</th>
					<th>Salary:</th>
					<th>Bruto salary:</th>
					<th>JIB:</th>
					<th>Phone number:</th>
					<th>Action</th>
                    

				</tr>

				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				
					<!-- construct an "UPDATE" link with customer id -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>	
					
					<!-- construct an "DELETE" link with customer id -->
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						<td> ${tempCustomer.salary} </td>
						<td> ${tempCustomer.brutoSalary} </td>
						<td> ${tempCustomer.jib} </td>
						<td> ${tempCustomer.phoneNumber} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
						
							<a href="${deleteLink}"
							onclick="if(!(confirm('Are you sure you wont to delete customrer?')))return false">Delete </a>
						</td>
					
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









