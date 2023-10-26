package com.te.hrms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.te.hrms.entity.PerformanceReview;
import com.te.hrms.repository.PerformanceReviewsRepository;
import com.te.hrms.service.PerformanceReviewsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PerformanceReviewsServiceImpl implements PerformanceReviewsService{

	private final PerformanceReviewsRepository performanceReviewsRepository;
	@Override
	public List<PerformanceReview> getPerformanceReviews() {
		return performanceReviewsRepository.findAll();
	}
	@Override
	public Optional<PerformanceReview> getPerformanceReview(String id) {
		return performanceReviewsRepository.findById(id);
	}

}
