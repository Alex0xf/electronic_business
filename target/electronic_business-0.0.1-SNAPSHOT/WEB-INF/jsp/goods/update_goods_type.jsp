<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="/layui/css/layui.css" >
<!--面包屑-->
<blockquote class="layui-elem-quote">
    <a href="">商品与赠品管理</a>
    <a href="">商品品牌管理</a>
    <a><cite>修改品牌信息</cite></a>
</blockquote>
<div class="col-md-2"></div>
<div class="col-md-6">
    <!-- 创建一类商品表单 -->
    <div class="ibox-content">
        <div class="table-responsive">

            <form action='goods/update_goods_type?jumpPage=update_goods_type_check' method="post"  >
                <div class="form-group">
                    <label>商品类型id</label>
                    <input type="text" class="form-control" name="goodsType_id" readonly="readonly"  value="${goodsType.id}">
                </div>
                <div class="form-group">
                    <label>商品类型名称</label>
                    <input type="text" class="form-control" name="goodsType_typeName" AUTOCOMPLETE="off" value="${goodsType.typeName}">
                </div>
                <div class="form-group">
                    <label>商品类型描述</label>
                   <%-- <input type="text" class="form-control" name="goodsType_typeName1" AUTOCOMPLETE="off" value="${goodsType.typeDescribe}">--%>
                    <textarea class="form-control" name="goodsType_typeDescribe" rows="3" AUTOCOMPLETE="off">${goodsType.typeDescribe}</textarea>
                </div>

                <button type="submit" class="btn btn-success "><i class="fa fa-check"> 确认</i></button>
            </form>


        </div>
    </div>
</div>

