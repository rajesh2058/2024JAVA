<%@ page import="java.sql.*" %>
<%
	String id=request.getParameter("id");
	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			PreparedStatement pre=con.prepareStatement("delete from user where id=?");
			pre.setInt(1,Integer.parseInt(id));
			pre.execute();
			pre.close();
			response.sendRedirect("day6userview.jsp");
	} catch(Exception e) {
			e.printStackTrace();
	}

%>
