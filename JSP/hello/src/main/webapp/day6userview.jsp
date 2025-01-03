<%@ page import="java.sql.*" %>

<style>
    /* General Page Styles */
    body {
        font-family: Arial, sans-serif;
        background-color: #f9f9f9;
        margin: 0;
        padding: 20px;
    }

    h1 {
        text-align: center;
        color: #4CAF50;
        font-size: 28px;
        margin-bottom: 20px;
    }

    /* Table Styles */
    table {
        width: 80%;
        margin: 0 auto;
        border-collapse: collapse;
        background: #fff;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
        overflow: hidden;
    }

    th, td {
        padding: 12px 15px;
        text-align: left;
    }

    th {
        background-color: #4CAF50;
        color: white;
        font-weight: bold;
        text-transform: uppercase;
        font-size: 14px;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }

    tr:hover {
        background-color: #e8f5e9;
    }

    td a {
        text-decoration: none;
        color: #2196F3;
        font-weight: bold;
        transition: color 0.3s ease;
    }

    td a:hover {
        color: #1565C0;
    }

    /* Responsive Design */
    @media (max-width: 768px) {
        table {
            width: 100%;
        }

        th, td {
            font-size: 12px;
            padding: 10px;
        }

        h1 {
            font-size: 24px;
        }
    }
</style>
<script>
function cofirmDel(id) {
	if(confirm("Are You Sure?")){
		location.href='day6deleteuser.jsp?id='+id;
	}
}
function test() {
	alert("hello");
}</script>
<h1>View User</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Action</th>
    </tr>
    <%
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            PreparedStatement pre = con.prepareStatement("select * from user");
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
    %>
    <tr>
        <td><%= rs.getString("NAME") %></td>
        <td><%= rs.getString("EMAIL") %></td>
        <td>
            <a href="day6edituser.jsp?id=<%= rs.getString("ID") %>">Edit</a> |
            <a href="#" onclick="cofirmDel(<%=rs.getString("ID") %>)">Delete</a>
        </td>
    </tr>
    <%
            }
            rs.close();
            pre.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    %> 