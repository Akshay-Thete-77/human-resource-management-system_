package com.te.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.hrms.entity.Skill;
import com.te.hrms.service.SkillService;

public interface SkillServiceRepository extends JpaRepository<Skill, String> {

}
