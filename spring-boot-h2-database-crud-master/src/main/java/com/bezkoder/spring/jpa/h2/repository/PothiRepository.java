package com.bezkoder.spring.jpa.h2.repository;

import com.bezkoder.spring.jpa.h2.model.PothiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PothiRepository extends JpaRepository<PothiEntity,String> {
    List<PothiEntity> findByUserIdContainingIgnoreCase(String userId);
    List<PothiEntity> findByBucketIdContainingIgnoreCase(String bucketId);
    List<PothiEntity> findByContentIdContainingIgnoreCase(String contentId);
    List<PothiEntity> findBySectionIdContainingIgnoreCase(String sectionId);
}
