<%--
  Created by IntelliJ IDEA.
  User: TaejunKim
  Date: 2017. 6. 18.
  Time: 오후 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>친구 등록 완료!</h1>

<ul>
    <li>친구 이름: ${amigo.name}</li>
    <li>핸드폰: ${amigo.phone}</li>
    <li>이메일: ${amigo.email}</li>
</ul>
<<a href="/amigo"><button>글 전체 보기</a></button>
</body>
</html>
