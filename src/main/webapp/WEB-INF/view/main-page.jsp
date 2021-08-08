<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <link rel="stylesheet" href="css/layout.css">
    <meta name="designer" content="Mehmet Baran Ozkutuk. Web Designer." charset="UTF-8"/>
    <title>SMSYS</title>
    <style>
        #ana-baslik{
            color: #ffff;
            position: relative;
            border: 2px solid #04AA6D;
            background-color:#04AA6D;
            border-radius: 5px;
            margin-top: 15px;
            margin-right: 15px;
            margin-left: 15px;
        }
        #ana-baslik-bilgilendirme-baslik{
            margin-top: -20px;
            color: #ffff;
        }
        #admin-panel-baslik{
            border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            color: #ffff;
            margin-left: 15px;
            margin-right: 1200px;
            left: 30px;
        }
        #admin-panel-info{
            margin-left: 15px;
        }

        li.satir{
            color: black;
            border: 2px solid #d4d4d4;
            border-left-width: 15px;
            border-right-width: 15px;
            border-radius: 4px;
            /* ust sag asagi yukari*/
            margin: 4px 900px 4px 4px;
            background-color: #f1f1f1;
            list-style-type: none;
            padding: 2px;
        }
        li.satir2{
            font-family: "Times New Roman", serif;
            color: black;
            border: 2px solid antiquewhite;
            border-left-width: 15px;
            border-right-width: 15px;
            border-radius: 4px;
            /* ust sag asagi yukari*/
            margin: 4px 1300px 4px 4px;
            background-color: navajowhite;
            list-style-type: none;
            padding: 2px;
        }
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

    </style>
</head>
<body>
<div id="ana-baslik">
    <h1>Welcome To School Management System</h1>
    <div id="ana-baslik-bilgilendirme-baslik">
        <p>Check out some important information on how to use the system</p>
    </div>
</div>
<div id="liste">
    <ul >
        <li class="satir">Click the login button to login as an admin</li>
        <li class="satir">You will find the username and password in the githup repository</li>
        <li class="satir">This page has been created for the further purposes</li>
        <ul>
            <li class="satir2">Add</li>
            <li class="satir2">Delete</li>
            <li class="satir2">Update</li>

        </ul>
    </ul>
</div>
<div id="admin-panel">
    <div id="admin-panel-baslik">
        <h1>Admin Panel</h1>
    </div>
    <div id="admin-panel-info" style="width: 700px;overflow:hidden;">
        <p>This is a demonstration of what purpose the admin panel works for.Logging in as an admin role will get an option
            to create a&nbsp;Class report which will show all the information about the class, such as the list
            of students, subjects, and teachers
        </p>
        <form action="login">
            <div >
                <button class="button button1">Login</button>
            </div>
        </form>
    </div>
</div>

<div style="position: absolute;bottom: 0; left: 0; ">
    <p>&copy; learnerAcademy.com 2021 by Mehmet Baran Ozkutuk </p>
</div>

</body>
</html>