package com.stephenandrewprine.jobapplicationbackend.services;

import java.util.List;
import com.stephenandrewprine.jobapplicationbackend.model.AppEntry;

public interface AppEntryService {

    AppEntry createEntry(AppEntry appEntry);

    List<AppEntry> getAllAppEntrys();

    boolean deleteEntry(Long id);

    AppEntry getEntryById(Long id);

    AppEntry updateEntry(Long id, AppEntry entry);

}
