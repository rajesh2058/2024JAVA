<%@ page import="java.sql.*" %>

<style>
    /* General Page Styles */
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f9f9f9;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    /* Form Container */
    .form-container {
        background: #ffffff;
        padding: 30px 40px;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        width: 400px;
        text-align: center;
    }

    h2 {
        color: #4CAF50;
        font-size: 24px;
        margin-bottom: 20px;
    }

    label {
        display: block;
        margin: 10px 0 5px;
        font-weight: bold;
        color: #333;
    }

    input[type="text"], input[type="email"], input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ddd;
        border-radius: 4px;
        font-size: 14px;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 15px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
        font-weight: bold;
        transition: background-color 0.3s ease;
        width: 100%;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }

    /* Responsive Design */
    @media (max-width: 500px) {
        .form-container {
            width: 90%;
            padding: 20px;
        }

        h2 {
            font-size: 20px;
        }

        input[type="text"], input[type="email"], input[type="password"] {
            font-size: 13px;
        }

        input[type="submit"] {
            font-size: 14px;
        }
    }
</style>

<%
    String id = request.getParameter("id");
    String email = "";
    String name = "";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        PreparedStatement pre = con.prepareStatement("select * from user where id=?");
        pre.setString(1, id);
        ResultSet rs = pre.executeQuery();
        if (rs.next()) {
            name = rs.getString("NAME");
            email = rs.getString("EMAIL");
        }
        pre.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
%>

<div class="form-container">
    <h2>Edit User</h2>
    <form method="post" action="day6edituserdb.jsp">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="<%= name %>" required>

        <label for="email">Email:</label>
        <input type="text" id="email" name="email" value="<%= email %>" required>

        <input type="hidden" name="id" value="<%= id %>">
        <input type="submit" value="Edit">
    </form>
</div>
