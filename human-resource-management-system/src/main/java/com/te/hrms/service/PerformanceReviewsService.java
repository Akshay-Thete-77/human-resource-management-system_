package com.te.hrms.service;

import java.util.List;
import java.util.Optional;

import com.te.hrms.entity.PerformanceReview;

public interface PerformanceReviewsService {

	List<PerformanceReview> getPerformanceReviews();

	Optional<PerformanceReview> getPerformanceReview(String id);

}
