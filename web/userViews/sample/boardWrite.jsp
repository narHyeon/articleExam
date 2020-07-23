<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>글쓰기</title>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/ui.css'/>" />
</head>
<body>
<form id="frm" action="writeBoard.do">
    <table class="board_view">
        <colgroup>
            <col width="15%" >
            <col width="*" >
        </colgroup>
        <caption>게시글 작성</caption>
        <tbody>
        <tr>
            <th scope="row">제목</th>
            <td><input type="text"  name="TITLE" class="wdp_90" /></td>
        </tr>
        <tr>
            <th scope="row">내용</th>
            <td><textarea cols="100" rows="20" id="CONTENTS" name="CONTENTS" title="내용"></textarea></td>
        </tr>
        </tbody>
    </table>

    <button type="submit" id="write" class="btn">글쓰기</button>
</form>
    <a href="openBoardList.do" id="list" class="btn">목록으로</a>

</body>
</html>
