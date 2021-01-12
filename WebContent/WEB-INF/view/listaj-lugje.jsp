<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>

<html>
<head>
	<title>List Customers</title>
	<link type="text/css" rel="stylesheet"
	 href="${pageContext.request.contextPath}/resources/css/style.css">
	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Lista na clenovi vo bibliotekata</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			
			<input type="button" value="Dodaj Clen"
				onclick="window.location.href='pokaziFormaZaNovClen'; return false;"
				class="add-button"
				/>
			
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Date of Birth</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="tempPerson" items="${lugje}">
				<c:url var="updateLink" value="/biblioteka/pokaziFormaZaUpdate">
					<c:param name="covekID" value="${tempPerson.embg}"></c:param>
				</c:url>
				
					<tr>
						<td> ${tempPerson.ime} </td>
						<td> ${tempPerson.prezime} </td>
						<td> ${tempPerson.datumRagjanje} </td>
						<td> 
							<a href="${updateLink}">Update</a>
						 </td>
					
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>