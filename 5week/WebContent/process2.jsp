<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>implicit</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	%>
	<p> 이름 : <%=name%>
</body>
</html>