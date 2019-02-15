<%@ page import="ac.dankook.postboard.data.Post" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: chd96
  Date: 2018-12-14
  Time: 오전 2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <link type="text/css" rel="stylesheet" href="/resources/css/list.css"/>

</head>
<body>
<div class="container">
    <table class="table">
        </thead>
        <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0 }">
                <%
                    int num = 1;
                    int next = 0;
                %>
                <c:forEach items="${list}" var="list" begin="0" end="24">
                    <tr id="list">
                        <th scope="row"><%= num++ %>
                        </th>
                        <td>${list.title }</td>
                        <td>${user}</td>
                        <td id="last">${list.updateDate}</td>
                    </tr>
                </c:forEach>
                <input type="hidden" id="end" value="<%=num%>"/>
                <input type="hidden" id="next" value="<%=next%>"/>
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
<script src="/resources/js/list.js"></script>
</body>
</html>
