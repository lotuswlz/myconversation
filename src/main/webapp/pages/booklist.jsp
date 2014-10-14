<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>List Info</title>
    <style>
        .main_tb, .main_tb td, .main_tb th {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 10px;
        }
        .main_tb tr {
            height: 30px;
        }
        .main_tb th {
            font-weight: bold;
            background-color: gray;
        }
    </style>
</head>
<body>
<h1>List for <c:out value="${title}"/></h1>
<hr/>
<table class="main_tb">
<tr>
    <th>Name</th>
    <th>Author</th>
    <th>Introduction</th>
</tr>
<c:forEach var="i" items="${datas}">
<tr>
    <td><c:out value="${i.name}"/></td>
    <td>${i.author}</td>
    <td>${i.introduction}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
