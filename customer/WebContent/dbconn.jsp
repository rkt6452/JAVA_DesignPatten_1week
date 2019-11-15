<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="java.sql.*" %>
<% 
Connection conn = null;
String url = "jdbc:mysql://localhost:3306/jspbookdb?characterEncoding=UTF-8&serverTimezone=UTC";
String user="root";
String password="1234";

Class.forName("com.mysql.jdbc.Driver");
conn = DriverManager.getConnection(url, user, password);
%>