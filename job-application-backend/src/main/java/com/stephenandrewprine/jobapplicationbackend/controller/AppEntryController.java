package com.stephenandrewprine.jobapplicationbackend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stephenandrewprine.jobapplicationbackend.model.AppEntry;
import com.stephenandrewprine.jobapplicationbackend.services.AppEntryService;

import ch.qos.logback.core.net.SyslogOutputStream;
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

    @DeleteMapping("/appEntry/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEntry(@PathVariable Long id) {
        boolean deleted = false;
        deleted = appEntryService.deleteEntry(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/appEntry/{id}")
    public ResponseEntity<AppEntry> getEntryById(@PathVariable Long id) {
        AppEntry entry = null;
        entry = appEntryService.getEntryById(id);
        return ResponseEntity.ok(entry);
    }

    @PutMapping("/appEntry/{id}")
    public ResponseEntity<AppEntry> updateEntry(@PathVariable Long id, @RequestBody AppEntry entry) {
        entry = appEntryService.updateEntry(id, entry);
        return ResponseEntity.ok(entry);
    }

}
