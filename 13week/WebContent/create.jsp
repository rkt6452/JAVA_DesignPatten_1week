<%@ page contentType="text/html;charset-utf-8"%>
<%@ page language="java" import="java.sql.*"%>
<%
	Connection conn = null;
	Statement st = null;
	ResultSet re = null;

	try {
		Class.forName("org.gjt.mm.mysql.Driver");
	} catch (ClassNotFoundException e) {
		out.println(e);
	}
	try {
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/jspbookdb?characterEncoding=UTF-8&serverTimezone=UTC", "root",
				"1234");
	} catch (SQLException e) {
		out.println(e);
	}
	try {
		st = conn.createStatement();
		st.executeUpdate(
				"create table member(id varchar(20) primary key, passwd varchar(20), name varchar(30))");
	} catch (SQLException e) {
		out.println(e);
	}
	
		st.close();
		conn.close();
	
%>