<%--
  Created by IntelliJ IDEA.
  User: TaejunKim
  Date: 2017. 6. 18.
  Time: 오후 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>

<h1>다음과 같이 등록되었습니다</h1>
<ul>
    <li>${article.articleId}</li>
    <li>${article.title}</li>
    <li>${article.memberId}</li>
    <li>${article.content}</li>
</ul>

<br><br>
<a href="/bbs">전체 글 보기</a>

</body>
</html>