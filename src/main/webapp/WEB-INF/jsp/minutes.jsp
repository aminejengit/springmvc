<%-- 
    Document   : minutes
    Created on : Mar 28, 2017, 6:07:18 PM
    Author     : amine.jendoubi
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>minutes</title>
    </head>
    <body>
        <h1>bye World!</h1>
        <form:form commandName="exercice">
            <form:input path="minutes"/>    
            <input type="submit" value="Enter Exercice"/>
        </form:form>
    </body>
</html>
