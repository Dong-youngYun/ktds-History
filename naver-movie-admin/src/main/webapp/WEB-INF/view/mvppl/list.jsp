<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<c:set var="date" value="<%= new Random().nextInt() %>" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../include/stylescript.jsp" />
<script type="text/javascript">
	$().ready(function() {
		
		$(".grid > table > tbody > tr").click(function() {
			$("#isModify").val("true"); //수정모드
			
			var data = $(this).data();
			$("#gnrId").val(data.gnrid);
			$("#gnrNm").val(data.gnrnm);
			$("#crtr").val(data.crtr);
			$("#crtDt").val(data.crtdt);
			$("#mdfyr").val(data.mdfyr);
			$("#mdfyDt").val(data.mdfydt);
			
			$("#useYn").prop("checked", data.useyn == "Y");
		});
		
		$("#new_btn").click(function() {
			
			$("#isModify").val("false"); //등록모드
			
			$("#gnrId").val("");
			$("#gnrNm").val("");
			$("#crtr").val("");
			$("#crtDt").val("");
			$("#mdfyr").val("");
			$("#mdfyDt").val(0);
			
			$("#useYn").prop("checked", false);
		});
		
		$("#delete_btn").click(function() {
			var gnrId =$("#gnrId").val()
			if (gnrId == "") {
				alert("선택된 장르가 없습니다.");
				return;
			}
			
			if (!confirm("정말 삭제하시겠습니까?")) { <!-- 사용자에게 확인  확인시 예를 누르면 false값이 return으로 온다.-->
				return;
			}
			
			$.get("${context}/api/mvppl/delete/" + gnrId, function(response) {
				if (response.status == "200 OK") {
					location.reload(); //새로고침
				}
				else {
					alert(response.errorCode + " / " + response.message);
				}
			});
		})
		
		$("#save_btn").click(function() {
			
			var fm = new FormData();
			fm.append("uploadFile", $('#prflPctr')[0].files[0])
			fm.append("nm", $("#nm").val());
			fm.append("rlNm", $("#rlNm").val());
			fm.append("useYn", $("#useYn:checked").val() || "N"); //값이 undifined라면 N을 넣어라
			
			$.ajax({
				type: "POST",
				url: "${context}/api/mvppl/create",
				processData: false,
				contentType: false,
				data: fm,
				success: function(response) {
					console.log(response)
				}
			});
			
			return;
			
			if($("#isModify").val() == "false") {
				//신규등록
				$.post("${context}/api/mvppl/create", $("#detail-form").serialize(), function(response) {
					if (response.status == "200 OK") {
						location.reload(); //새로고침
					}
					else {
						alert(response.errorCode + " / " + response.message);
					}
				
				});
			}
			else {
				//수정
				$.post("${context}/api/mvppl/update", $("#detail-form").serialize(), function(response) {
					if (response.status == "200 OK") {
						location.reload(); //새로고침
					}
					else {
						alert(response.errorCode + " / " + response.message);
					}
				});
			}
		});
		
		$("#search-btn").click(function() {
			movePage(0)
		});
		
		$("#all_check").change(function() {
		/* 	console.log($(this).prop("checked")); */
			$(".check_idx").prop("checked", $(this).prop("checked"));
		});
		
		$(".check_idx").change(function() {
			var count = $(".check_idx").length;
			var checkCount = $(".check_idx:checked").length;
			$("#all_check").prop("checked", count == checkCount);
		});
		
		$("#delete_all_btn").click(function() {
			var checkLen = $(".check_idx:checked").length;
			if (checkLen == 0) {
				alert("삭제할 장르가 없습니다.");
				return;
			}
			
			var form = $("<form></form>")
			
			$(".check_idx:checked").each(function() {
				console.log($(this).val());
				form.append("<input type='hidden' name='gnrId' value='" + $(this).val() + "'>"); //name이 같으면 컬렉션으로 받는다 받아올때 List로 받는다.
			});
			
			$.post("${context}/api/mvppl/delete", form.serialize(), function(response) {
				if (response.status == "200 OK") {
					location.reload(); //새로고침
				}
				else {
					alert(response.errorCode + " / " + response.message);
				}
			});
		});
		
	});
		function movePage(pageNo) {
			// 전송
			// 입력 값
			var gnrNm = $("#search-keyword").val();
			// URL 요청
			location.href = "${context}/mvppl/list?gnrNm=" + gnrNm + "&pageNo=" + pageNo;
		}
