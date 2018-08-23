<%@ page contentType="text/html;charset=UTF-8" language="java" %>
            <!--面包屑-->
            <blockquote class="layui-elem-quote">
               <%-- <span class="layui-breadcrumb"></span>--%>
                   <a href="">商品与赠品管理</a>
                   <a href="">商品管理</a>
                   <a href="">选择一类产品</a>
                   <a><cite>创建一类商品</cite></a>
            </blockquote>

            <!-- 创建一类商品表单 -->
            <div class="layui-col-md6">
                <div class="layui-card">
                    <form class="layui-form">
                        <div class="layui-form-item">
                            <label class="layui-form-label">档案编码</label>
                            <div class="layui-input-block">
                                <input type="text" name="productId" value="${product.id}" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-分类</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="${product.typeName}" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-品牌</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="${product.goodsBrand.brandName}" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-型号</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="${product.type}" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-业务模式</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="xxx" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-颜色</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="${product.color}" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-采购模式</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="xxx" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-铺货</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="xxx" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">基础库-备机</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       value="xxx" autocomplete="off" class="layui-input" readonly="readonly">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">商品名称</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       placeholder="请填写" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">商品类别</label>
                            <div class="layui-input-block">
                                <select name="interest" lay-filter="aihao">
                                    <option value="0">手机</option>
                                    <option value="1">配件</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">采购价</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       placeholder="请填写" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">市场价</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       placeholder="请填写" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">商城价</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       placeholder="请填写" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">最低库存量</label>
                            <div class="layui-input-block">
                                <input type="text" name="title" required lay-verify="required"
                                       placeholder="请填写" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">是否可采购</label>
                            <div class="layui-input-block">
                                <select name="interest" lay-filter="aihao">
                                    <option value="0">可采购</option>
                                    <option value="1">不可采购</option>
                                </select>
                            </div>
                        </div>

                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn" lay-submit lay-filter="*">立即提交</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

