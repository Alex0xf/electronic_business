<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="/layui/css/layui.css" >
<!--面包屑-->
<blockquote class="layui-elem-quote">
    <a href="">商品与赠品管理</a>
    <a href="">商品品牌管理</a>
    <a><cite>新增品牌信息</cite></a>
</blockquote>
<div class="col-md-2"></div>
<div class="col-md-6">
    <!-- 新增商品类型表单 -->
    <div class="ibox-content">
        <div class="table-responsive">

            <form action='goods/add_goods_type?jumpPage=add_goods_type_check' method="post"  >
                <div class="form-group">
                    <label>商品类型名称</label>
                    <input type="text" class="form-control" name="goodsType_typeName" AUTOCOMPLETE="off" required placeholder="请输入商品类型名称(必填项)" >
                </div>
                <div class="form-group">
                    <label>商品类型描述</label>
                    <%-- <input type="text" class="form-control" name="goodsType_typeName1" AUTOCOMPLETE="off" value="${goodsType.typeDescribe}">--%>
                    <textarea class="form-control" name="goodsType_typeDescribe" rows="3" AUTOCOMPLETE="off" placeholder="请输入商品类型描述"></textarea>
                </div>

                <div class="form-group">
                    <label>类型属于（0：一类，1：二类）</label>
                    <select class="form-control" name="belong">
                        <option value="0" selected>一类</option>
                        <option value="1">二类</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>选用品牌</label>
                    <select class="form-control" name="bid">
                        <option value="1" selected>1.苹果</option>
                        <option value="2">2.三星</option>
                        <option value="3">3.酷派</option>
                        <option value="4">4.LG</option>
                        <option value="5">5.诺基亚</option>
                        <option value="6">6.motorola</option>
                        <option value="7">7.华为</option>
                        <option value="8">8.philips</option>
                        <option value="9">9.OPPO</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-success "><i class="fa fa-check"> 确认</i></button>
            </form>


        </div>
    </div>
</div>

