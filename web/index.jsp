<%-- 
    Document   : cevap
    Created on : May 21, 2018, 4:07:41 PM
    Author     : user
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="requestscope.PersonPojo"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% List<PersonPojo> list = (List<PersonPojo>)request.getAttribute("personList"); %>
        <table style="width: 300px" border="1">
            <% for(PersonPojo p : list) {%>
            <tr>
                <td><%=p.getId() %></td>
                <td><%=p.getName() %></td>
                <td><%=p.getSurname() %></td>
                <td><%=p.getPhoneNumber() %></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
