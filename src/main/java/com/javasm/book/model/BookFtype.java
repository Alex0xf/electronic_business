package com.javasm.book.model;

public class BookFtype {
    private Integer typeId;

    private String typeName;

    private Byte attribution;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Byte getAttribution() {
        return attribution;
    }

    public void setAttribution(Byte attribution) {
        this.attribution = attribution;
    }
}