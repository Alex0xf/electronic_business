package com.javasm.wing.model;

public class OperationContext {
    private Integer id;

    private String operationContext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperationContext() {
        return operationContext;
    }

    public void setOperationContext(String operationContext) {
        this.operationContext = operationContext == null ? null : operationContext.trim();
    }
}