<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@page isELIgnored="false" %>
<jsp:useBean id="clazz" class="com.firstHelloWorld.firstHelloAcademy.api.Clazz" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Class</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="../../../resources/static/css/my-style-sheet.css">

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

        #ana-baslik {
            color: #ffff;
            position: relative;
            border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            margin-top: 15px;
            margin-right: 200px;
            margin-left: 200px;
        }

    </style>

</head>
<body style=" text-shadow: 2px 2px 5px #04AA6D; font-size: 23px">

<div align="center">

    <h2 id="ana-baslik">Add Class</h2>


    <form:form action="save-clazz" modelAttribute="clazz" method="POST">

        <form:hidden path="id"/>

        <label style=" border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            color: #ffff;
            border-width: thick">Class Name : </label>
        <form:input cssClass="button button1" path="name"/>

        <br>

        <form:label path="id">Subject ID :</form:label>

        <br>

        <form:select path="subject.id" items="${subjects}"/>

        <br>

        <form:label path="id">Teacher ID :</form:label>

        <br>

        <form:select path="teacher.id" items="${teachers}"/>

        <br>

        <label style=" border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            color: #ffff;
            border-width: thick">Subject Name : </label>
        <form:input cssClass="button button1" path="subject.name"/>

        <br>

        <label style=" border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            color: #ffff;
            border-width: thick">Teacher First Name : </label>
        <form:input cssClass="button button1" path="teacher.first_name"/>

        <br>

        <label style=" border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            color: #ffff;
            border-width: thick">Teacher Last Name : </label>
        <form:input cssClass="button button1" path="teacher.last_name"/>

        <br>

        <p><b><span style="color:red">${error}</span></b></p>

        <p><b><span style="color:red">${duplicateError}</span></b></p>

        <p><b><span style="color:red">${numberError}</span></b></p>

        <input class="button button1" type="submit" value="Submit">


    </form:form>

    <form action="forward-clazz">
        <button class="button button1">See Classes</button>
    </form>
    <form action="forward-controlPage">
        <button class="button button1">Go To Menu</button>
    </form>

</div>

</body>
</html>