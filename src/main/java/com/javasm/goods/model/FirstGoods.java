package com.javasm.goods.model;

public class FirstGoods {
    private Integer id;
    private String goodsName;
    private Integer num;
    private Integer goodsTid;//一类商品类型id
    private Integer goodsBid;//一类商品品牌id
    private Integer attribute;//属性：0商品 1赠品 （默认是商品）
    private Integer firstPid;//对应的一类产品
    private Double buyPrice;//采购价格
    private Double marketPrice;//市场价
    private Double salesPrice;//商城价
    private Integer isBuy;//是否可采购 0可采购（默认） 1不可

    private FirstProduct firstProduct;//一类产品
    private GoodsType goodsType;//商品类型
//    private  GoodsBrand goodsBrand;//商品品牌

    public FirstGoods() {
    }

    public FirstGoods(Integer id, String goodsName, Integer num, Integer goodsTid, Integer goodsBid, Integer attribute, Integer firstPid, Double buyPrice, Double marketPrice, Double salesPrice, Integer isBuy, FirstProduct firstProduct, GoodsType goodsType) {
        this.id = id;
        this.goodsName = goodsName;
        this.num = num;
        this.goodsTid = goodsTid;
        this.goodsBid = goodsBid;
        this.attribute = attribute;
        this.firstPid = firstPid;
        this.buyPrice = buyPrice;
        this.marketPrice = marketPrice;
        this.salesPrice = salesPrice;
        this.isBuy = isBuy;
        this.firstProduct = firstProduct;
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return "FirstGoods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", num=" + num +
                ", goodsTid=" + goodsTid +
                ", goodsBid=" + goodsBid +
                ", attribute=" + attribute +
                ", firstPid=" + firstPid +
                ", buyPrice=" + buyPrice +
                ", marketPrice=" + marketPrice +
                ", salesPrice=" + salesPrice +
                ", isBuy=" + isBuy +
                ", firstProduct=" + firstProduct +
                ", goodsType=" + goodsType +
                '}';
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }


    public void setFirstProduct(FirstProduct firstProduct) {
        this.firstProduct = firstProduct;
    }

    public FirstProduct getFirstProduct() {
        return firstProduct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getGoodsTid() {
        return goodsTid;
    }

    public void setGoodsTid(Integer goodsTid) {
        this.goodsTid = goodsTid;
    }

    public Integer getGoodsBid() {
        return goodsBid;
    }

    public void setGoodsBid(Integer goodsBid) {
        this.goodsBid = goodsBid;
    }

    public Integer getAttribute() {
        return attribute;
    }

    public void setAttribute(Integer attribute) {
        this.attribute = attribute;
    }

    public Integer getFirstPid() {
        return firstPid;
    }

    public void setFirstPid(Integer firstPid) {
        this.firstPid = firstPid;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Integer getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Integer isBuy) {
        this.isBuy = isBuy;
    }
}