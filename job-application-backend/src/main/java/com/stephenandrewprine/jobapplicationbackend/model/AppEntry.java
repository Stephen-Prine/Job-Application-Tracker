package com.stephenandrewprine.jobapplicationbackend.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppEntry {
    private long id;
    private String companyName;
    private String notes;
    private LocalDate dateApplied;
    private String link;
}
