<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="student" class="com.firstHelloWorld.firstHelloAcademy.api.Student" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Student</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

    <style>

        .button {
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

        .button1 {
            background-color: white;
            color: black;
            border: 2px solid #4CAF50;
        }

        .button1:hover {
            background-color: #4CAF50;
            color: white;
        }

        #ana-baslik{
            color: #ffff;
            position: relative;
            border: 2px solid #04AA6D;
            background-color:#04AA6D;
            border-radius: 5px;
            margin-top: 15px;
            margin-right: 200px;
            margin-left: 200px;
        }

    </style>

</head>
<body style=" text-shadow: 2px 2px 5px #04AA6D; font-size: 23px">

<div align="center">

    <h2 id="ana-baslik">Add Student</h2>

    <form:form action="save-student" modelAttribute="student" method="POST">

        <form:hidden path="id"/>

        <label style=" border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            color: #ffff;
            border-width: thick">First Name : </label>
        <form:input cssClass="button button1" path="first_name"/>

        <br>

        <label style=" border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            color: #ffff;
            border-width: thick">Last Name : </label>
        <form:input cssClass="button button1" path="last_name"/>

        <br>

        <form:label path="id" cssClass="button button1">Class ID :</form:label>

        <br>

        <form:select path="clazz.id" items="${clazzes}" cssClass="button button1"/>

        <br>

        <p><b><span style="color:red">${error}</span></b></p>

        <br>

        <p><b><span style="color:red">${error3}</span></b></p>

        <p><b><span style="color:red">${numberError}</span></b></p>

        <input class="button button1" type="submit" value="Submit">

    </form:form>

    <form action="forward-student">
        <button class="button button1">See Students</button>
    </form>
    <form action="forward-controlPage">
        <button class="button button1">Go To Menu</button>
    </form>

</div>

</body>
</html>