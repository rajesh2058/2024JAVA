<%@ page import="java.sql.*"%>
<%
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
	PreparedStatement pre=con.prepareStatement("insert into user(name,password,email) values(?,?,?)");
	pre.setString(1,name);
	pre.setString(2,password);
	pre.setString(3,email);
	pre.execute();
	response.sendRedirect("day6home.jsp");
	} catch(Exception e) {
		e.printStackTrace();
	}
%>
