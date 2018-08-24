package com.javasm.goods.model;

public class GoodsType {
    private Integer id;

    private Integer bid;

    private String typeName;

    private String typeDescribe;

    public GoodsType() {
    }

    public GoodsType(Integer id, Integer bid, String typeName, String typeDescribe) {
        this.id = id;
        this.bid = bid;
        this.typeName = typeName;
        this.typeDescribe = typeDescribe;
    }

    public GoodsType(Integer id, String typeName, String typeDescribe) {
        this.id = id;
        this.typeName = typeName;
        this.typeDescribe = typeDescribe;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "id=" + id +
                ", bid=" + bid +
                ", typeName='" + typeName + '\'' +
                ", typeDescribe='" + typeDescribe + '\'' +
                '}';
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