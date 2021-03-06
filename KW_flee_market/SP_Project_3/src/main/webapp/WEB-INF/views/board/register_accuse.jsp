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
		
			<div class ="panel-heading">게시글 작성</div><!-- /.panel heading -->

			<div class="panel-body">
			<form role="form" action="/board/register_accuse" method="post">
				<div class="form-group">
					<label>제목</label> <input class="form-control" name='title'>
				</div> 
				<div class="form-group">
					<label>내용</label> 
					<input type="text"  class="form-control" rows="3" name='content'>
				</div> 
				<div class="form-group">
				<label>작성자</label> <input class="form-control" name='writer'>
				</div>
				<button id="SubmitBtn" type="submit" class="btn btn-default">Submit Button</button>
			
				<button type="reset" class="btn btn-default">Reset Button</button>
			
				<button id="ListBtn"  class="btn btn-default">List</button>
			</form>
			</div><!-- end panel-body -->
		</div><!-- end panel-body -->
	</div><!-- end panel -->
</div><!-- /.row -->

<script>
$(document).ready(function(){
	var Formobj= $("form[role='form']");
	$("#ListBtn").on("click",function(){
		Formobj.attr("action","/board/accuse");
		Formobj.attr("method","get");
		Formobj.submit();
	});
	$("#SubmitBtn").on("click",function(){
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
		if($("input[name='writer']").val()==""){
			alert("이름을 입력하세요.!");
			$("input[name='writer']").focus();
			return false;
		}
	});
});
</script>
<%@ include file="../include/footer.jsp"%>
