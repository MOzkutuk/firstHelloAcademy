<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Class Report</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="../../../resources/static/css/my-style-sheet.css">

    <style>

        #ana-baslik {
            color: #ffff;
            position: relative;
            border: 2px solid #04AA6D;
            background-color: #04AA6D;
            border-radius: 5px;
            margin-top: 15px;
            margin-right: 15px;
            margin-left: 15px;
        }

        #body {
            padding: 0;
            margin: 0;
            font-size: 15px;
            background-color: black;
            font-family: "Courier New", cursive;
        }

    </style>

</head>
<body id="body" class="myFonts">

<div class="container">


    <h1 align="center" id="ana-baslik">Class Report</h1>

    <form action="forward-controlPage">
        <button class="btn btn-outline-success">Go To Menu</button>
    </form>

    <br/>

    <table class="table table-success table-striped" border="1">
        <thead>
        <tr class="table-warning">
            <div>
                <td><b>Class ID</b></td>
                <td><b>Class Name</b></td>
                <td><b>Subject ID</b></td>
                <td><b>Subject Name</b></td>
                <td><b>Teacher First Name</b></td>
                <td><b>Teacher Last Name</b></td>
                <td><b>Teacher ID</b></td>
                <td><b>Student ID</b></td>
                <td><b>Student First Name</b></td>
                <td><b>Student Last Name</b></td>
            </div>
        </tr>
        </thead>

        <c:forEach var="clazz" items="${clazzList}">
        <tr>
            <td class="table-primary"><b>${clazz.id}</b></td>
            <td class="table-danger"><b>${clazz.name}</b></td>
            <td class="table-danger"><b>${clazz.subject.id}</b></td>
            <td class="table-primary"><b>${clazz.subject.name}</b></td>
            <td class="table-danger"><b>${clazz.teacher.first_name}</b></td>
            <td class="table-primary"><b>${clazz.teacher.last_name}</b></td>
            <td class="table-danger"><b>${clazz.teacher.id}</b></td>
            <c:forEach var="student" items="${studentList}">
            <td class="table-primary"><b>${student.id}</b></td>
            <td class="table-danger"><b>${student.first_name}</b></td>
            <td class="table-primary"><b>${student.last_name}</b></td>
            </c:forEach>
            </c:forEach>
    </table>

</div>

</body>
</html>