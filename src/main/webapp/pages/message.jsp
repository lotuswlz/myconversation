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
<h1>Something wrong with ${title}</h1>
<h4>${message}</h4>
</body>
</html>