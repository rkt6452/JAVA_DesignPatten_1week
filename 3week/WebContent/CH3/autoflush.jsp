<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page buffer = "1kb" autoFlush = "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>버퍼 테스트</title>
</head>
<body>
<% for(int i = 0 ; i<2000; i++)  { %>
ABC
<% } %>
</body>
</html>