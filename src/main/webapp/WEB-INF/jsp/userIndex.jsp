<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 2018/8/16
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    int i = 0;
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>首页</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="js/jquery.form.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>


</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <!--头部文件-->
    <%@include file="header.jsp" %>

    <!-- 左侧导航区域（可配合已有的头部文件） -->
    <div id="ajax_left_side">
    <%@include file="common/left_side_user.jsp" %>
    </div>

    <div class="layui-body">
        <div style="padding: 15px;">
            <!-- 内容主体区域 -->
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>电子商务平台进销存系统</legend>
            </fieldset>
            <!--面包屑-->
            <div id="changeArea">

            </div>
        </div>
    </div>
    <%--底部区域--%>
    <%@include file="footer.jsp" %>
</div>


<script src="layui/layui.js" type="text/javascript"></script>
<script src="layui/layui.all.js" type="text/javascript"></script>

<script>
    //一般直接写在一个js文件中
    layui.use(['layer', 'form', 'element', 'table', 'laypage'], function () {
        var layer = layui.layer
            , form = layui.form
            , element = layui.element
            , table = layui.table
            , laypage = layui.laypage;

    });
</script>
<script type="text/javascript">
    $(function () {
        //方法一直接使用独立的laypage插件，具体分页实现请看core.js里面，缺点：样式比较单一
        //core.getUserListByPage();
    });
    //
    //方法二则直接使用layui-v2.0.2里面的分页功能，没有用到core.js里面的方法




</script>
<script src="/js/goods.js"></script>
<script type="text/javascript">
    function addUser() {
        var url = "user/addUser";

        $.get(url, function (data) {
            // $("#mainArea").html(data)
            $("#changeArea").html(data)
        }, "html")

    }

    function loadAllUser() {
        var url = "user/selectAllUser2";
        $.get(url,function (data) {
            $("#changeArea").html(data);

        });

    }
    function loadAllRose() {
        var url = "rose/selectAllRoseAndPower2";
        $.get(url,function (data) {
            $("#changeArea").html(data);

        });

    }
    function loadAllPower() {
        var url ="power/selectAllPowerAndRose2";
        $.get(url,function (data) {
            $("#changeArea").html(data);
        })
    }
    function loadAllIp() {
        var url ="ip/selectAllIpDeptEmployee2";
        $.get(url,function (data) {
            $("#changeArea").html(data);
        })
    }
    function loadAllLogger() {
        var url ="systemLogger/selectAllLogger2";
        $.get(url,function (data) {
            $("#changeArea").html(data);
        })

    }

</script>
</body>
</html>