<%@ page language="java" contentType ="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../include/header.jsp"%>
<div class = "row">
	<div class= "col-lg-12">
		<h1	class= "page-header">KW FLEE Market</h1>
	</div><!--/.col-lg-12  -->
</div><!-- /.row -->

<div class = "row">
	<div class= "col-lg-12">
	
		<div class ="panel panel-default">
		
			<div class ="panel-heading">게시글 수정</div>
			<!-- /.panel heading -->
			<div class="panel-body">
			
			<form role="form" method="post" action="/board/modify_sell">
				<div class="form-group">
					<label>Bno</label> <input class="form-control" name='bno'
					value="${boardVO.bno}" readonly="readonly">
				</div> 
				<div class="form-group">
					<label>제목</label> <input class="form-control" name='title'
					value="${boardVO.title}" >
				</div>
				<div class="form-group">
					<label>내용</label> 
					<textarea  class="form-control" rows="3" name='content'><c:out value="${boardVO.content}"/></textarea>
				</div> 
				<div class="form-group">
				<label>작성자</label> <input class="form-control" name='writer'
				value="${boardVO.writer }" readonly = "readonly">
				</div>
				<button id="ModiBtn" type="submit" class="btn btn-default">수정</button>
			
				<button id="ListBtn" type="submit" class="btn btn-default">목록</button>
			</form>
			</div><!-- end panel-body -->
		</div><!-- end panel-body -->
	</div><!-- end panel -->
</div><!-- /.row -->

<script>

$(document).ready(function(){

	$("#ListBtn").on("click",function(){
		var Formobj= $("form[role='form']");
		Formobj.attr("action","/board/sell");
		Formobj.attr("method","get");
		Formobj.submit();
	});
	$("#ModiBtn").on("click",function(){
		if($("input[name=title]").val()==""){
			alert("제목을 입력하세요.!");
			$("input[name='title']").focus();
			return false;
		}
		if($("input[name=content]").val()==""){
			alert("내용을 입력하세요.!");
			$("input[name='content']").focus();
			return false;
		}
			return true;
	});

});
</script>
<%@ include file="../include/footer.jsp"%>
