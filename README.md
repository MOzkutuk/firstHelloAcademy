# firstHelloAcademy

Basic School management system with it's own entity pattern created using by JPA,Hibernate,Spring MVC,Spring Boot, Spring form etc.

This is a simple example of using **MVC** and **JPA** technologies to create school management system.

## The Requirements

- You will need to use an SQL platform in order to play with the records and create the tables.
- Apache Maven to install and clean the project. (preferably)
- Apache Tomcat to run the application on the server.

## Description
- As I mentioned this is a simple web application which you can use with your SQL platform since the application using HQL to perform operations.
- During the running process you can execute CRUD operations as you like just read the description in the admin panel.
- You can create the database tables manuelly or if you can open the application.properties file and implement the further changes

```
spring.jpa.hibernate.ddl-auto=update to spring.jpa.hibernate.ddl-auto=create

```

- And make sure you enter your database name,username and password in here correctly insted of **_firsthelloacademy_** and if your port number is different change it too.

```
spring.datasource.url=jdbc:mysql://localhost:3306/firsthelloacademy
spring.datasource.username=firsthelloacademy
spring.datasource.password=firsthelloacademy
```
- Use these to login

```
Admin = username
nimda = password
```
