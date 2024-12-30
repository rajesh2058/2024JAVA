<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register User</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .register-form {
            background-color: #ffffff;
            padding: 20px 30px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .register-form h1 {
            font-size: 24px;
            margin-bottom: 20px;
            color: #333333;
        }
        .register-form input[type="text"],
        .register-form input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .register-form input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        .register-form input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .error-message {
            color: red;
            font-size: 14px;
            margin-bottom: 10px;
        }
    </style>
    <script>
        function validateForm(event) {
            const name = document.forms["registerForm"]["name"].value;
            const password = document.forms["registerForm"]["password"].value;
            const email = document.forms["registerForm"]["email"].value;

            let errorMessage = "";

            if (!name) {
                errorMessage += "Name cannot be empty.\\n";
            }

            if (!password) {
                errorMessage += "Password cannot be empty.\\n";
            }

            if (!email.endsWith("@gmail.com")) {
                errorMessage += "Email must end with @gmail.com.\\n";
            }

            if (errorMessage) {
                alert(errorMessage);
                event.preventDefault(); // Prevent form submission
            }
        }
    </script>
</head>
<body>
    <form class="register-form" name="registerForm" method="post" action="day6registerdb.jsp" onsubmit="validateForm(event)">
        <h1>Register User</h1>
        <div class="error-message"></div>
        Name:<input type="text" name="name"><br>
        Password:<input type="password" name="password"><br>
        Email:<input type="text" name="email"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
