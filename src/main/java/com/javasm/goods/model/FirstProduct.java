package com.javasm.goods.model;

public class FirstProduct {
    private Integer id;

    private String typeName;

    private Integer bid;

    private String color;

    private String type;

    private GoodsBrand goodsBrand;
    /*private int brandId;*/

    public FirstProduct() {
    }

    public FirstProduct(Integer id, String typeName, Integer bid, String color, String type, GoodsBrand goodsBrand) {
        this.id = id;
        this.typeName = typeName;
        this.bid = bid;
        this.color = color;
        this.type = type;
        this.goodsBrand = goodsBrand;
    }

    @Override
    public String toString() {
        return "FirstProduct{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", bid=" + bid +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", goodsBrand=" + goodsBrand +
                '}';
    }

    /*public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }*/

    public GoodsBrand getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(GoodsBrand goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}