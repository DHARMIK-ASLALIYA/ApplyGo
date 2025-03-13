package com.applygo.applyflow.services

import com.applygo.applyflow.entity.*
import com.applygo.applyflow.objects.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
interface UserService {

    fun createUser(user: User): ResponseEntity<ApiResponse>
    fun updateUserPersonalInfo(userId: String, user: User): ResponseEntity<ApiResponse>
    fun updateUserDescription(userId: String, user: User): ResponseEntity<ApiResponse>
    fun deleteUser(userId: String): ResponseEntity<ApiResponse>

    fun addSkill(userId: String, skill: Skill): ResponseEntity<ApiResponse>
    fun removeSkill(userId: String, skillId: String): ResponseEntity<ApiResponse>

    fun addExperience(userId: String, experience: JobExperience): ResponseEntity<ApiResponse>
    fun updateExperience(userId: String, experienceId: String, experience: JobExperience): ResponseEntity<ApiResponse>
    fun removeExperience(userId: String, experienceId: String): ResponseEntity<ApiResponse>

    fun addProject(userId: String, project: Project): ResponseEntity<ApiResponse>
    fun updateProject(userId: String, projectId: String, project: Project): ResponseEntity<ApiResponse>
    fun removeProject(userId: String, projectId: String): ResponseEntity<ApiResponse>

    fun addPublication(userId: String, publication: Publication): ResponseEntity<ApiResponse>
    fun updatePublication(userId: String, publicationId: String, publication: Publication): ResponseEntity<ApiResponse>
    fun removePublication(userId: String, publicationId: String): ResponseEntity<ApiResponse>

    fun addEducation(userId: String, education: Education): ResponseEntity<ApiResponse>
    fun updateEducation(userId: String, educationId: String, education: Education): ResponseEntity<ApiResponse>
    fun removeEducation(userId: String, educationId: String): ResponseEntity<ApiResponse>

    fun addCertification(userId: String, certification: Certification): ResponseEntity<ApiResponse>
    fun updateCertification(
        userId: String, certificationId: String, certification: Certification
    ): ResponseEntity<ApiResponse>

    fun removeCertification(userId: String, certificationId: String): ResponseEntity<ApiResponse>

    fun addAchievement(userId: String, achievement: Achievement): ResponseEntity<ApiResponse>
    fun updateAchievement(userId: String, achievementId: String, achievement: Achievement): ResponseEntity<ApiResponse>
    fun removeAchievement(userId: String, achievementId: String): ResponseEntity<ApiResponse>

    fun addFollowers(userId: String, followerId: String): ResponseEntity<ApiResponse>
    fun removeFollowers(userId: String, followerId: String): ResponseEntity<ApiResponse>

}
