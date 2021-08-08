<%--
  Created by IntelliJ IDEA.
  User: mbara
  Date: 8/7/2021
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Failed Delete</title>
</head>

<style>

    .button {
        background-color: #84c754; /* Green */
        border: none;
        border-radius: 5px;
        color: white;
        padding: 16px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 15px;
        margin: 30px 200px;
        transition-duration: 0.4s;
        cursor: pointer;
    }

    .button1 {
        background-color: black;
        color: #84c754;
    }

    .button1:hover {
        background-color: #84c754;
        color: white;
    }

    .body {
        padding: 0;
        margin: 0;
        font-size: 15px;
        background-color: black;
        font-family: "Courier New", cursive;
    }

    .admin-page-baslik {
        color: #84c754;
        text-align: center;
    }

</style>


<body class="body">

<h3 class="admin-page-baslik" font-size: 20px><b> Delete Operation Failed ! You Cannot Delete Mutliple Data At The Same
    Time</b></h3>

<div align="center">

    <form action="forward-clazz">
        <button class="button button1">Class</button>
    </form>
    <form action="forward-student">
        <button class="button button1">Students</button>
    </form>
    <form action="forward-teacher">
        <button class="button button1">Teachers</button>
    </form>
    <form action="forward-subject">
        <button class="button button1">Subjects</button>
    </form>
    <form action="forward-controlPage">
        <button class="button button1">Go To Menu</button>
    </form>

</div>


</body>
</html>
