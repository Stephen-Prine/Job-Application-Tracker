package com.stephenandrewprine.jobapplicationbackend.model;

import java.util.Date;

import lombok.Data;

@Data
public class AppEntry {
    private long id;
    private String companyName;
    private String notes;
    private Date dateApplied;
}
