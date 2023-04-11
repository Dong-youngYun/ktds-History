<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<c:set var="date" value="<%= new Random().nextInt() %>" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${context}/css/common.css?p=${date}"/>
<script type="text/javascript" src="${context}/js/jquery-3.6.4.min.js"></script>
<script type="text/javascript">
	$().ready(function() {
		
		$(".menu-item").mouseenter(function() {
			$(this).addClass("on");
			$(this).find(".sub-item").addClass("on");
		}).mouseleave(function() {
			$(this).removeClass("on");
			$(this).find(".sub-item").removeClass("on");
		});
	});
</script>
</head>
<body>
	
	<div class="mv-header">
		<ul>
			<li class="menu-item on">홈</li>
			<li class="menu-item">
				랭킹
				<ul class="sub-item">
					<li class="menu-item">예매순위</li>
					<li class="menu-item">박스오피스</li>
					<li class="menu-item">OTT</li>
				</ul>
			</li>
			<li class="menu-item">
				상영/예정작
				<ul class="sub-item">
					<li class="menu-item">영화관</li>
					<li class="menu-item">넷플릭스</li>
					<li class="menu-item">왓챠</li>
				</ul>
			</li>
			<li class="menu-item">
				콘텐츠
				<ul class="sub-item">
					<li class="menu-item">영화뉴스</li>
					<li class="menu-item">매거진</li>
					<li class="menu-item">브런치스토리</li>
				</ul>
			</li>
		</ul>
	</div>
	<div class="index-mv-background"></div>
	
</body>
</html>