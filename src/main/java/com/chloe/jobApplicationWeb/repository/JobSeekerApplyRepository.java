package com.chloe.jobApplicationWeb.repository;

import com.chloe.jobApplicationWeb.entity.JobPostActivity;
import com.chloe.jobApplicationWeb.entity.JobSeekerApply;
import com.chloe.jobApplicationWeb.entity.JobSeekerProfile;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
