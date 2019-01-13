<%--
  Created by IntelliJ IDEA.
  User: chd96
  Date: 2018-12-14
  Time: 오전 2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PostList</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <%--<link type="text/css" rel="stylesheet" href="/resources/css/postlist.css"/>--%>

</head>
<body>
<div class="container">
    <table class="table">
        </thead>
        <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0 }">
                <c:set var="num" value="1"/>
                <%
                    int num = 1;
                %>
                <c:forEach items="${list}" var="list">
                    <tr>
                        <th scope="row"><%= num++ %>
                        </th>
                        <td>${list.title }</td>
                        <td>${user}</td>
                        <td>${list.updateDate}</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="5">조회된 결과가 없습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>

        </tbody>
    </table>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
<script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<script src="/resources/js/postlist.js"></script>
</body>
</html>
