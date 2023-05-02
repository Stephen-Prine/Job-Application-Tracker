package com.stephenandrewprine.jobapplicationbackend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.stephenandrewprine.jobapplicationbackend.entities.AppEntryEntity;
import com.stephenandrewprine.jobapplicationbackend.model.AppEntry;
import com.stephenandrewprine.jobapplicationbackend.repository.AppEntryRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AppEntryServiceImpl implements AppEntryService {

    private AppEntryRepo appEntryRepo;

    @Override
    public AppEntry createEntry(AppEntry appEntry) {
        AppEntryEntity appEntryEntity = new AppEntryEntity();

        BeanUtils.copyProperties(appEntry, appEntryEntity);
        appEntryRepo.save(appEntryEntity);
        return appEntry;
    }

    @Override
    public List<AppEntry> getAllAppEntrys() {
        List<AppEntryEntity> appEntries = appEntryRepo.findAll();

        List<AppEntry> entries = appEntries
                .stream()
                .map(emp -> new AppEntry(emp.getId(),
                        emp.getCompanyName(),
                        emp.getNotes(),
                        emp.getDateApplied(),
                        emp.getLink()))
                .collect(Collectors.toList());
        return entries;
    }

    @Override
    public boolean deleteEntry(Long id) {
        AppEntryEntity entry = appEntryRepo.findById(id).get();
        appEntryRepo.delete(entry);
        return true;
    }

    @Override
    public AppEntry getEntryById(Long id) {
        AppEntryEntity appEntryEntity = appEntryRepo.findById(id).get();
        AppEntry appEntry = new AppEntry();
        BeanUtils.copyProperties(appEntryEntity, appEntry);
        return appEntry;

    }

    @Override
    public AppEntry updateEntry(Long id, AppEntry entry) {
        AppEntryEntity appEntryEntity = appEntryRepo.findById(id).get();
        appEntryEntity.setCompanyName(entry.getCompanyName());
        appEntryEntity.setNotes(entry.getNotes());
        appEntryEntity.setDateApplied(entry.getDateApplied());
        appEntryRepo.save(appEntryEntity);
        return entry;
    }

}
