package com.javasm.wing.model;

public class Job {
    private Integer id;

    private String job;

    private Integer fatherId;

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", job='" + job + '\'' +
                ", fatherId=" + fatherId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }
}