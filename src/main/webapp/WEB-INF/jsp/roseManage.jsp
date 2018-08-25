<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/8/24
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="layui/layui.js" type="text/javascript"></script>
<script src="layui/layui.all.js" type="text/javascript"></script>
<blockquote class="layui-elem-quote">
               <span class="layui-breadcrumb">
                   <a href="">系统管理</a>
                    <a href="">角色管理</a>
                    <a><cite>角色查询</cite></a>
               </span></blockquote>
<div id="mainArea">
    <a><cite>角色管理</cite></a>
    <table class="layui-table">
        <thead>
        <tr>
            <th>序号</th>
            <th>选择角色</th>
            <th>角色编码</th>
            <th>角色名称</th>
            <th>角色描述</th>
            <th>角色状态</th>
            <th>角色部门</th>
            <th>权限设定</th>
            <th colspan="2"> 操作</th>
        </tr>
        </thead>
        <tbody id="tbody">
        </tbody>
    </table>


    <div>
        <button class='layui-btn' id="addRose" onclick="addRose();">添加</button>
    </div>

    <!-- 分页标签 -->
    <div id="page1"></div>


</div>
<script type="text/javascript">
    function addRose() {
        var url = "rose/addRose";

        $.get(url, function (data) {
            $("#changeArea").html(data)
        }, "html")

    }
    //方法二则直接使用layui-v2.0.2里面的分页功能，没有用到core.js里面的方法
$(function ($) {
    console.log("加载时间执行")
    layui.use('laypage', function () {
        var laypage = layui.laypage;
        var url = "rose/selectAllRoseAndPower";
        var config = {page: 1, pageSize: 1};
        $.getJSON(url, config, function (res) {
            laypage.render({
                elem: 'page1',
                count: res.total, //总条数
                limit: config.pageSize, //每页条数
                limits: [1, 2, 3],
                layout: ['count', 'limit', 'skip', 'prev', 'next', 'page'],
                theme: '#FFB800', //自定义颜色
                jump: function (obj, first) {


                    if (!first) { //首次则不进入
                        config.page = obj.curr;
                        config.pageSize = obj.limit;
                        getUserListByPage(url, config);
                    }
                }
            });
            parseUserList(res, config.page);
        });
    });


});



    //点击页数从后台获取数据
    function getUserListByPage(url, config) {
        $.getJSON(url, config, function (res) {
            parseUserList(res, config.page);
        });
    }

    //解析数据，currPage参数为预留参数，当删除一行刷新列表时，可以记住当前页而不至于显示到首页去
    function parseUserList(res, currPage) {
        var content = "";
        $.each(res.rows, function (i, o) {
            content += "<tr>";
            content += "<td>" + o.id + "</td>";
            content += "<td><input type='checkbox'  /></td>";
            content += "<td>" + o.roseId + "</td>";
            content += "<td>" + o.name + "</td>";
            content += "<td>" + o.description + "</td>";
            // content += "<td>" + o.sex + "</td>";
            <%--content += "<td><c:if test='${o.sex==1}'>男</c:if><c:if test='${o.sex == 0}'>女</c:if></td>";--%>
            // if (o.sex == 1) {
            //     content += "<td>男</td>";
            // } else {
            //     content += "<td>女</td>";
            // }
            // content += "<td>" + o.user.state + "</td>";
            if (o.state == 1) {
                content += "<td>有效</td>";
            } else {
                content += "<td>无效</td>";
            }
            content += "<td></td>";
            var power="";
            $.each(o.powerSet,function (i, n){
                power +=n.name;

            });
            content += "<td>" + power + "</td>";
            content += "<td><button class='layui-btn'>修改</button></td>";
            content += "<td><button class='layui-btn'>删除</button></td>";
            // content += "<td><a>删除</a></td>";
            content += "</tr>";
        });
        $('#tbody').html(content);
    }
</script>