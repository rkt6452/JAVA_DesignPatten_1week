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

		try {
			String sql = "INSERT INTO member(id, passwd, name) values('" + id + "','" + passwd + "','" + name
					+ "',)";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			out.println("member테이블 삽입이 성공햇습니다.");
		} catch (SQLException ex) {
			out.println("member테이블 삽입이 실패햇습니다.");
			out.println("SQLException: " + ex.getMessage());
			;
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	%>
</body>
</html>