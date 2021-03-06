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
		
			<div class ="panel-heading">게시글 조회</div>
			<!-- /.panel heading -->
			<div class="panel-body">
				<div class="form-group">
					<label>Bno</label> <input class="form-control" name='bno'
					value='<c:out value="${boardVO.bno}"/>' readonly="readonly">
				</div> 
				
				<div class="form-group">
					<label>제목</label> <input class="form-control" name='title'
					value='<c:out value="${boardVO.title}"/>' readonly="readonly">
				</div> 
				
				<div class="form-group">
					<label>내용</label> 
					<textarea  class="form-control" rows="3" name='content'
					readonly="readonly"><c:out value="${boardVO.content}"/></textarea>
				</div>
				
				<div class="form-group">
					<label>작성자</label> <input class="form-control" name='writer'
					value='<c:out value="${boardVO.writer}"/>' readonly="readonly">
				</div>
				
				<button id="ModiBtn" class="btn btn-default">Modify</button>
			
				<button id="ListBtn" class="btn btn-default" onclick="location.href='board/after'">List</button>
							
				<button id="DelBtn" class="btn btn-default">Delete</button>
			
				</div><!-- end panel-body -->
				<form id="Form" method="post">
					<input type="hidden" name="bno" value="${boardVO.bno}">
				</form>
			</div>
			<!-- end panel-body -->
		</div>
		<!-- end panel -->
	</div>
	<!-- /.row -->
		
		<script>
		
		$(document).ready(function(){
			var Formobj= $("#Form");
			$("#ModiBtn").on("click",function(){
				Formobj.attr("action","/board/modify_after");
				Formobj.attr("method","get");
				Formobj.submit();
			});
			
			$("#ListBtn").on("click",function(){
				self.location ="/board/after";
				
				});
			$("#DelBtn").on("click",function(){
				Formobj.attr("action","/board/remove_after");
				Formobj.submit();
			});

		});		
		
		</script>
		
		<%@ include file="../include/footer.jsp"%>
		