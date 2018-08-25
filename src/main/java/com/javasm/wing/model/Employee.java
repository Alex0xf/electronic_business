package com.javasm.wing.model;

import java.util.List;

public class Employee {
    private Long id;

    private Long employeeId;

    private String name;

    private Integer sex;

    private Integer job;

    private Long rose;
//对应一个用户
    private User user;
//    对应一个角色
    private Rose rose_map;
//    对应一个ip段
    private Ip ip;
//    对应一个部门(用的java循环查)
    private Dept dept;
//    对应一个职务
    private Job job_map;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", job=" + job +
                ", rose=" + rose +
                ", user=" + user +
                ", rose_map=" + rose_map +
                ", ip=" + ip +
                ", dept=" + dept +
                ", job_map=" + job_map +
                '}';
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Ip getIp() {
        return ip;
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    public Job getJob_map() {
        return job_map;
    }

    public void setJob_map(Job job_map) {
        this.job_map = job_map;
    }

    public Rose getRose_map() {
        return rose_map;
    }

    public void setRose_map(Rose rose_map) {
        this.rose_map = rose_map;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    public Long getRose() {
        return rose;
    }

    public void setRose(Long rose) {
        this.rose = rose;
    }
}