<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="java.sql.*"%>
<html>
<head>
<title>Database SQL</title>
</head>
<body>
	<%@ include file="dbconn.jsp"%>
	<%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String passwd = request.getParameter("passwd");
String name = request.getParameter("name");

Statement stmt = null;

try{
	String sql = "INSERT INTO member(id, password, name) values('"+id+"','"+passwd+"','"+name+"')";
	stmt = conn.createStatement();
	stmt.executeUpdate(sql);
	out.println("mamber 테이블 삽입 성공");	
} catch (SQLException ex) {
	out.println("member테이블 삽입이 실패했습니다.<br>");
	out.println("SQLException : " + ex.getMessage());
} finally {
	if(stmt != null)
		stmt.close();
	if(conn != null)
		conn.close();
}
%>
</body>
</html>