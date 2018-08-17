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
    
    <title>用户列表页</title>
    
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
		  		<th>用户名</th>
		  		<th>密码</th>
		  		<th>角色</th>
		  		<th>操作</th>
		  	</tr>
		  <c:forEach items="${userList}" var="user">
		  	<tr>
		  		<td>${user.id }</td>
		  		<td>${user.userName }</td>
		  		<td>${user.password }</td>
		  		<td>${user.rid }</td>
		  		<td>查看</td>
		  	</tr>
		  </c:forEach> 
		  </table>
		  </div>
		</div>

	</div>
  </body>
</html>
