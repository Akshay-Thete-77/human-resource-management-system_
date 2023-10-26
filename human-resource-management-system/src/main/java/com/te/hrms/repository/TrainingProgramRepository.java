package com.te.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.hrms.entity.TrainingProgram;
import com.te.hrms.service.TrainingProgramService;

public interface TrainingProgramRepository extends JpaRepository<TrainingProgram, String> {

}
