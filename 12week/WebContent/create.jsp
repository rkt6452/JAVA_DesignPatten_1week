<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="java.sql.*"%>
<% 
Connection conn = null;
Statement st = null;
ResultSet rs = null;

try{
	Class.forName("org.git.mm.mysql.Driver");
} catch(ClassNotFoundException e) {
	out.println(e);
}
try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspbookdb?characterEncoding=UTF-8&serverTimezone=UTC","root","1234");
}catch(SQLException e){
	out.println(e);
}
try {
	   st = conn.createStatement();
	   st.executeUpdate("create table member(id varchar(20) primary key, passwd varchar(20), name varchar(30))");
	   }catch (SQLException e) {
	    out.println(e);
  }
try {
	   rs=st.executeQuery("select * from member");
	   ResultSetMetaData rsmd = rs.getMetaData();
	   out.println("새로운 테이블이 생성되었습니다.<BR>");
	   out.println(rsmd.getColumnCount()+"개의 컬럼(필드)을 가지고 있으며<BR>");
	   out.println("첫번째 컬럼은 "+ rsmd.getColumnName(1)+"<BR>");
	   out.println("두번째 컬럼은 "+ rsmd.getColumnName(2)+"<BR>");
	   out.println("첫번째 컬럼은 "+ rsmd.getColumnName(3)+"<BR>");
	   out.println("두번째 컬럼은 "+ rsmd.getColumnName(4)+"<BR>");
	   rs.close();
	   st.close();
	   conn.close();
}catch (SQLException e) {
	    out.println(e);
}
%>