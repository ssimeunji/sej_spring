<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JSTL(JSP Standard Tag Library)사용 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findAll</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<h2>findAll.jsp</h2>
	<table class="table">
		<tr>
			<th>번호</th>
			<th>아이디</th>
 			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>전화번호</th>
			<!-- detail 이라는 주소요청을 통해 회원 상세조회를 해봅시다. 상세조회 데이터는 detail.jsp에 출력합니다. -->
			<th>상세조회</th>
			<th>삭제</th>
			<th>수정</th>
		</tr>
	<c:forEach items="${mList}" var="m">
		<tr>
			<td>${m.m_number}</td>
			<td>${m.m_id}</td>
			<td>${m.m_password}</td>
			<td>${m.m_name}</td>
			<td>${m.m_email}</td>
			<td>${m.m_phone}</td>
 			<td><a href="detail?m_number=${m.m_number}">조회</a></td>
			<td><a href="delete?m_number=${m.m_number}">삭제</a></td>
			<td><a href="update?m_number=${m.m_number}">수정</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>