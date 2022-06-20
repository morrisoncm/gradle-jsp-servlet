<!DOCTYPE HTML>
<!--
	Solid State by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<jsp:useBean id="daystogo" class="com.demo.web.utils.DateUtils" />
<jsp:useBean id="greetings" class="com.demo.web.domain.Greeting" />
<html>
<head>
<title>Gradle SP and Servlet</title>
<meta charset="utf-8" />
<meta content="width=device-width, initial-scale=1, user-scalable=no"
	name="viewport" />
<link href="assets/css/main.css" rel="stylesheet" />
<noscript>
	<link href="assets/css/noscript.css" rel="stylesheet" />
</noscript>
</head>
<body class="is-preload">
	<div id="page-wrapper">
		<header id="header">
			<h1>Gradle JSP and Servlet</h1>
			<nav>
				<a href="#menu">Menu</a>
			</nav>
		</header>
		<nav id="menu">
			<div class="inner">
				<h2>Menu</h2>
				<ul class="links">
					<li><a href="index.jsp">Log In</a></li>
					<li><a href="index.jsp">Home</a></li>
					<li><a href="index.jsp">Register</a></li>
				</ul>
				<a class="close" href="#">Close</a>
			</div>
		</nav>
		<section id="wrapper">
			<header>
				<div class="inner">
					<h2>Welcome</h2>
					<p><%=greetings.getMessage()%></p>
					<label for="daysToGo"><%=daystogo.daysToNewYear()%> days to
          						go this year.</label>
				</div>
			</header>
		</section>
	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>