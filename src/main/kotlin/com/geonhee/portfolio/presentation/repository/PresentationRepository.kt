package com.geonhee.portfolio.presentation.repository

import com.geonhee.portfolio.domain.entity.*
import com.geonhee.portfolio.domain.repository.*
import org.springframework.stereotype.Repository

@Repository
class PresentationRepository(
    private val achievementRepository: AchievementRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val skillRepository: SkillRepository,
    private val projectRepository: ProjectRepository,
    private val experienceRepository: ExperienceRepository
) {

    fun getAchieveAchievements(): List<Achievement> {
        return achievementRepository.findAllByIsActive(true)
    }

    fun getAchieveExperiences(): List<Experience> {
        return experienceRepository.findAllByIsActive(true)
    }

    fun getAchieveIntroductions(): List<Introduction> {
        return introductionRepository.findAllByIsActive(true)
    }

    fun getAchieveLinks(): List<Link> {
        return linkRepository.findAllByIsActive(true)
    }

    fun getAchieveProjects(): List<Project> {
        return projectRepository.findAllByIsActive(true)
    }

    fun getAchieveSkills(): List<Skill> {
        return skillRepository.findAllByIsActive(true)
    }

}