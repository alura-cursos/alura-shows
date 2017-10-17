<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Casa de show</title>
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/carousel.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/datepicker.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
</head>

<body>
	<div class="navbar-wrapper">
		<nav class="navbar navbar-inverse navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="<c:url value="/"/>" /><strong>Home</strong></a></li>
						<c:if test="${empty usuario.email}">
							<li><a href='<c:url value="/usuario"/>' /><strong>Usuário</strong></a></li>
						</c:if>
						<c:if test="${not empty usuario.email}">
							<li><a href='<c:url value="/usuarioLogado"/>' /><strong>Perfil</strong></a></li>
						</c:if>
						<li><a href='<c:url value="/depoimento"/>' /><strong>Depoimentos</strong></a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>