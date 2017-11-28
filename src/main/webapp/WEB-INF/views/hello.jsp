
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Second Page</title>
	</head>
	<body>
		<h2>Accesing to another page via URL using controller</h2>
		<p>Greetings, it's now <c:out value="${result.now}" default="STFU" /> </p>
		
		<h3>Products</h3>
		<c:forEach items="${result.products}" var="prod">
			<c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
		</c:forEach>
		<br>
    		<a href="<c:url value="priceincrease"/>">Increase Prices</a>
    	<br>
	</body>
</html>