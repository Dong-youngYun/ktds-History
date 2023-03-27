<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.4.min.js"></script>
<script type="text/javascript">
	$().ready(function() {
	});
</script>
</head>
<body>

	<h1>회원가입을 환영합니다!</h1>
	<form action="${pageContext.request.contextPath}/member/regist" method="post"> <!-- form태그 서버로 전송하기위한 태그 -->
		
		<div>
			<label for="email">이메일:</label> <!-- for에 id의 값을 똑같이 input tag가 있으면 label은 필수 -->
			<input type="email" name="email" id="email" placeholder="EMAIL을 입력하세요." /> <!-- placeholder는 가이드역할 -->
		</div>
		<div>
			<label for="name">이름:</label>
			<input type="text" name="name" id="name" placeholder="이름을 입력하세요." />
		</div>
		<div>
			<label for="password">비밀번호:</label>
			<input type="password" name="password" id="password" placeholder="비밀번호를 입력하세요."/>
		</div>
		<div>
			<input type="submit" value="가입" />
		</div>
		
	</form>

</body>
</html>