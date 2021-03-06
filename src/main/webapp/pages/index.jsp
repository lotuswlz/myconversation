<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="basePath" value="${pageContext.request.contextPath }"/>
<c:set var="assets" value="${basePath}/assets"/>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="uft-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Spring MVC</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/main">Home</a>
<br/><br/>
<h2>To see <a href="${basePath}/test/list/book">Book</a></h2>
<h2>To see <a href="${basePath}/test/list/user">User</a></h2>
<p></p>
<hr/>
<h3>Enter a nick name and login to talk with others</h3>
<form action="loginSubmit.do" method="post">
<label>Your Nick Name: </label><input type="text" name="userName"/>
<input type="submit" value="Login"/>
</form>
</body>
</html>