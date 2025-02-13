package com.geonhee.portfolio.admin.context.skill.service

import com.geonhee.portfolio.admin.data.TableDTO
import com.geonhee.portfolio.domain.entity.Achievement
import com.geonhee.portfolio.domain.entity.Introduction
import com.geonhee.portfolio.domain.entity.Skill
import com.geonhee.portfolio.domain.repository.IntroductionRepository
import com.geonhee.portfolio.domain.repository.SkillRepository
import org.springframework.stereotype.Service

@Service
class AdminSkillService(
    private val skillRepository: SkillRepository
) {

    fun getSkillTable(): TableDTO {
        val classInfo = Skill::class
        val entities = skillRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

}