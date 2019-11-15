<%@page contentType="text/html;charset=utf-8"%>
<%@page import="java.sql.*"%>
<html>
<head><title></title></head>
<body>
<%@include file="dbconn.jsp"%>
<%
request.setCharacterEncoding("utf-8");

String id=request.getParameter("id");
String passwd=request.getParameter("passwd");
String name=request.getParameter("name");

ResultSet rs = null;
PreparedStatement pstmt=null;

try{
	String sql ="select id,passwd from member where id=?";
	pstmt=conn.prepareStatement(sql);
	pstmt.setString(1,id);
	rs=pstmt.executeQuery();
	if(rs.next()){
		String rId=rs.getString("id");
		String rPasswd=rs.getString("passwd");
		
		if(id.equals(rId)&&passwd.equals(rPasswd)){
			sql = "update member set name=? where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,id);
			pstmt.executeUpdate();
			out.println("member table update");
		}else 
			out.println("not correct password");
	}else
		out.println("no id in member table");

}catch(SQLException ex){
	out.println("SQLException: "+ex.getMessage());
}finally{
	if(pstmt!=null)
		pstmt.close();
	if(conn!=null)
		conn.close();
}
%>
</body>
</html>