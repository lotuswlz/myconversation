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
    <style>
        #conv_list{
            width: 95%; height: 350px;
            border-collapse: collapse;
            border: solid black 2px;
            OVERFLOW:auto;
            line-height: 30px;
            padding-left: 5px;
        }
        #conv_self {
            width: 95%; height: 100px;
            border-collapse: collapse;
            border: solid black 2px;
            OVERFLOW:auto;
        }
    </style>
    <script>
        var basePath = '${basePath}';
    </script>

</head>
<body>
<h1>Conversation</h1>
<a href="<%=request.getContextPath()%>/main">Home</a>
<hr/>
<div id="conv_list"></div><br/>
<textarea id="conv_self" rows="5" cols="100"></textarea><br/>
<input type="button" value="Send" style="width: 80px;" onclick="sendTalk()"/>
</body>
<script src="${assets}/scripts/lib/jquery-1.11.1.min.js"></script>
<script src="${assets}/scripts/lib/jquery.validate.min.js"></script>
<script src="${assets}/scripts/lib/jquery.cookie.js"></script>

<script type="text/javascript">
    $(document).ready(function() {
        loadConversations();
        setInterval(loadConversations, 2000);
    });

    function loadConversations() {
        $.ajax({
            type: "POST",
            url: basePath + "/test/listConversation.do",
            contentType: "application/json; charset=utf-8",
            dataType: 'json',
            success: function (result) {
                var talkValue = "";
                $.each(result, function (i, item) {
                    talkValue += item + "<br/>";
                });

                $("#conv_list").html(talkValue);
            },
            error: function () {
                console.log("wrong connection...");
            }
        });
    }

    function sendTalk() {
            var userName = $.cookie('username');
            var talk = $("#conv_self").val();
            var datas = {
                userName:userName,
                talk:talk
            };
            $.ajax({
                type: "POST",
                url: basePath + "/say.do",
                contentType: "application/json; charset=utf-8",
                dataType: 'text',
                data:JSON.stringify(datas),
                success: function (result) {
                    $("#conv_self").val("");
                },
                error: function () {
                    console.log("wrong connection...");
                }
            });
    }
</script>
</html>