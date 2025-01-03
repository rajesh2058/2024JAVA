<%@ page import="java.sql.*" %>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String rem = request.getParameter("remember");

    // Provide default values if name or email is null
    if (name == null) {
        name = "";
    }
    if (email == null) {
        email = "";
    }

    // Sanitize values to ensure they are cookie-safe
    name = name.replaceAll("[,;\\s]", "_"); // Replace invalid characters with '_'
    email = email.replaceAll("[,;\\s]", "_");

    // Handle "Remember Me" feature
    if (rem != null) {
        Cookie nameCookie = new Cookie("REMEMBER", name);
        Cookie emailCookie = new Cookie("EMAIL", email);
        nameCookie.setMaxAge(60 * 60 * 24 * 7); // 1 week
        emailCookie.setMaxAge(60 * 60 * 24 * 7); // 1 week
        response.addCookie(nameCookie);
        response.addCookie(emailCookie);
    } else {
        Cookie nameCookie = new Cookie("REMEMBER", "NO");
        Cookie emailCookie = new Cookie("EMAIL", "NO");
        nameCookie.setMaxAge(0); // Remove the cookie
        emailCookie.setMaxAge(0); // Remove the cookie
        response.addCookie(nameCookie);
        response.addCookie(emailCookie);
    }

    boolean isValid = false;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

        // Prepare statement to validate user credentials
        PreparedStatement pre = con.prepareStatement(
            "SELECT * FROM user WHERE name = ? AND email = ? AND password = ?"
        );
        pre.setString(1, name);
        pre.setString(2, email);
        pre.setString(3, password);

        ResultSet rs = pre.executeQuery();
        isValid = rs.next(); // Check if at least one record matches
        rs.close();
        pre.close();
        con.close(); // Close connection after use
    } catch (Exception e) {
        e.printStackTrace();
    }

    // Redirect based on login validity
    if (isValid) {
        session.setAttribute("NAME", name); // Store the username in session
        response.sendRedirect("day6home.jsp"); // Redirect to the home page
    } else {
        response.sendRedirect("day6login.jsp?message=Invalid Login"); // Redirect back to login with error
    }
%>
