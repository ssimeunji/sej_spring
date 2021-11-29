<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>save</title>
<style>
	input {
		display: block;
	}
</style>
</head>
<body>
	<h2>회원가입 페이지</h2>
	<form action="save" method="post">
		<div>
			<lable>아이디: </lable><input type="text" name="m_id">
		</div>
		<div>
			<lable>비밀번호: </lable><input type="password" name="m_password">
		</div>
		<div>
			<lable>이름: </lable><input type="text" name="m_name">
		</div>
		<div>
			<lable>이메일: </lable><input type="text" name="m_email">
		</div>
		<div>
			<lable>전화번호: </lable><input type="text" name="m_phone">
		</div>
		<div>
			<input type="submit" value="회원가입">
		</div>
		
		
	</form>
</body>
</html>