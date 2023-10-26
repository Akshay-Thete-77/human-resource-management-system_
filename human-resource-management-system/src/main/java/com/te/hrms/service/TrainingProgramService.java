package com.te.hrms.service;

import java.util.List;
import java.util.Optional;

import com.te.hrms.entity.TrainingProgram;

public interface TrainingProgramService {

	List<TrainingProgram> getTrainingPrograms();

	Optional<TrainingProgram> getTrainingProgram(String id);

}
