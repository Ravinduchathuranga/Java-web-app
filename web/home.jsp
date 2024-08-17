<%-- Document : home Created on : Aug 17, 2024, 2:04:34 PM Author : ravinduchathuranga --%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <div class="container">
            <div class="row">
                <div class="col-12 p-4">
                    <h1 class="text-center">Home</h1>
                    <div class="user-details">
                        <%
                            //chceking session to make sure there is a valid user loged in
                            if (session.getAttribute("user") != null) {
                                User user = (User) session.getAttribute("user");
                        %>
                        <h2>User Details</h2>
                        <p>Name: <%= user.getName()%></p>
                        <p>Mobile <%= user.getMobile()%></p>
                        <p>Country: <%= user.getContry()%></p>                                                           
                        <%
                            } else {
                                response.sendRedirect("signUp.jsp");

                            }

                        %>
                    </div>
                </div>
            </div>
        </div>
    </body>

</html>