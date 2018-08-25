package com.javasm.wing.model;

import java.util.List;

public class Power {
    private Long id;

    private String name;

    private String description;

    private Integer state;

    private Long operation;

    private List<Rose> roseList;

    @Override
    public String toString() {
        return "Power{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", state=" + state +
                ", operation=" + operation +
                ", roseList=" + roseList +
                '}';
    }

    public List<Rose> getRoseList() {
        return roseList;
    }

    public void setRoseList(List<Rose> roseList) {
        this.roseList = roseList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getOperation() {
        return operation;
    }

    public void setOperation(Long operation) {
        this.operation = operation;
    }
}