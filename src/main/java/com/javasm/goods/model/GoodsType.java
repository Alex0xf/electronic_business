package com.javasm.goods.model;

public class GoodsType {
    private Integer id;

    private Integer bid;

    private String typeName;

    private String typeDescribe;

    private Integer belong;//属于一类：0，二类：1

    public GoodsType() {
    }

    public GoodsType(Integer id, Integer bid, String typeName, String typeDescribe) {
        this.id = id;
        this.bid = bid;
        this.typeName = typeName;
        this.typeDescribe = typeDescribe;
    }
    //用于更改类型信息
    public GoodsType(Integer id, String typeName, String typeDescribe) {
        this.id = id;
        this.typeName = typeName;
        this.typeDescribe = typeDescribe;
    }

    //用于新增类型记录 不需要id
    public GoodsType(Integer bid, String typeName, String typeDescribe, Integer belong) {
        this.bid = bid;
        this.typeName = typeName;
        this.typeDescribe = typeDescribe;
        this.belong = belong;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "id=" + id +
                ", bid=" + bid +
                ", typeName='" + typeName + '\'' +
                ", typeDescribe='" + typeDescribe + '\'' +
                ", belong=" + belong +
                '}';
    }

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeDescribe() {
        return typeDescribe;
    }

    public void setTypeDescribe(String typeDescribe) {
        this.typeDescribe = typeDescribe == null ? null : typeDescribe.trim();
    }
}