<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css"
	integrity="sha256-2pUeJf+y0ltRPSbKOeJh09ipQFYxUdct5nTY6GAXswA="
	crossorigin="anonymous" />
<meta charset="UTF-8">
<title>Hello Spring MVC</title>
</head>
<body>

	<section class="hero is-primary">
		<div class="hero-body">
			<div class="container">
				<h1 class="title">
					<c:out value="${title}" />
				</h1>
				<h2 class="subtitle">${subtitle}</h2>
			</div>
		</div>
	</section>

	<div class="container">
		<div class="notification">
			<a href="/swagger-ui.html">Click here to see Documentation</a>
		</div>
	</div>
</body>
</html>