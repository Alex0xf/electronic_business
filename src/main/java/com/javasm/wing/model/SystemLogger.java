package com.javasm.wing.model;

import java.util.Date;

public class SystemLogger {
    private Long id;

    private Long userName;

    private Integer model;

    private Integer operationContext;

    private Date operationTime;

    private SystemModel systemModel;

    private OperationContext operationContextModel;

    private Employee employee;

    @Override
    public String toString() {
        return "SystemLogger{" +
                "id=" + id +
                ", userName=" + userName +
                ", model=" + model +
                ", operationContext=" + operationContext +
                ", operationTime=" + operationTime +
                ", systemModel=" + systemModel +
                ", operationContextModel=" + operationContextModel +
                ", employee=" + employee +
                '}';
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public SystemModel getSystemModel() {
        return systemModel;
    }

    public void setSystemModel(SystemModel systemModel) {
        this.systemModel = systemModel;
    }

    public OperationContext getOperationContextModel() {
        return operationContextModel;
    }

    public void setOperationContextModel(OperationContext operationContextModel) {
        this.operationContextModel = operationContextModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserName() {
        return userName;
    }

    public void setUserName(Long userName) {
        this.userName = userName;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getOperationContext() {
        return operationContext;
    }

    public void setOperationContext(Integer operationContext) {
        this.operationContext = operationContext;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
}