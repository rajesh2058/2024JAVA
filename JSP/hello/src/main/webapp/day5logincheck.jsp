<% 
String rem = request.getParameter("remember");
if(rem != null){
	String n = request.getParameter("name");
	Cookie c = new Cookie("REMEMBER", n);
	response.addCookie(c);
	response.sendRedirect("day5home.jsp");

	
}
else
{
	Cookie c = new Cookie("REMEMBER","NO");
	response.addCookie(c);
	response.sendRedirect("day5home.jsp");
}
%>