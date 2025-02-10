package com.geonhee.portfolio.domain.repository

import com.geonhee.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>