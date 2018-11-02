<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
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


        <table summary="테이블 구성" >
            <tr class="row">
                <td class="title">제 목</td>
                <td><input type=text name=title></td>
            </tr>
            <tr class="row">
                <td class="title">내 용</td>
                <td><textarea name=content rows ="10" cols="100"></textarea></td>
            </tr>
            <tr>
                <td colspan=2><hr size=1></td>
            </tr>
            <>
                <td colspan="2"><div align="center">
                    <input type="submit" value="완료">&nbsp;&nbsp;</div>
                </td>
            </tr>
            </tr>
        </table>
    </form>
</table>

</body>
</html>