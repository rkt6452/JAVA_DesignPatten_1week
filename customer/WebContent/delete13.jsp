<%@ page contentType="text/html; charset=utf-8" %> 
<%@ page language="java" import="java.sql.*" %> 
<%
String id = request.getParameter("id");
Connection con=null;
Statement st=null;    
String sql=null;

// jdbc-odbc driver 등록
try {
//	Class.forName("com.mysql.jdbc.Driver");
	Class.forName("org.gjt.mm.mysql.Driver");
   } catch (ClassNotFoundException e){
     out.println(e.getMessage());
   }
// db와의 연결
try {
   con = DriverManager.getConnection("jdbc:mysql://jdbc:mysql://localhost:3306/jspbookdb?characterEncoding=UTF-8&serverTimezone=UTC","root","1234");
    
   // Statement 객체 생성
   st = con.createStatement();
   sql = "delete from member where id= '"+id+"'";
   st.executeUpdate(sql);

   con.close();
   st.close();  
   } catch (SQLException e) {
   }
 %>
<jsp:forward page="start.html" />