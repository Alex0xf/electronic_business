package com.javasm.wing.model;

public class Rose_Power {
    private Integer id;

    private Long rose;

    private Long power;

    private Power powerModel;

    public Rose_Power() {
    }

    public Rose_Power(Long rose, Long power) {
        this.rose = rose;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Rose_Power{" +
                "id=" + id +
                ", rose=" + rose +
                ", power=" + power +
                ", powerModel=" + powerModel +
                '}';
    }

    public Power getPowerModel() {
        return powerModel;
    }

    public void setPowerModel(Power powerModel) {
        this.powerModel = powerModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getRose() {
        return rose;
    }

    public void setRose(Long rose) {
        this.rose = rose;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }
}