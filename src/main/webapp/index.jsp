<jsp:useBean id="daystogo" class="com.demo.web.utils.DateUtils" />
<!DOCTYPE html>
<html>
<head>
<title>Gradle JSP Servlet</title>
</head>
<body>
	<p><%=daystogo.daysToNewYear()%>
		days to go this year. Learn Gradle now!
	</p>
</body>
</html>