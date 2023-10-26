package com.te.hrms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.te.hrms.entity.TrainingProgram;
import com.te.hrms.repository.TrainingProgramRepository;
import com.te.hrms.service.TrainingProgramService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class TrainingProgramServiceImpl implements TrainingProgramService{

	private final TrainingProgramRepository trainingProgramRepository ;
	@Override
	public List<TrainingProgram> getTrainingPrograms() {
	
		return trainingProgramRepository.findAll();
	}

	@Override
	public Optional<TrainingProgram> getTrainingProgram(String id) {
		return trainingProgramRepository.findById(id);
	}

}
