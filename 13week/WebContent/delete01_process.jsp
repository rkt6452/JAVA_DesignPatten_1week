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

		ResultSet rs = null;
		Statement stmt = null;

		try {
			String sql = "select id, passed from member where id = '"+id+"'";
			
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
			if(rs.next()) {
				String rid = rs.getString("id");
				String rpasswd = rs.getString("passwd");
				
				if(id.equals(rid)&&passwd.equals(rpasswd)) {
					sql = "delete from member where id = '"+id+"' and	passwd = '"+passwd+"'";
					stmt = conn.createStatement();
					stmt.excuteUpdate(sql);
					out.println("member테이블 삭제했습니다.");
				}else
					out.println("wrong password.");
			}else
				out.println("wrong id.");
			
		} catch (SQLException ex) {
			out.println("SQLException: " + ex.getMessage());
			;
		} finally {

			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	%>
</body>
</html>