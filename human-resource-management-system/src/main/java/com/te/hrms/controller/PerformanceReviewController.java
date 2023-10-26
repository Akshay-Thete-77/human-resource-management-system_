package com.te.hrms.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.hrms.entity.PerformanceReview;
import com.te.hrms.response.SuccessResponse;
import com.te.hrms.service.PerformanceReviewsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class PerformanceReviewController {
	private final PerformanceReviewsService performanceReviewsService;

	@GetMapping("/")
	public ResponseEntity<SuccessResponse> getPerformanceReviews() {
		List<PerformanceReview> PerformanceReviews = performanceReviewsService.getPerformanceReviews();
		return ResponseEntity.<SuccessResponse>ok().body(SuccessResponse.builder().data(PerformanceReviews)
				.message("data prvided").timestamp(LocalDateTime.now()).build());
	}

	@GetMapping("/{id}")
	public ResponseEntity<SuccessResponse> getPerformanceReview(@PathVariable String id) {
		PerformanceReview PerformanceReview = performanceReviewsService.getPerformanceReview(id)
				.orElseThrow(() -> new RuntimeException("employee not found...!!"));
		return ResponseEntity.<SuccessResponse>ok().body(SuccessResponse.builder().data(PerformanceReview)
				.message("data prvided").timestamp(LocalDateTime.now()).build());
	}
}
