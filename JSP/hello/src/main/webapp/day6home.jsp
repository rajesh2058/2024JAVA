<%@ include file="day6header.jsp" %>

<style>
    /* General Reset */
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #e3f2fd, #90caf9);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    /* Centered Container */
    .container {
        background: #ffffff;
        padding: 30px 50px;
        border-radius: 12px;
        box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
        text-align: center;
        max-width: 400px;
        width: 100%;
    }

    /* Heading Style */
    h1 {
        font-size: 28px;
        color: #333333;
        margin-bottom: 20px;
        font-weight: bold;
        line-height: 1.4;
    }

    /* Button Styles */
    a {
        display: inline-block;
        margin: 10px 5px;
        padding: 12px 20px;
        background-color: #2196f3;
        color: white;
        text-decoration: none;
        border-radius: 8px;
        font-size: 16px;
        font-weight: bold;
        transition: all 0.3s ease;
    }

    a:hover {
        background-color: #1976d2;
        transform: translateY(-3px);
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }

    /* Subtle Separator for Better Layout */
    .separator {
        height: 2px;
        width: 80%;
        background: #e0e0e0;
        margin: 20px auto;
    }

    /* Responsive Design */
    @media (max-width: 500px) {
        .container {
            padding: 20px 30px;
        }

        h1 {
            font-size: 22px;
        }

        a {
            font-size: 14px;
            padding: 10px 15px;
        }
    }
</style>

<div class="container">
    <h1>Welcome to my page, <%= name %></h1>
    <div class="separator"></div>
    <a href="day6userview.jsp">View User</a>
    <a href="day6logout.jsp">Logout</a>
</div> 