<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .button{
            background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 16px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            transition-duration: 0.4s;
            cursor: pointer;
        }
        .button1{
            background-color: white;
            color: black;
            border: 2px solid #4CAF50;
        }
        .button1:hover{
            background-color: #4CAF50;
            color: white;
        }
        .login-baslik{
            border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            color: #ffff;
            margin-left: 400px;
            margin-right: 380px;
            left: 30px;
        }

    </style>
    <title>Login Page</title>
</head>
<body>


<div style="text-align: center">
    <div class="login-baslik">
        <h1>Login Page</h1>
    </div>
    <form method="post" action="login">
        Username <input style="margin-left: 10px;" class="button button1" type="text" name="userName"/><br>
        Password<input style="margin-left: 18px;" class="button button1" type="password" name="password"/><br>
        <input style="margin-left: 50px;" class="button button1" type="submit" value="Login">
    </form>
</div>

<div style="text-align: center; margin-left: 40px;">
    <p style="color: darkred;text-decoration: underline; text-shadow: black;font-weight: bold">${error}</p>
</div>

</body>
</html>
