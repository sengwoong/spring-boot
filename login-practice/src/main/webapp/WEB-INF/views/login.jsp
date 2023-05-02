<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	<form>
		<div><input id="id" type="text" name="id" placeholder="아이디" /></div>
		<div><input id="pw" type="password" name="pw" placeholder="비밀번호" /></div>
		<div><button type="button" onclick="login()" >로그인</button></div>
	</form>
</body>
<script>

	const login = () => {
		
		const idTag = document.getElementById("id");
		const pwTag = document.getElementById("pw");
		
		const user = {
				id : idTag.value,
				pw : pwTag.value
		}
		
		$.ajax({
			url: "/login",
			type: "POST",
			contentType: 'application/json; charset=utf-8',
			data: user
		}).done(function(result) {
			if(result == "ok"){
				alert("로그인에 성공했습니다.");
				location.href="/index";
			} else {
				alert("아이디나 비밀번호를 확인해주세요.");
			}
		}).fail(function(error) {
			alert(error);
		});
		
	}

</script>
</html>








