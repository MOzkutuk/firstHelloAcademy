<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
  <link rel="stylesheet" href="css/control-page.css">
  <meta charset="UTF-8">
  <title>Admin Page</title>
  <style>
    .button{
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
    .button1{
      background-color: black;
      color:  #84c754;
    }
    .button1:hover{
      background-color: #84c754;
      color: white;
    }
    @keyframes example1 {
      0% {right: 50px; top: 0;}
      100% {right: 50px; top: 530px;}
    }
    @keyframes slide-in-bck-center{
      0%{transform:translateZ(600px);opacity:0}100%{transform:translateZ(0);opacity:1}}


    .body{padding: 0;margin: 0;font-size: 15px; background-color: black;
      font-family: "Courier New", cursive;}

    .admin-page-baslik{
      color: #84c754;
      text-align: center;
    }

    .admin-page-bilgilendirme-kutusu{
      border: 2px solid #ffffff;
      color: #ffffff;
      border-radius: 4px;
      padding: 10px;
      width: 320px;
      top: 530px;
      right: 50px;
      position: absolute;
      font-size: 80%;
      line-height: 20px;
      animation-name: example1;
      animation-duration: 4s;
    }
    .admin-page-bilgilendirme-kutusu-2 {
      border: 2px solid #ffffff;
      color: #ffffff;
      border-radius: 4px;
      padding: 10px;
      width: 320px;
      top: 140px;
      right: 600px;
      position: absolute;
      font-size: 80%;
      line-height: 20px;
      animation:slide-in-bck-center .7s cubic-bezier(.25,.46,.45,.94) both
    }


  </style>
</head>
<body class="body">

<div  class="admin-page-baslik">
  <h1>Welcome To Admin Panel</h1>
  <div id="admin-page-alt-baslik">
    <p>Please read the instructions below</p>
  </div>
</div>

<div class="admin-page-bilgilendirme-kutusu">
  <h3>Instructions</h3>
  <p>Choose the data you want to begin to operate.After selecting the data you will
    be directed to another page that concerns that data operations. Be aware that
    ever operation you will make will be undoable.</p>
</div>

<div>
  <ul style="display: inline">
    <li><form action="forward-clazz"><button class="button button1">Class</button></form></li>
    <li><form action="forward-student"><button class="button button1">Students</button></form></li>
    <li><form action="forward-teacher"><button class="button button1">Teachers</button></form></li>
    <li><form action="forward-subject"><button class="button button1">Subjects</button></form></li>
    <li><form action="forward-class-report"><button class="button button1">Class Report</button></form></li>
  </ul>
</div>

<div class="admin-page-bilgilendirme-kutusu-2">
  <h3>Operations</h3>
  <p>The operations will be as followed:</p>
  <ul>
    <li>Adding Data : <p style="color: #4CAF50">Creating a new data for the chosen data class by entering that data class's mandatory information.</p></li>
    <li>Updating Data : <p style="color:#4CAF50 ">Updating the existing data for the chosen data class.</p></li>
    <li>Deleting Data :  <p style="color:#4CAF50 ">Deleting the existing data for the choosen data class. Make sure the data exists.</p></li>
    <li>Get Data :  <p style="color:#4CAF50 ">Receiving all the existing data for the chosen data class.</p></li>
    <li>Get Data By Its ID :  <p style="color:#4CAF50 ">Receiving the data information based on the provided its data ID.</p></li>
  </ul>
</div>

</body>
</html>
