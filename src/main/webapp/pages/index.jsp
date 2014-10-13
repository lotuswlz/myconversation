<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="uft-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Spring MVC</title>
</head>
<body>
<h1>Spring MVC</h1>
<a href="<%=request.getContextPath()%>/main">Home</a>
<form action="loginSubmit.do" method="post">
<label>Your Nick Name: </label><input type="text" name="userName"/>
<input type="submit" value="Login"/>
</form>
</body>
</html>