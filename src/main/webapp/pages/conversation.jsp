<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="uft-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Spring MVC</title>
    <style>
        #conv_list{
            width: 95%; height: 500px;
            border-collapse: collapse;
            border: solid black 2px;
            OVERFLOW:auto;
        }
    </style>
</head>
<body>
    <h1>Conversation</h1>
    <a href="<%=request.getContextPath()%>/main">Home</a>
    <hr/>
    <div id="conv_list"></div>
</body>
</html>