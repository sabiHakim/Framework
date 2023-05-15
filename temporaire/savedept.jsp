<%-- 
    Document   : savedept
    Created on : 4 mai 2023, 09:41:54
    Author     : sabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="ajouter" method="POST">
            Id :<input type="text" name="id">
            <br/>
            Nom :<input type="text" name="nom"> 
            <br/> Location : <input type="text" name="loc">
            <br/> Date : <input type="date" name="date">

            <br/> <input type="submit" value="Save">
        </form>
    </body>
</html>
