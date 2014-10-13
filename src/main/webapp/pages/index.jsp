<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="uft-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Spring MVC</title>
    <style>
        #conv_list{
            width: 95%; height: 350px;
            border-collapse: collapse;
            border: solid black 2px;
            OVERFLOW:auto;
        }
        #conv_self {
            width: 95%; height: 100px;
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
<div id="conv_list"></div><br/>
<textarea id="conv_self" rows="5" cols="100">

</textarea><br/>
<input type="button" value="Send" style="width: 80px;" onclick=""/>
</body>
</html>