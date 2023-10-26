package com.te.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.hrms.entity.PerformanceReview;

public interface PerformanceReviewsRepository extends JpaRepository<PerformanceReview, String> {

}
