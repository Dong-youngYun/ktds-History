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
	
	<form action="${pageContext.request.contextPath}/topic/write" method="post" enctype="multipart/form-data">
	
		<div>
			<label for="subject">제목</label>
			<input type="text" name="subject" id="subject" placeholder="제목입력" />
		</div>
		<div> <!-- 똑같은 이름의 태그가 여러개 있으면 컬렉션을 만들어낸다. -> 받을때도 컬렉션으로 받는다.(controller에서) -->
			<label for="uploadFile">파일</label>
			<input type="file" name="uploadFile" id="uploadFile" placeholder="파일을 선택하세요." />
			<input type="file" name="uploadFile" placeholder="파일을 선택하세요." />
			<input type="file" name="uploadFile" placeholder="파일을 선택하세요." />
		</div>
		<div>
			<label for="content">내용</label> <!-- 여러줄을 쓰는 경우 textarea  input은 한줄만 가능 -->
			<textarea name="content" id="content" placeholder="내용"></textarea>
		</div>
		<div>
			<input type="submit" value="등록" /> <!-- submit form의 내용을 전송해라 -->
		</div>
	</form>
	
</body>
</html>