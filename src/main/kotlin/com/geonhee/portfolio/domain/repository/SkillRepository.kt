package com.geonhee.portfolio.domain.repository

import com.geonhee.portfolio.domain.constant.SkillType
import com.geonhee.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SkillRepository : JpaRepository<Skill, Long> {

    fun findAllByIsActive(isActive: Boolean): List<Skill>

    fun findByNameIgnoreCaseAndType(name: String, tpye: SkillType): Optional<Skill>

}