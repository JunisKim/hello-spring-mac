<%--
  Created by IntelliJ IDEA.
  User: TaejunKim
  Date: 2017. 6. 18.
  Time: 오후 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/asset/css/bootstrap.css"/>
    <link rel="stylesheet" href="/asset/css/main.css">
    <!-- Latest compiled and minified CSS -->

</head>
<body>
<h1>전체 보기 페이지입니다</h1>

<c:forEach var="article" items="${list}">
    <ul>
        <li>글번호 : ${article.articleId}</li>
        <li>제목 :
            <a href="/bbs/${article.articleId}">${article.title}</a>
            (작성자 : ${article.writer})
        </li>
    </ul>
</c:forEach>

<a href="/bbs/write"><button>글쓰기</a></button>
<script src="/asset/js/jquery-3.2.1.js"></script>
<script src="/asset/js/bootstrap.js"></script>
</body>
</html>
