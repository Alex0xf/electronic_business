<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="/layui/css/layui.css" >
<!--面包屑-->
<blockquote class="layui-elem-quote">
    <a href="">商品与赠品管理</a>
    <a href="">商品管理</a>
    <a href="">选择一类产品</a>
    <a><cite>创建一类商品</cite></a>
</blockquote>
<div class="col-md-2"></div>
<div class="col-md-6">
    <!-- 创建一类商品表单 -->
    <div class="ibox-content">
        <div class="table-responsive">

            <form action='' method="post"  >
                <div class="form-group">
                    <label>档案编码</label>
                    <input type="text" class="form-control" name="product_id" readonly="readonly"  value="${product.id}">
                </div>
                <div class="form-group">
                    <label>基础库-分类</label>
                    <input type="text" class="form-control" name="product_typeName" readonly="readonly" AUTOCOMPLETE="off" value="${product.typeName}">
                </div>
                <div class="form-group">
                    <label>基础库-品牌</label>
                    <input type="text" class="form-control" name="product_goodsBrand_brandName" readonly="readonly"  AUTOCOMPLETE="off" value="${product.goodsBrand.brandName}">
                </div>
                <div class="form-group">
                    <label>基础库-型号</label>
                    <input type="text" class="form-control" name="product_type" readonly="readonly"  value="${product.type}">
                </div>

                <div class="form-group">
                    <label>基础库-颜色</label>
                    <input type="text" class="form-control" name="product_color" readonly="readonly" value="${product.color}">
                </div>
                <div class="form-group">
                    <label>商品名称</label>
                    <input type="text" class="form-control" name="goods_name" AUTOCOMPLETE="off" lay-verify="required"
                           placeholder="请填写">
                </div>

                <div class="form-group">
                    <label>商品类别</label>
                    <select class="form-control">
                        <option value="0">手机</option>
                        <option value="1">配件</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>采购价</label>
                    <input type="text" class="form-control" name="goods_name" AUTOCOMPLETE="off" lay-verify="required"
                           placeholder="请填写">
                </div>
                <div class="form-group">
                    <label>市场价</label>
                    <input type="text" class="form-control" name="goods_name" AUTOCOMPLETE="off" lay-verify="required"
                           placeholder="请填写">
                </div>
                <div class="form-group">
                    <label>商城价</label>
                    <input type="text" class="form-control" name="goods_name" AUTOCOMPLETE="off" lay-verify="required"
                           placeholder="请填写">
                </div>
                <div class="form-group">
                    <label>最低库存量</label>
                    <input type="text" class="form-control" name="goods_name" AUTOCOMPLETE="off" lay-verify="required"
                           placeholder="请填写">
                </div>
                <div class="form-group">
                    <label>是否可采购</label>
                    <select class="form-control">
                        <option value="0">可采购</option>
                        <option value="1">不可采购</option>
                    </select>
                </div>

                <button type="submit" class="btn btn-success "><i class="fa fa-check"> 确认</i></button>
            </form>


        </div>
    </div>
</div>

