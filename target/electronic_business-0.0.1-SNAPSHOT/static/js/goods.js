
function changeLeftSideToGifts(){
    $.post('common/left_side_gifts',{}, function(data) {
        //layer.msg(product);
        $('#ajax_left_side').html(data);
    },"html")

}

function changeLeftSideToGoods(){
    $.post('common/left_side_goods',{}, function(data) {
        $('#ajax_left_side').html(data);
    },"html")
}

    function jumpToFristProductPage() {
    window.location.href="goods/first_product"
}
    function jumpToFristGoodsPage() {
    window.location.href="goods/first_goods"
}
    function jumpToGoodsBrandPage() {
    window.location.href="goods/goods_brand"
}
    function jumpToGoodsTypePage() {
    window.location.href="goods/goods_type"
}

function jumpToUserPage() {
    window.location.href="user/login"
}