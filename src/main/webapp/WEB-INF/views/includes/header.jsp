<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Eshop Shop | Home</title>

<!-- Font awesome -->
<link
	href="<spring:url value='/resources/front/css/font-awesome.css'></spring:url>"
	rel="stylesheet">
<!-- Bootstrap -->
<link
	href="<spring:url value='/resources/front/css/bootstrap.css'></spring:url>"
	rel="stylesheet">
<!-- SmartMenus jQuery Bootstrap Addon CSS -->
<link
	href="<spring:url value='/resources/front/css/jquery.smartmenus.bootstrap.css'></spring:url>"
	rel="stylesheet">
<!-- Product view slider -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value='/resources/front/css/jquery.simpleLens.css'></spring:url>">
<!-- slick slider -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value='/resources/front/css/slick.css'></spring:url>">
<!-- price picker slider -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value='/resources/front/css/nouislider.css'></spring:url>">
<!-- Theme color -->
<link id="switcher"
	href="<spring:url value='/resources/front/css/theme-color/default-theme.css'></spring:url>"
	rel="stylesheet">
<!-- <link id="switcher" href="css/theme-color/bridge-theme.css" rel="stylesheet"> -->
<!-- Top Slider CSS -->
<link
	href="<spring:url value='/resources/front/css/sequence-theme.modern-slide-in.css'></spring:url>"
	rel="stylesheet" media="all">

<!-- Main style sheet -->
<link
	href="<spring:url value='/resources/front/css/style.css'></spring:url>"
	rel="stylesheet">

<!-- Google Font -->
<link href='https://fonts.googleapis.com/css?family=Lato'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Raleway'
	rel='stylesheet' type='text/css'>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>
<body>
	<!-- wpf loader Two -->
	<div id="wpf-loader-two">
		<div class="wpf-loader-two-inner">
			<span>Loading</span>
		</div>
	</div>
	<!-- / wpf loader Two -->
	<!-- SCROLL TOP BUTTON -->
	<a class="scrollToTop" href="#"><i class="fa fa-chevron-up"></i></a>
	<!-- END SCROLL TOP BUTTON -->


	<!-- Start header section -->
	<header id="aa-header">


		<!-- start header top  -->
		<div class="aa-header-top">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="aa-header-top-area">
							<!-- start header top left -->
							<div class="aa-header-top-left">
								<!-- start language -->
								
								<!-- / language -->

								<!-- start currency -->
								<div class="aa-currency">
									<div class="dropdown">
										<a class="btn dropdown-toggle" href="#" type="button"
											id="dropdownMenu1" data-toggle="dropdown"
											aria-haspopup="true" aria-expanded="true"> <i
											class="fa fa-usd"></i>USD <span class="caret"></span>
										</a>
										<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
											<li><a href="#"><i class="fa fa-euro"></i>EURO</a></li>
											<li><a href="#"><i class="fa fa-jpy"></i>YEN</a></li>
										</ul>
									</div>
								</div>
								<!-- / currency -->
								<!-- start cellphone -->
								<div class="cellphone hidden-xs">
									<p>
										<span class="fa fa-phone"></span>00-62-658-658
									</p>
								</div>
								<!-- / cellphone -->
							</div>
							<!-- / header top left -->
							<div class="aa-header-top-right">
								<ul class="aa-head-top-nav-right">
									<li><a href="account.html">My Account</a></li>
									<li class="hidden-xs"><a href="wishlist.html">Wishlist</a></li>
									<li class="hidden-xs"><a href="cart.html">My Cart</a></li>
									<li class="hidden-xs"><a href="checkout.html">Checkout</a></li>
									<li><a href="" data-toggle="modal"
										data-target="#login-modal">Login</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- / header top  -->

		<!-- start header bottom  -->
		<div class="aa-header-bottom">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="aa-header-bottom-area">
							<!-- logo  -->
							<div class="aa-logo">
								<!-- Text based logo -->
								<a href="/eshop"> <span class="fa fa-shopping-cart"></span>
									<p>
										e<strong>Shop</strong> <span>Your Shopping Partner</span>
									</p>
								</a>
								<!-- img based logo -->
								<!-- <a href="index.html"><img src="img/logo.jpg" alt="logo img"></a> -->
							</div>
							<!-- / logo  -->
							<!-- cart box -->
							<div class="aa-cartbox">
								<a class="aa-cart-link" href="#"> <span
									class="fa fa-shopping-basket"></span> <span
									class="aa-cart-title">SHOPPING CART</span> <span
									class="aa-cart-notify">2</span>
								</a>
								<div class="aa-cartbox-summary">
									<ul>
										<li><a class="aa-cartbox-img" href="#"><img
												src="img/woman-small-2.jpg" alt="img"></a>
											<div class="aa-cartbox-info">
												<h4>
													<a href="#">Product Name</a>
												</h4>
												<p>1 x $250</p>
											</div> <a class="aa-remove-product" href="#"><span
												class="fa fa-times"></span></a></li>
										<li><a class="aa-cartbox-img" href="#"><img
												src="img/woman-small-1.jpg" alt="img"></a>
											<div class="aa-cartbox-info">
												<h4>
													<a href="#">Product Name</a>
												</h4>
												<p>1 x $250</p>
											</div> <a class="aa-remove-product" href="#"><span
												class="fa fa-times"></span></a></li>
										<li><span class="aa-cartbox-total-title"> Total </span> <span
											class="aa-cartbox-total-price"> $500 </span></li>
									</ul>
									<a class="aa-cartbox-checkout aa-primary-btn"
										href="checkout.html">Checkout</a>
								</div>
							</div>
							<!-- / cart box -->
							<!-- search box -->
							<div class="aa-search-box">
								<form action="">
									<input type="text" name="" id=""
										placeholder="Search here ex. 'man' ">
									<button type="submit">
										<span class="fa fa-search"></span>
									</button>
								</form>
							</div>
							<!-- / search box -->
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- / header bottom  -->

		<!-- / header section -->
		<!-- menu -->
		<section id="menu">
			<div class="container">
				<div class="menu-area">
					<!-- Navbar -->
					<div class="navbar navbar-default" role="navigation">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
						</div>
						<div class="navbar-collapse collapse">
							<!-- Left nav -->
							<ul class="nav navbar-nav">
								<li><a href="/">Home</a></li>
								<c:forEach var="category" items="${categories}">
									<li><a href="/eshop/category/${category.categoryId }">${category.name }</a></li>
								</c:forEach>
								
							</ul>
						</div>
						<!--/.nav-collapse -->
					</div>
				</div>
			</div>
		</section>
		<!-- / menu -->
	</header>