package com.stephenandrewprine.jobapplicationbackend.services;

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

}
