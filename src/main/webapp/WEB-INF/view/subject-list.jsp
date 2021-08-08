<%--
  Created by IntelliJ IDEA.
  User: mbara
  Date: 8/7/2021
  Time: 1:02 AM
  To change this template use File | Settings | File Templates.
--%>
<
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Subject List</title>

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

    </style>

</head>
<body class="myFonts">

<div class="container">


    <h1 align="center" id="ana-baslik">School Management</h1>

    <p><b><span style="color:red; text-align: right">${errMsg}</span></b></p>

    <form action="forward-controlPage">
        <button class="btn btn-outline-success">Go To Menu</button>
    </form>

    <form action="showAddSubjectPage">

        <!-- This is my add button -->
        <input type="submit" value="ADD Subject" class="btn btn-outline-success">

    </form>

    <br/>


    <table border="1" class="table table-striped">
        <thead>
        <tr>
            <td><b>ID</b></td>
            <td><b>Subject Name</b></td>
        </tr>
        </thead>

        <c:forEach var="subject" items="${subjects}">
            <tr>
                <td><b>${subject.id}</b></td>
                <td><b>${subject.name}</b></td>
                <td><a class="btn btn-primary" href="updateSubject?id=${subject.id}"> Update</a></td>
                <td><a class="btn btn-danger" href="deleteSubject?id=${subject.id}"
                       onclick="if(!(confirm('Are you sure you want to delete this subject ?')))return false">
                    Delete</a></td>
            </tr>
        </c:forEach>
    </table>

</div>

</body>
</html>
