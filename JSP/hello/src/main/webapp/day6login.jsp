<title>Login</title>
<style>
    /* General Styles */
    body {
        font-family: Arial, sans-serif;
        background-color: #f9f9f9;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    /* Form Container */
    .form-container {
        background-color: #ffffff;
        padding: 30px 40px;
        border-radius: 8px;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        width: 300px;
    }

    /* Error Message */
    .error-message {
        color: red;
        font-size: 14px;
        text-align: center;
        margin-bottom: 20px;
    }

    /* Form Heading */
    .form-container h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #333;
    }

    /* Input Fields */
    .form-container input[type="text"],
    .form-container input[type="password"],
    .form-container input[type="email"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0 20px 0;
        border: 1px solid #ddd;
        border-radius: 4px;
        font-size: 14px;
    }

    /* Submit Button */
    .form-container input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 15px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        width: 100%;
        font-size: 16px;
        font-weight: bold;
        transition: background-color 0.3s ease;
    }

    .form-container input[type="submit"]:hover {
        background-color: #45a049;
    }

    /* Link Styles */
    .form-container a {
        text-decoration: none;
        color: #4CAF50;
        font-size: 14px;
        display: block;
        text-align: center;
        margin-top: 10px;
    }

    .form-container a:hover {
        text-decoration: underline;
    }
</style>
<div class="form-container">
    <h2>Login</h2>
    <% String message = request.getParameter("message"); if (message != null) { %>
        <font color="red"><%= message %></font>
    <% } %>

    <% 
        String name = "";
        String email = "";
        String check = "";
        Cookie[] c = request.getCookies();
        if (c != null) {
            for (Cookie ci : c) {
                if (ci.getName().equals("REMEMBER")) {
                    String v = ci.getValue();
                    if (!v.equals("NO")) {
                        name = v;
                        check = "checked";
                    }
                } else if (ci.getName().equals("EMAIL")) {
                    email = ci.getValue();
                }
            }
        }
    %>

    <form method="post" action="day6logincheck.jsp">
        User Name:
        <input type="text" name="name" value="<%=name %>"><br>
        Email:
        <input type="email" name="email" value="<%=email %>" placeholder="Enter your email"><br>
        Password:
        <input type="password" name="password"><br>
        <input type="checkbox" name="remember" value="Yes" <%=check %>> Remember Me<br>
        <input type="submit" value="Login">
    </form>
    <a href="day6register.jsp">Don't have an account? Register here</a>
</div>
