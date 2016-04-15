<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page session="false"%>
<html>
<head>
<title>Admin Home</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<spring:url value="/resources/css/custom.css" var="customCss" />
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/resources/css/animate.min.css" var="animateCss" />
<spring:url value="/resources/fonts/css/font-awesome.min.css"
	var="fontAwesomeCss" />
<spring:url value="/resources/css/maps/jquery-jvectormap-2.0.3.css"
	var="jvectorCss" />
<spring:url value="/resources/css/icheck/flat/green.css" var="greenCss" />
<spring:url value="/resources/css/floatexamples.css" var="floatExample" />

<spring:url value="/resources/js/jquery.min.js" var="jQuery" />
<spring:url value="/resources/js/nprogress.js" var="nprogress" />

<link rel="text/css" href="${customCss}" />

<link href="${bootstrapCss}" rel="stylesheet">

<link href="${fontAwesomeCss}" rel="stylesheet">
<link href="${animateCss }" rel="stylesheet">

<!-- Custom styling plus plugins -->
<link href="${customCss}" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${jvectorCss}" />
<link href="${greenCss}" rel="stylesheet" />
<link href="${floatExample }" rel="stylesheet" type="text/css" />

<script src="${jQuery }"></script>
<script src="${ nprogress}"></script>

<!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>

<body class="nav-md">

	<div class="container body">


		<div class="main_container">