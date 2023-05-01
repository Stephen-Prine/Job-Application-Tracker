package com.stephenandrewprine.jobapplicationbackend.services;

import java.util.List;
import com.stephenandrewprine.jobapplicationbackend.model.AppEntry;

public interface AppEntryService {

    AppEntry createEntry(AppEntry appEntry);

    List<AppEntry> getAllAppEntrys();

}
