<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <base href="<%=basePath%>">
    
    <title>图书列表页</title>
    
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>

  </head>
  
  <body>
    <div class="container">
		<div class="row">
		  <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		  <h1>欢迎访问</h1>
		  </div>
		</div>
		<div class="row">
		  <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		  <table class="table table-striped">
		  	<tr>
		  		<th>ID</th>
		  		<th>书名</th>
		  		<th>作者</th>
		  		<th>频道</th>
		  		<th>状态</th>
		  		<th>是否收费</th>
		  		<th>阅读人数</th>
		  		<th>操作</th>
		  	</tr>
		<%--   <c:forEach items="${bookList}" var="book"> --%>
		  <c:forEach items="${page.list}" var="book">
			  <tr>
				  <td>${book.bookId }</td>
				  <td>${book.bookName }</td>
				  <td>${book.authorName }</td>
				  <td>
					  <c:if test="${book.attribution==1}">男频</c:if>
					  <c:if test="${book.attribution==2}">女频</c:if>
					  <c:if test="${book.attribution==3}">出版</c:if>
				  </td>
				  <td>
					  <c:if test="${book.status==1}">连载</c:if>
					  <c:if test="${book.status==2}">完本</c:if>
				  </td>
				  <td>
					  <c:if test="${book.isVip==true}">免费</c:if>
					  <c:if test="${book.isVip==false}">收费</c:if>
				  </td>
				  <td>${book.readCount }</td>
				  <td>查看|编辑|删除</td>
			  </tr>
		  </c:forEach>
		  </table>
		  </div>
		   <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		   	<nav aria-label="...">
			  <ul class="pagination">
			    <li class="disabled"><a href="book/list" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
			    <c:forEach items="${page.navigatepageNums }" var="ps">
			    	<c:if test="${page.pageNum==ps }">
			    		<c:set var="act" value="active"></c:set>
			    	</c:if>
			     <li class="act">
			     	<a href="book/list?pageNum=${ps }&pageSize=${page.pageSize}">${ps }<span class="sr-only">(current)</span></a>
			     </li>
			     
			    </c:forEach>
			    
			    <li class="diabled"><a href="#" aria-label="Next"><span aria-hidden="">»</span></a></li>
			  </ul>
			</nav>
	
		   </div>
		  
		</div>

	</div>
  </body>
</html>
