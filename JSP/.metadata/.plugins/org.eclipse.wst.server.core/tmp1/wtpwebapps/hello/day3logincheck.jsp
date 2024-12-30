<% 
String name = request.getParameter("name");
String password = request.getParameter("password");

if (name.equals("cosmos") && password.equals("cosmos")){
	response.sendRedirect("day3home.jsp");

}
else{
	response.sendRedirect("Day-3.jsp?message = Invalid Login");
}
%>