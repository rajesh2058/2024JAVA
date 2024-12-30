<%
	String name=request.getParameter("name");
	String password=request.getParameter("password");

	if(name.equals("cosmos") && password.equals("cosmos")){
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("login.jsp?message=Invalid Loogin"); // ?message = Query String
	}
%>
                <h3 style="color: red;">Invalid username or password. Please try again.</h3>
		<% %>
