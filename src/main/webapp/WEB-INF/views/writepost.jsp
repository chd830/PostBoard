<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link type="text/css" rel="stylesheet" href="/resources/css/writepost.css"/>

</head>

<body>

<table summary="글수정 전체 테이블">
    <colgroup>
        <col width="20%">
        <col width="80%">
    </colgroup>


    <table summary="테이블 구성">
        <tr class="row">
            <td class="title">Title</td>
            <td><input id="title" type=text name=title></td>
        </tr>
        <tr class="row">
            <td class="content">Content</td>
            <td><textarea id="content" name=content rows="10" cols="100"></textarea></td>
        </tr>
        <tr>
            <td colspan=2>
                <hr size=1>
            </td>
        </tr>
        <>
        <td colspan="2">
            <div align="center">
                <button id="save" type="submit">SAVE</button>
            </div>
        </td>
        </tr>
        </tr>
    </table>
    </form>
</table>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="/resources/js/writepost.js"></script>
</body>
</html>