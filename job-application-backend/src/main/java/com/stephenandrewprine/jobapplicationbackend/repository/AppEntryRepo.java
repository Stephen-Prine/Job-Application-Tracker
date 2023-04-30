package com.stephenandrewprine.jobapplicationbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stephenandrewprine.jobapplicationbackend.entities.AppEntryEntity;

@Repository
public interface AppEntryRepo extends JpaRepository<AppEntryEntity, Long> {

}
