<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Dashboard - Contact Application </title>
        <link href="static/css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            body{
                font-family: Arial, Helvetica, Geneva, sans-serif;
                font-size: 18px;
            }
            .error{
                color: #FF0000;
            }
            .success{
                color: #0000FF;
            }
        </style>
    </head>
    <body>
        <table border="1" width="80%" align="center">
            <tr>
                <td height="80px">
                    <%-- Header --%>
                    <jsp:include page = "include/header.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="25px">
                    <%-- Menu --%>
                    <jsp:include page = "include/menu.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="350px" valign="top">
                    <%-- Page Content Area--%>
                    <h3>User Dashboard</h3>
                    TODO- User options in this page
                </td>
            </tr>
            <tr>
                <td height="25px">
                    <%-- Footer --%>
                    <jsp:include page = "include/footer.jsp"/>
                </td>
            </tr>
        </table>
    </body>
</html>