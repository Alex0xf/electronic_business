package com.javasm.wing.model;

public class Ip {
    private Long id;

    private Long name;

    private String ipHead;

    private String ipEnd;

    private String description;

    private Long employee;

    private Integer state;

//    对应一个部门
    private Dept dept;
//    对应一个员工
    private Employee employeeModel;

    @Override
    public String toString() {
        return "Ip{" +
                "id=" + id +
                ", name=" + name +
                ", ipHead='" + ipHead + '\'' +
                ", ipEnd='" + ipEnd + '\'' +
                ", description='" + description + '\'' +
                ", employee=" + employee +
                ", state=" + state +
                ", dept=" + dept +
                ", employeeModel=" + employeeModel +
                '}';
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Employee getEmployeeModel() {
        return employeeModel;
    }

    public void setEmployeeModel(Employee employeeModel) {
        this.employeeModel = employeeModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public String getIpHead() {
        return ipHead;
    }

    public void setIpHead(String ipHead) {
        this.ipHead = ipHead == null ? null : ipHead.trim();
    }

    public String getIpEnd() {
        return ipEnd;
    }

    public void setIpEnd(String ipEnd) {
        this.ipEnd = ipEnd == null ? null : ipEnd.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}