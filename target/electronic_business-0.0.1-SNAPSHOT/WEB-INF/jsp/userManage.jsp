<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="layui/layui.js" type="text/javascript"></script>
<script src="layui/layui.all.js" type="text/javascript"></script>
<blockquote class="layui-elem-quote">
               <span class="layui-breadcrumb">
                   <a href="">系统管理</a>
                    <a href="">用户管理</a>
                    <a><cite>用户查询</cite></a>
               </span></blockquote>
<div id="mainArea">
    <%--<a><cite>首页</cite></a>--%>
    <table class="layui-table">
        <thead>
        <tr>
            <th>序号</th>
            <th>选择用户</th>
            <th>用户登陆名</th>
            <th>用户姓名</th>
            <th>归属部门</th>
            <th>用户性别</th>
            <th>用户状态</th>
            <th>用户职务</th>
            <th>手机号码</th>
            <th>用户邮箱</th>
            <th>访问IP段</th>
            <th>角色</th>
            <th colspan="2"> 操作</th>
        </tr>
        </thead>
        <tbody id="tbody">
        </tbody>
    </table>


    <div>
        <button class='layui-btn' id="addUser" onclick="addUser();">添加</button>
    </div>

    <!-- 分页标签 -->
    <div id="page1"></div>


</div>
<script type="text/javascript">
    $(function($){
        layui.use('laypage', function () {
            var laypage = layui.laypage;
            var url = "user/selectAllUser";
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
            content += "<td>" + o.user.logname + "</td>";
            content += "<td>" + o.name + "</td>";
            content += "<td>" + o.dept.name + "</td>";
            // content += "<td>" + o.sex + "</td>";
            <%--content += "<td><c:if test='${o.sex==1}'>男</c:if><c:if test='${o.sex == 0}'>女</c:if></td>";--%>
            if (o.sex == 1) {
                content += "<td>男</td>";
            } else {
                content += "<td>女</td>";
            }
            // content += "<td>" + o.user.state + "</td>";
            if (o.user.state == 1) {
                content += "<td>有效</td>";
            } else {
                content += "<td>无效</td>";
            }
            content += "<td>" + o.job_map.job + "</td>";
            content += "<td>" + o.user.phoneNumber + "</td>";
            content += "<td>" + o.user.email + "</td>";
            content += "<td>" + o.ip.ipHead + "-" + o.ip.ipEnd + "</td>";
            content += "<td>" + o.rose_map.name + "</td>";
            content += "<td><button class='layui-btn'>修改</button></td>";
            content += "<td><button class='layui-btn'>删除</button></td>";
            // content += "<td><a>删除</a></td>";
            content += "</tr>";
        });
        $('#tbody').html(content);
    }


</script>