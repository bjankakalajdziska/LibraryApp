<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
	
		<title>Dodadi Clen</title>
		<link type="text/css" rel="stylesheet"
	 href="${pageContext.request.contextPath}/resources/css/style.css">
	 <link type="text/css" rel="stylesheet"
	 href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
	 
	</head>
	
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>Forma za clenstvo</h2>
			</div>
		</div>
		
		<div id="container">
		<h3>Dodadi clen</h3>
			<form:form action="zacuvajClen" modelAttribute="clen" method="POST">
			
				<table>
					<tbody>
					
						<tr>
							<td><label>EMBG:</label></td>
							<td><form:input path="embg"/></td>
						</tr>
						
						<tr>
							<td><label>Ime:</label></td>
							<td><form:input path="ime"/></td>
						</tr>
						
						<tr>
							<td><label>Prezime:</label></td>
							<td><form:input path="prezime"/></td>
						</tr>
						
						<tr>
							<td><label>Datum na ragjanje:</label></td>
							<td><form:input path="datumRagjanje"/></td>
						</tr>
						
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save" /></td>
						</tr>
						
					</tbody>
				</table>
			
			</form:form>
			
			<div style="clear; both;"></div>
			<p>
				<a href="${pageContext.request.contextPath}/biblioteka/list">Nazad do listata</a>
			</p>
		</div>
	</body>
</html>