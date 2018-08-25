package com.javasm.wing.model;

import java.util.Set;

public class Rose {
    private Long id;

    private String roseId;

    private String name;

    private String description;

    private String state;

    private Long roseDept;

    private Set<Power> powerSet;

    public Rose() {

    }

    public Rose(String name, String description, String state, Long roseDept) {
        this.name = name;
        this.description = description;
        this.state = state;
        this.roseDept = roseDept;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "id=" + id +
                ", roseId='" + roseId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", state='" + state + '\'' +
                ", roseDept=" + roseDept +
                ", powerSet=" + powerSet +
                '}';
    }

    public Set<Power> getPowerSet() {
        return powerSet;
    }

    public void setPowerSet(Set<Power> powerSet) {
        this.powerSet = powerSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoseId() {
        return roseId;
    }

    public void setRoseId(String roseId) {
        this.roseId = roseId == null ? null : roseId.trim();
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getRoseDept() {
        return roseDept;
    }

    public void setRoseDept(Long roseDept) {
        this.roseDept = roseDept;
    }
}