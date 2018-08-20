package com.javasm.goods.model;

public class GoodsBrand {
    private Integer id;

    private String brandName;

    private String brandAddress;

    private String brandDescribe;

    public GoodsBrand() {
    }

    public GoodsBrand(Integer id, String brandName, String brandAddress, String brandDescribe) {
        this.id = id;
        this.brandName = brandName;
        this.brandAddress = brandAddress;
        this.brandDescribe = brandDescribe;
    }

    @Override
    public String toString() {
        return "GoodsBrand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", brandAddress='" + brandAddress + '\'' +
                ", brandDescribe='" + brandDescribe + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandAddress() {
        return brandAddress;
    }

    public void setBrandAddress(String brandAddress) {
        this.brandAddress = brandAddress == null ? null : brandAddress.trim();
    }

    public String getBrandDescribe() {
        return brandDescribe;
    }

    public void setBrandDescribe(String brandDescribe) {
        this.brandDescribe = brandDescribe == null ? null : brandDescribe.trim();
    }
}