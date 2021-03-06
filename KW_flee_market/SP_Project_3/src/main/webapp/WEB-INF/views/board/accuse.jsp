<%@ page language="java" contentType ="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	
<%@ include file="../include/header.jsp"%>
<div class = "row">
	<div class= "col-lg-12">
		<h1	class= "page-header">KW FLEE Market</h1>
	</div><!--/.col-lg-12  -->
</div><!-- /.row -->
<div class ="row">
	<div class ="col-lg-12">
		<div class ="panel panel-default">
		
			
		
			<div class ="panel-heading">
				사기 고발 게시판
				<button id='regBtn' type="button" onclick="location.href='/board/register_accuse'" class="btn btn-xs pull-right">글 작성</button>
			</div><!-- /.pannel-heading -->	
			<div class="panel-body">
			<table class="table table-striped table-borderd table-hover">
				<thead>
				<tr>
					<th>#번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<c:forEach var="boardVO" items="${list}">
				<tr>
					<td>${boardVO.bno}</td>
					<!-- 여기 href앞에 /board있었는데 리스트 넘기는게 안되서 지웠음 참고  다시 써넣음 -->
					<td><a href='/board/read_accuse?bno=${boardVO.bno}'>${boardVO.title}</a></td>
					<td>${boardVO.writer}</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate}" /></td>
					<td><span class="badge bg-red">${boardVO.viewcnt}</span></td>
				</tr>
				</c:forEach>
			</table>
			
			<c:if test="${pageMaker.prev}">

				<a href="accuse${pageMaker.makeQuery(pageMaker.startPage - 1) }">«</a>

			</c:if>


			<c:forEach begin="${pageMaker.startPage }"

				end="${pageMaker.endPage }" var="idx">


				<c:out value="${pageMaker.cri.page == idx?'':''}" />

				<a href="accuse${pageMaker.makeQuery(idx)}">${idx}</a>

			</c:forEach>


			<c:if test="${pageMaker.next && pageMaker.endPage > 0}">

				<a href="accuse${pageMaker.makeQuery(pageMaker.endPage +1) }"> » </a>

			</c:if> <br>
			
			
			<button id="ListBtn" class="btn btn-default" onclick="location.href='/'">메인 화면</button>	
			<button id="List1Btn" class="btn btn-default" onclick="location.href='board/freetalk'">자유게시판</button>
			<button id="List2Btn" class="btn btn-default" onclick="location.href='board/accuse'">신고 게시판</button>
			<button id="List3Btn" class="btn btn-default" onclick="location.href='board/purchase'">구매 게시판</button>
			<button id="List4Btn" class="btn btn-default" onclick="location.href='board/sell'">판매 게시판</button>
			<button id="List5Btn" class="btn btn-default" onclick="location.href='board/after'">거래 후기 게시판</button>
			</div><!-- end panel-body -->
		</div><!-- end panel -->
	</div><!-- /.col-lg-12 -->
</div><!-- /.row -->

<script>
var result =  '${msg}';
if(result == 'SUCCESS'){
	alert("처리가 완료되었습니다.");
}
</script>
<script>
$(document).ready(function(){
	var Formobj= $("#Form");
	$("#ListBtn").on("click",function(){
		self.location ="/";
		});
	
	$("#List1Btn").on("click",function(){
		self.location ="/board/freetalk";
		});
	
	$("#List2Btn").on("click",function(){
		self.location ="/board/accuse";
		});
	
	$("#List3Btn").on("click",function(){
		self.location ="/board/purchase";
		});
	
	$("#List4Btn").on("click",function(){
		self.location ="/board/sell";
		});
	
	$("#List5Btn").on("click",function(){
		self.location ="/board/after";
		});
});	
</script>
<%@ include file="../include/footer.jsp"%>