</script>
</head>
<body>
	<div class="main-layout">
		<jsp:include page="../include/header.jsp" />
		<div>
			<jsp:include page="../include/mvMgntsidemenu.jsp" />
			<jsp:include page="../include/content.jsp" />
			
				<div class="path">영화 > 영화인관리</div>
				<div class="search-row-group">
					<div class="search-group">
						<label for="search-keyword-nm">이름</label>
						<input type="text" id="search-keyword-nm" class="search-input" value="${mvPplVO.nm}"/>
						
						<label for="search-keyword-rlnm">본명</label>
						<input type="text" id="search-keyword-rlnm" class="search-input" value="${mvPplVO.rlNm}"/>
					</div>
					
					<div class="search-group">
						<label for="search-keyword-startdt">조회기간</label>
						<input type="date" id="search-keyword-startdt" class="search-input" value="${mvPplVO.startDt}"/>
						<input type="date" id="search-keyword-enddt" class="search-input" value="${mvPplVO.endDt}"/>
						
						<button class="btn-search" id="search-btn">검색</button>
					</div>
				</div>
				<div class="grid">
					
					<div class="grid-count align-right">
						총 ${mvPplList.size() > 0 ? mvPplList.get(0).totalCount : 0}건 
					</div>
					<table>
						<thead>
							<tr>
								<th><input type="checkbox" id="all_check" /></th>
								<th>영화인ID</th>
								<th>프로필사진</th>
								<th>이름</th>
								<th>본명</th>
								<th>등록자</th>
								<th>등록일</th>
								<th>수정자</th>
								<th>수정일</th>
								<th>사용여부</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${not empty mvPplList}">
									<c:forEach items="${mvPplList}"
												var="mvPpl">
										<tr data-mvpplid="${mvPpl.mvPplId}"
											data-prflpctr="${mvPpl.prflPctr}"
											data-nm="${mvPpl.nm}"
											data-rlnm="${mvPpl.rlNm}"
											data-crtr="${mvPpl.crtr}"
											data-crtdt="${mvPpl.crtDt}"
											data-mdfyr="${mvPpl.mdfyr}"
											data-mdfydt="${mvPpl.mdfyDt}"
											data-useyn="${mvPpl.useYn}"
											data-crtrnm="${mvPpl.crtrMbrVO.mbrNm}"
											data-mdfyrnm="${mvPpl.mdfyrMbrVO.mbrNm}">
											<td>
												<input type="checkbox" class="check_idx" value="${mvPpl.mvPplId}"/>
											</td>
											<td>${mvPpl.mvPplId}</td>
											<td>${mvPpl.prflPctr}</td>
											<td>${mvPpl.nm}</td>
											<td>${mvPpl.rlNm}</td>
											<td>${mvPpl.crtr}(${mvPpl.crtrMbrVO.mbrNm})</td>
											<td>${mvPpl.crtDt}</td>
											<td>${mvPpl.mdfyr}(${mvPpl.mdfyrMbrVO.mbrNm})</td>
											<td>${mvPpl.mdfyDt}</td>
											<td>${mvPpl.useYn}</td>
										</tr>
									</c:forEach>
								</c:when>
								<c:otherwise>
									<tr>
										<td colspan="9" class="no-items">
											등록된 장르가 없습니다.
										</td>
									</tr>
								</c:otherwise>
							</c:choose>
						</tbody>
					</table>
					
					<div class="align-right mt-10">
						<button id="delete_all_btn" class="btn-delete">삭제</button>
					</div>
					
					<div class="pagenate">
						<ul>
							<c:set value="${mvPplList.size() > 0 ? mvPplList.get(0).lastPage : 0}" var="lastPage" />
							<c:set value="${mvPplList.size() > 0 ? mvPplList.get(0).lastGroup : 0}" var="lastGroup" />
							
							<fmt:parseNumber var="nowGroup" value="${Math.floor(gnrVO.pageNo / 10)}" integerOnly="true" />
							<c:set value="${nowGroup * 10}" var="groupStartPageNo" />
							<c:set value="${groupStartPageNo + 10}" var="groupEndPageNo" />
							<c:set value="${groupEndPageNo > lastPage ? lastPage : groupEndPageNo-1}" var="groupEndPageNo" />
							
							<c:set value="${(nowGroup - 1) * 10}" var="prevGroupStartPageNo" />
							<c:set value="${(nowGroup + 1) * 10}" var="nextGroupStartPageNo" />
							
							<!--lastPage: ${lastPage}
							lastGroup: $lastGroup}
							nowGroup: ${nowGroup}
							groupStartPageNo: ${groupStartPageNo}
							groupEndPageNo: ${groupEndPageNo}
							prevGroupStartPageNo: ${prevGroupStartPageNo}
							nextGroupStartPageNo: ${nextGroupStartPageNo}  -->
							
							<c:if test="${nowGroup > 0}">
								<li><a href="javascript:movePage(0)">처음</a></li>
								<li><a href="javascript:movePage(${prevGroupStartPageNo})">이전</a></li>
							</c:if>
							
							<c:forEach begin="${groupStartPageNo}" end="${groupEndPageNo}" step="1" var="pageNo">
								<li><a class="${pageNo eq mvPplVO.pageNo ? 'on' : ''}" href="javascript:movePage(${pageNo})">${pageNo+1}</a></li>
							</c:forEach>
							
							<c:if test="${lastGroup > nowGroup}">
								<li><a href="javascript:movePage(${nextGroupStartPageNo})">다음</a></li>
								<li><a href="javascript:movePage(${lastPage})">끝</a></li>
							</c:if>
							
						</ul>
					</div>
					
				</div>
				
				<div class="grid-detail">
					<form id="detail_form" enctype="multipart/form-data">
						<!--
						isModify == true => 수정 (update)
						isModify == false => 등록 (insert)	
						-->
						<input type="hidden" id="isModify" value="false" />
						<div class="input-group inline">
							<label for="mvPplId" style="width: 180px;">영화인ID</label><input type="text" id="mvPplId" name="mvPplId" readonly value="" />
						</div>
						<div class="input-group inline">
							<label for="prflPctr" style="width: 180px;">프로필사진</label><input type="file" id="prflPctr" name="prflPctr" value=""/>
						</div>
						<div class="input-group inline">
							<label for="nm" style="width: 180px;">이름</label><input type="text" id="nm" name="nm" value=""/>
						</div>
						<div class="input-group inline">
							<label for="rlNm" style="width: 180px;">본명</label><input type="text" id="rlNm" name="rlNm" value=""/>
						</div>
						<div class="input-group inline">
							<label for="crtr" style="width: 180px;">등록자</label><input type="text" id="crtr" disabled value=""/>
						</div>
						<div class="input-group inline">
							<label for="crtDt" style="width: 180px;">등록일</label><input type="text" id="crtDt" disabled value=""/>
						</div>
						<div class="input-group inline">
							<label for="mdfyr" style="width: 180px;">수정자</label><input type="text" id="mdfyr" disabled value=""/>
						</div>
						<div class="input-group inline">
							<label for="mdfyDt" style="width: 180px;">수정일</label><input type="text" id="mdfyDt" disabled value=""/>
						</div>
						<div class="input-group inline">
							<label for="useYn" style="width: 180px;">사용여부</label><input type="checkbox" id="useYn" name="useYn" value="Y"/>
						</div>
					</form>
				</div>
				<div class="align-right">
					<button id="new_btn" class="btn-primary">신규</button>
					<button id="save_btn" class="btn-primary">저장</button>
					<button id="delete_btn" class="btn-delete">삭제</button>
				</div>
			<jsp:include page="../include/footer.jsp" />
		</div>
	</div>
</body>
</html>