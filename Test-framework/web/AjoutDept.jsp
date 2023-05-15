<%-- 
    Document   : AjoutDept
    Created on : 7 mai 2023, 20:55:14
    Author     : sabi
--%>


<%@page import="model.Dept"%>
<%@page import="java.util.Vector"%>
<%  
    Vector<Dept> list = (Vector<Dept>)request.getAttribute("list");
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>  liste </title>
    </head>
    <body>
        <h3>liste Dept</h3>
        nb : <%= list.size() %> <br>
 <% for (Dept d : list) { %>
            <%= d.getNom() %> <%= d.getDate() %> <br>
        <% } %>
    </body>
</html>