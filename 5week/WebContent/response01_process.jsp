<%@ page contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>implict objects</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String userid = request.getParameter("id");
String password = request.getParameter("pass");

if (userid.equals("관리자") && password.equals("1234")) {
	response.sendRedirect("response01_success.jsp");
}
else {
	response.sendRedirect("response01_failed.jsp");
}//if문 시험에 나옴

%>
</body>
</html>