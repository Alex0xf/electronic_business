<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/8/24
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    String admin_name = request.getParameter("user_name");
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <base href="<%=basePath%>">

    <title>用户首页</title>

    <meta charset="utf-8">


</head>

<body>
<div id="wrapper">
    <!-- 		<!--left start  -->
    <%-- 		<%@ include file="/WEB-INF/jsp/common/left.jsp"%> --%>
    <!-- 		<!--left endt  -->
    <!-- 		<div id="page-wrapper" class="gray-bg"> -->
    <!-- 			<!--top start  -->
    <%-- 			<%@ include file="/WEB-INF/jsp/common/top.jsp"%> --%>
    <!-- 			<!--top end  -->
    <!--            从这开始下面全用ajax刷新 -->
    <!-- 		面包屑 start -->
    <div class="row wrapper border-bottom white-bg page-heading" style="margin-left:9px">
        <div class="col-lg-10" style="margin-left:-9px">
            <h3 class=".topName">系统管理&nbsp;&nbsp;/&nbsp;&nbsp;角色管理</h3>
            <ol class="breadcrumb">
                <li><a href="static/inspinia/index.html"></a></li>

            </ol>
        </div>

    </div>
    <!-- 面包屑 end -->
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-lg-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h3 style="margin-left:5px">角色添加</h3>
                        <!-- 							<div class="ibox-tools"> -->

                        <!-- 								<a class="collapse-link"> <i class="fa fa-chevron-up"></i> -->
                        <!-- 								</a> <a class="dropdown-toggle" data-toggle="dropdown" -->
                        <!-- 									href="static/inspinia/table_data_tables.html#"> <i -->
                        <!-- 									class="fa fa-wrench"></i> -->
                        <!-- 								</a> -->
                        <!-- 								<ul class="dropdown-menu dropdown-user"> -->
                        <!-- 									<li><a href="static/inspinia/table_data_tables.html#">Config -->
                        <!-- 											option 1</a></li> -->
                        <!-- 									<li><a href="static/inspinia/table_data_tables.html#">Config -->
                        <!-- 											option 2</a></li> -->
                        <!-- 								</ul> -->
                        <!-- 								<a class="close-link"> <i class="fa fa-times"></i> -->
                        <!-- 								</a> -->
                        <!-- 							</div> -->
                    </div>

                    <div class="ibox-content">
                        <form onsubmit="return addOneRose();" action="rose/addOneRose" method="post" id="roseForm">
                            <div class="row">
                                <div class="col-md-5 col-md-offset-2">
                                    <div class="col-md-12">

                                        <div class="form-group " id="userNameDiv">
                                            <label class="control-label userNameLable" for="inputSuccess2">角色名称</label>
                                            <input type="text" class="form-control userName" id="inputSuccess2"
                                                   placeholder="角色名称"  name="name">

                                        </div>
                                        <div class="form-group " id="passwordDiv">
                                            <label class="control-label" for="inputSuccess3">角色描述</label>
                                            <input type="password" class="form-control password1"
                                                   id="inputSuccess3" placeholder="角色描述"  name="description">

                                        </div>

                                        <div class="form-group">
                                            <label for="exampleInputPassword1">权限设定</label> <select
                                                class="form-control "
                                                onchange="selectSecondTypeName_(this);" name="power">
                                            <%--<option value="分类">分类</option>--%>
                                            <c:forEach items="${powerList }" var="i">
                                                <option value="${i.id}">${i.name} </option>
                                            </c:forEach>
                                        </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">角色部门</label> <select
                                                class="form-control "
                                                onchange="selectSecondTypeName_(this);" name="dept">
                                            <%--<option value="分类">分类</option>--%>
                                            <c:forEach items="${deptList }" var="i">
                                                <option value="${i.id}">${i.name} </option>
                                            </c:forEach>
                                        </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">角色状态</label> <select
                                                class="form-control "
                                                onchange="selectSecondTypeName_(this);" name="State">
                                            <option value="1" selected="selected">有效</option>
                                            <option value="0">无效</option>
                                        </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-5 col-md-offset-2">
                                    <div class="col-md-5 ">
                                        <button type="submit" class="btn btn-success" >保存</button>
                                        <%--<button type="submit" class="btn btn-success">重置</button>--%>
                                        <%--<button type="submit" class="btn btn-success">返回</button>--%>

                                    </div>

                                </div>


                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- 			<!--bottom start -->
<%-- 			<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%> --%>
<!-- 			<!--bottom end -->
</body>
<script type="text/javascript">

    function addOneRose() {
        var  url = "rose/addOneRose";
        var  param = $("#roseForm").serialize();
        $.post(url,param,function (data) {
            if(data.success == "false"){
                alert("该角色已经存在,无法提交,请重新输入");

            }else {
                alert("成功添加新用户")
            }

        },"json");
        return false;


        // if(isUserName()&&isPassword()&&isPhone()&&isEmail()){
        //     var url ="user/addOneUser";
        //     var param =$("#userForm").serialize();
        //     $.post(url,param,function (data) {
        //         if(data.success == "false"){
        //             alert("该用户名已经存在,请重新输入");
        //
        //         }else {
        //             alert("成功添加新用户")
        //         }
        //
        //
        //     },"json");
        //     return false;
        //
        // }else {
        //     alert("用户信息输入有误,无法提交,请重新输入")
        //     return false;
        // }
        //


    }

</script>

</html>
