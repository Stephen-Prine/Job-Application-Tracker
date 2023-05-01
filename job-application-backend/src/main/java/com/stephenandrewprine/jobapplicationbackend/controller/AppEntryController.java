package com.stephenandrewprine.jobapplicationbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stephenandrewprine.jobapplicationbackend.model.AppEntry;
import com.stephenandrewprine.jobapplicationbackend.services.AppEntryService;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class AppEntryController {

    AppEntryService appEntryService;

    @PostMapping("/appEntry")
    public AppEntry createEntry(@RequestBody AppEntry appEntry) {
        return appEntryService.createEntry(appEntry);
    }

    @GetMapping("/appEntry")
    public List<AppEntry> getAllAppEntrys() {
        return appEntryService.getAllAppEntrys();
    }
}
