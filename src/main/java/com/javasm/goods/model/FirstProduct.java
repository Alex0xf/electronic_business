package com.javasm.goods.model;

public class FirstProduct {
    private Integer id;

    private String classify;

    private Integer bid;

    private String color;

    private String type;

    @Override
    public String toString() {
        return "FirstProduct{" +
                "id=" + id +
                ", classify='" + classify + '\'' +
                ", bid=" + bid +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
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