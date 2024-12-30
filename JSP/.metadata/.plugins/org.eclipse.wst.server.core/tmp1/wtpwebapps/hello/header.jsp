<%
	String name=(String)session.getAttribute("NAME");
	if(null==name) {
		response.sendRedirect("login.jsp?message=invalid session");
	}
%>
<h1>Wel-come to my site</h1>