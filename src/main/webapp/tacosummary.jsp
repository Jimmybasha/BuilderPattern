<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="builderpattern.Taco" %>
<!DOCTYPE html>
<html>
<head>
<title>Taco Order summary</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h2>Taco Order Summary</h2>
		<p>
			<strong>Size:</strong> ${taco.size}
		</p>
		<p>
			<strong>sauces:</strong> ${taco.sauceType}
		</p>
		<p>
			<strong>Fillings:</strong>
		</p>
		<ul>
			<%
    Taco taco = (Taco) request.getAttribute("taco");
    if (taco != null && taco.getFillings() != null) {
        for(String fillings : taco.getFillings()) {
%>
			<li>${fillings} </li>
			<%
        }
    }
%>
		</ul>
		<a href="orderTaco.jsp" class="btn btn-primary">Order Another Taco </a>
	</div>
</body>
</html>