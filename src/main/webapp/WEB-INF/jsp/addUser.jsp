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
            <h3 class=".topName">系统管理&nbsp;&nbsp;/&nbsp;&nbsp;用户管理</h3>
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
                        <h3 style="margin-left:5px">用户添加</h3>
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
                        <form onsubmit="return addOneUser();" action="user/addOneUser" method="post" id="userForm">
                            <div class="row">
                                <div class="col-md-5 col-md-offset-2">
                                    <div class="col-md-12">

                                        <div class="form-group has-success has-feedback" id="userNameDiv">
                                            <label class="control-label userNameLable" for="inputSuccess2">用户登录名(长度不超过14位,只能中英文，数字，全角字符)</label>
                                            <input type="text" class="form-control userName" id="inputSuccess2"
                                                   aria-describedby="inputSuccess2Status"
                                                   placeholder="用户登录名" onblur="isUserName();" name="userName">
                                            <span id="userNameCheck" aria-hidden="true" class=""></span>
                                        </div>
                                        <div class="form-group has-success has-feedback" id="passwordDiv">
                                            <label class="control-label" for="inputSuccess3">用户密码(长度需6-12位之间,以字母开头，只能包含字符、数字和下划线)</label>
                                            <input type="password" class="form-control password1"
                                                   aria-describedby="inputSuccess3Status"
                                                   id="inputSuccess3" placeholder="用户密码" onblur="isPassword();" name="password">
                                            <span id="passwordCheck" aria-hidden="true" class=""></span>
                                        </div>
                                        <div class="form-group has-success has-feedback" id="phoneDiv">
                                            <label class="control-label" for="inputSuccess1">用户手机号(正确的手机号码格式)</label>
                                            <input type="text" class="form-control phone"
                                                   aria-describedby="inputSuccess1Status"
                                                   id="inputSuccess1" placeholder="用户手机号" onblur="isPhone()" name="phoneNumber">
                                            <span id="phoneCheck" aria-hidden="true" class=""></span>
                                        </div>
                                        <div class="form-group has-success has-feedback" id="emailDiv">
                                            <label class="control-label" for="inputSuccess4">用户邮箱(正确的邮箱地址)</label>
                                            <div class="input-group">
                                                <span class="input-group-addon">@</span>
                                            <input type="text" class="form-control myemail"
                                                   aria-describedby="inputSuccess4Status"
                                                id="inputSuccesse4" placeholder="用户邮箱" onblur="isEmail()" name="email">
                                            </div>
                                            <span id="emailCheck" aria-hidden="true" class=""></span>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">用户姓名</label> <select
                                                class="form-control "
                                                onchange="selectSecondTypeName_(this);" name="employeeName">
                                            <%--<option value="分类">分类</option>--%>
                                            <c:forEach items="${empolyeeList }" var="i">
                                                <option value="${i.name}">${i.name} </option>
                                            </c:forEach>
                                        </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">归属部门</label> <select
                                                class="form-control "
                                                onchange="selectSecondTypeName_(this);" name="deptName">
                                            <%--<option value="分类">分类</option>--%>
                                            <c:forEach items="${deptList }" var="i">
                                                <option value="${i.name}">${i.name} </option>
                                            </c:forEach>
                                        </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">用户状态</label> <select
                                                class="form-control "
                                                onchange="selectSecondTypeName_(this);" name="userState">
                                            <option value="1" selected="selected">有效</option>
                                            <option value="0">无效</option>
                                        </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">用户职务</label> <select
                                                class="form-control "
                                                onchange="selectSecondTypeName_(this);" name="userJob">
                                            <%--<option value="分类">分类</option>--%>
                                            <c:forEach items="${jobList }" var="i">
                                                <option value="${i.job}">${i.job} </option>
                                            </c:forEach>
                                        </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">用户性别</label> <select
                                                class="form-control "
                                                onchange="selectSecondTypeName_(this);" name="sex">
                                            <option value="1" selected="selected">男</option>
                                            <option value="0">女</option>

                                        </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">所属角色</label> <select
                                                class="form-control "
                                                onchange="selectSecondTypeName_(this);" name="rose">
                                            <%--<option value="分类">分类</option>--%>
                                            <c:forEach items="${roseList}" var="i">
                                                <option value="${i.name}">${i.name} </option>
                                            </c:forEach>
                                        </select>
                                        </div>


                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-5 col-md-offset-2">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">备注1</label> <input
                                                type="text" class="form-control" name="remark1"
                                                id="exampleInputPassword1" placeholder="请输入备注1">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-5 col-md-offset-2">
                                    <div class="col-md-6 col-md-offset-0">
                                        <label for="exampleInputPassword1">备注2</label> <input
                                            type="text" class="form-control" name="remark2"
                                            id="exampleInputPassword1" placeholder="请输入备注2">
                                    </div>

                                    <div class="col-md-6 col-md-offset-0">
                                        <label for="exampleInputPassword1">备注3</label> <input
                                            type="text" class="form-control" name="remark3"
                                            id="exampleInputPassword1" placeholder="请输入备注3">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-5 col-md-offset-2">
                                    <div class="col-md-6 col-md-offset-0">
                                        <label for="exampleInputPassword1">备注4</label> <input
                                            type="text" class="form-control" name="remark4"
                                            id="exampleInputPassword1" placeholder="请输入备注4">
                                    </div>

                                    <div class="col-md-6 col-md-offset-0">
                                        <label for="exampleInputPassword1">备注5</label> <input
                                            type="text" class="form-control" name="remark5"
                                            id="exampleInputPassword1" placeholder="请输入备注5">
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
    //判断输入的字符是否为中文
    // 验证用户密码:^[a-zA-Z]\w{5,17}$ 正确格式为：以字母开头，长度在6-18之间，只能包含字符、数字和下划线。
    // 验证用户名或昵称经常用到: ^[\u4e00-\u9fa5A-Za-z0-9-_]*$  只能中英文，数字，下划线，减号
    //简单验证邮箱/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/
    //验证手机号/^0?(13[0-9]|15[012356789]|18[0236789]|14[57])[0-9]{8}$/
    //最长不得超过7个汉字，或14个字节(数字，字母和下划线)正则表达式,^[\u4e00-\u9fa5]{1,7}$|^[\dA-Za-z_]{1,14}$
    //var len = str.match(/[^ -~]/g) == null ? str.length : str.length + str.match(/[^ -~]/g).length
    function isPassword() {
        var str = $(".password1").val().trim();
        if (str.length > 0 && str != "用户密码") {
            reg = /^[a-zA-Z]\w{0,11}$/;
            if (!reg.test(str)) {
                // alert("对不起，您输入的密码格式不正确!");//请将“字符串类型”要换成你要验证的那个属性名称！
                $("#passwordCheck").removeClass("glyphicon glyphicon-ok form-control-feedback");
                $("#passwordDiv").addClass("has-error");
                $("#passwordCheck").addClass("glyphicon glyphicon-remove form-control-feedback");
                return false;
            } else {
                $("#passwordDiv").removeClass("has-error");
                $("#passwordCheck").removeClass("glyphicon glyphicon-remove form-control-feedback");
                $("#passwordCheck").addClass("glyphicon glyphicon-ok form-control-feedback");
                return true;
            }
        } else {
            $("#passwordCheck").removeClass("glyphicon glyphicon-ok form-control-feedback");
            $("#passwordDiv").addClass("has-error");
            $("#passwordCheck").addClass("glyphicon glyphicon-remove form-control-feedback");
            return false;
        }
    }

    function isUserName() {
        var str = $(".userName").val().trim();
        var len = str.match(/[^ -~]/g) == null ? str.length : str.length + str.match(/[^ -~]/g).length;
        if (str.length > 0 && str != "用户登陆名") {
            if (len>14) {
                // alert("对不起，您输入的用户名格式不正确!");//请将“字符串类型”要换成你要验证的那个属性名称！
                $("#userNameCheck").removeClass("glyphicon glyphicon-ok form-control-feedback");
                $("#userNameDiv").addClass("has-error");
                $("#userNameCheck").addClass("glyphicon glyphicon-remove form-control-feedback");
                return false;
            } else {
                $("#userNameDiv").removeClass("has-error");
                $("#userNameCheck").removeClass("glyphicon glyphicon-remove form-control-feedback");
                $("#userNameCheck").addClass("glyphicon glyphicon-ok form-control-feedback");
                return true;
            }

        } else {
            $("#userNameCheck").removeClass("glyphicon glyphicon-ok form-control-feedback");
            $("#userNameDiv").addClass("has-error");
            $("#userNameCheck").addClass("glyphicon glyphicon-remove form-control-feedback");
            return false;
        }
    }

    function isEmail() {
        var str = $(".myemail").val().trim();
        if (str.length > 0&& str != "用户邮箱" ){
            reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
            if (!reg.test(str)) {
                // alert("对不起，您输入的email格式不正确!");//请将“字符串类型”要换成你要验证的那个属性名称！
                $("#emailCheck").removeClass("glyphicon glyphicon-ok form-control-feedback");
                $("#emailDiv").addClass("has-error");
                $("#emailCheck").addClass("glyphicon glyphicon-remove form-control-feedback");
                return false;
            }else {
                        $("#emailDiv").removeClass("has-error");
                        $("#emailCheck").removeClass("glyphicon glyphicon-remove form-control-feedback");
                        $("#emailCheck").addClass("glyphicon glyphicon-ok form-control-feedback");
                        return true;
            }
        }else {
            $("#emailCheck").removeClass("glyphicon glyphicon-ok form-control-feedback");
            $("#emailDiv").addClass("has-error");
            $("#emailCheck").addClass("glyphicon glyphicon-remove form-control-feedback");
            return false;
        }

    }

    function isPhone() {

        var str = $(".phone").val().trim();
        if (str.length > 0 && str != "用户手机号") {
            reg = /^0?(13[0-9]|15[012356789]|18[0236789]|14[57])[0-9]{8}$/;
            if (!reg.test(str)) {
                // alert("对不起，您输入的手机号码格式不正确!");//请将“字符串类型”要换成你要验证的那个属性名称！
                $("#phoneCheck").removeClass("glyphicon glyphicon-ok form-control-feedback");
                $("#phoneDiv").addClass("has-error");
                $("#phoneCheck").addClass("glyphicon glyphicon-remove form-control-feedback");
                return false;
            } else {
                $("#phoneDiv").removeClass("has-error");
                $("#phoneCheck").removeClass("glyphicon glyphicon-remove form-control-feedback");
                $("#phoneCheck").addClass("glyphicon glyphicon-ok form-control-feedback");
                return true;
            }
        } else {
            $("#phoneCheck").removeClass("glyphicon glyphicon-ok form-control-feedback");
            $("#phoneDiv").addClass("has-error");
            $("#phoneCheck").addClass("glyphicon glyphicon-remove form-control-feedback");
            return false;
        }
    }
function addOneUser() {

        if(isUserName()&&isPassword()&&isPhone()&&isEmail()){
            var url ="user/addOneUser";
            var param =$("#userForm").serialize();
            $.post(url,param,function (data) {
                if(data.success == "false"){
                    alert("该用户名已经存在,请重新输入");

            }else {
                    alert("成功添加新用户")
                }


            },"json");
            return false;

        }else {
            alert("用户信息输入有误,无法提交,请重新输入")
            return false;
        }



}

</script>

</html>
