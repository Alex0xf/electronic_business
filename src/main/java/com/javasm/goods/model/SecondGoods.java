package com.javasm.goods.model;

public class SecondGoods {
    private Integer id;

    private String goodsName;

    private Integer num;

    private Integer goodsTid;

    private Integer goodsBid;

    private String color;

    private Double buyPrice;

    private Double salesPrice;

    private Integer isBuy;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
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