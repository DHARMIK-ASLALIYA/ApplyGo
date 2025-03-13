package com.applygo.applyflow.dao

import com.applygo.applyflow.entity.*
import com.applygo.applyflow.objects.ApiResponse
import com.applygo.applyflow.objects.Dao
import com.applygo.applyflow.repository.UserPayloadRepository
import com.applygo.applyflow.repository.UserRepository
import com.applygo.applyflow.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

@Dao
class UserServiceDao(
    val userPayloadRepository: UserPayloadRepository, val userRepository: UserRepository
) : UserService {

    fun userToUserPayloadConverter(user: User): UserPayload = UserPayload(
        user.id,
        user.personalInfo.profilePictureUrl,
        user.personalInfo.fullName,
        user.userDescription.headline,
    )

    override fun createUser(user: User): ResponseEntity<ApiResponse> {
        user.id = System.currentTimeMillis().toString()
        userRepository.saveUser(user)
        userPayloadRepository.save(userToUserPayloadConverter(user))
        return ResponseEntity(ApiResponse("User created successfully", true), HttpStatus.CREATED)
    }

    override fun updateUserPersonalInfo(userId: String, user: User): ResponseEntity<ApiResponse> {
        val existingUser = userRepository.getUser(userId)
        existingUser.personalInfo = user.personalInfo
        userRepository.saveUser(existingUser)
        return ResponseEntity(ApiResponse("User personal info updated successfully", true), HttpStatus.OK)
    }

    override fun updateUserDescription(userId: String, user: User): ResponseEntity<ApiResponse> {
        val existingUser = userRepository.getUser(userId)
        existingUser.userDescription = user.userDescription
        userRepository.saveUser(existingUser)
        return ResponseEntity(ApiResponse("User description updated successfully", true), HttpStatus.OK)
    }

    override fun deleteUser(userId: String): ResponseEntity<ApiResponse> {
        userRepository.deleteUserdata(userId)
        userPayloadRepository.deleteUserPayloadById(userId)
        return ResponseEntity(ApiResponse("User deleted successfully", true), HttpStatus.OK)
    }

    override fun addSkill(userId: String, skill: Skill): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.skills.add(skill)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Skill added successfully", true), HttpStatus.CREATED)
    }

    override fun removeSkill(userId: String, skillId: String): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.skills.removeIf { it.createdAt == skillId }
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Skill removed successfully", true), HttpStatus.OK)
    }

    override fun addExperience(userId: String, experience: JobExperience): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.experience.add(experience)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Experience added successfully", true), HttpStatus.CREATED)
    }

    override fun updateExperience(
        userId: String, experienceId: String, experience: JobExperience
    ): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.experience.removeIf { it.createdAt == experienceId }
        user.experience.add(experience)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Experience updated successfully", true), HttpStatus.OK)
    }

    override fun removeExperience(userId: String, experienceId: String): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.experience.removeIf { it.createdAt == experienceId }
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Experience removed successfully", true), HttpStatus.OK)
    }

    override fun addProject(userId: String, project: Project): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.projects.add(project)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Project added successfully", true), HttpStatus.CREATED)
    }

    override fun updateProject(userId: String, projectId: String, project: Project): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.projects.removeIf { it.createdAt == projectId }
        user.projects.add(project)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Project updated successfully", true), HttpStatus.OK)
    }

    override fun removeProject(userId: String, projectId: String): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.projects.removeIf { it.createdAt == projectId }
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Project removed successfully", true), HttpStatus.OK)
    }

    override fun addPublication(userId: String, publication: Publication): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.publications.add(publication)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Publication added successfully", true), HttpStatus.CREATED)
    }

    override fun updatePublication(
        userId: String, publicationId: String, publication: Publication
    ): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.publications.removeIf { it.createdAt == publicationId }
        user.publications.add(publication)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Publication updated successfully", true), HttpStatus.OK)
    }

    override fun removePublication(userId: String, publicationId: String): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.publications.removeIf { it.createdAt == publicationId }
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Publication removed successfully", true), HttpStatus.OK)
    }

    override fun addEducation(userId: String, education: Education): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.education.add(education)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Education added successfully", true), HttpStatus.CREATED)

    }

    override fun updateEducation(
        userId: String, educationId: String, education: Education
    ): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.education.removeIf { it.createdAt == educationId }
        user.education.add(education)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Education updated successfully", true), HttpStatus.OK)
    }

    override fun removeEducation(userId: String, educationId: String): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.education.removeIf { it.createdAt == educationId }
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Education removed successfully", true), HttpStatus.OK)

    }

    override fun addCertification(userId: String, certification: Certification): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.certifications.add(certification)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Certification added successfully", true), HttpStatus.CREATED)

    }

    override fun updateCertification(
        userId: String, certificationId: String, certification: Certification
    ): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.certifications.removeIf { it.createdAt == certificationId }
        user.certifications.add(certification)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Certification updated successfully", true), HttpStatus.OK)
    }

    override fun removeCertification(userId: String, certificationId: String): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.certifications.removeIf { it.createdAt == certificationId }
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Certification removed successfully", true), HttpStatus.OK)

    }

    override fun addAchievement(userId: String, achievement: Achievement): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.achievements.add(achievement)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Achievement added successfully", true), HttpStatus.CREATED)
    }

    override fun updateAchievement(
        userId: String, achievementId: String, achievement: Achievement
    ): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.achievements.removeIf { it.createdAt == achievementId }
        user.achievements.add(achievement)
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Achievement updated successfully", true), HttpStatus.OK)
    }

    override fun removeAchievement(userId: String, achievementId: String): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.achievements.removeIf { it.createdAt == achievementId }
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Achievement removed successfully", true), HttpStatus.OK)
    }

    override fun addFollowers(userId: String, followerId: String): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.followDetails.followersIds.add(followerId)
        user.followDetails.followers = user.followDetails.followersIds.size
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Follower added successfully", true), HttpStatus.CREATED)
    }

    override fun removeFollowers(userId: String, followerId: String): ResponseEntity<ApiResponse> {
        val user = userRepository.getUser(userId)
        user.followDetails.followersIds.remove(followerId)
        user.followDetails.followers = user.followDetails.followersIds.size
        userRepository.saveUser(user)
        return ResponseEntity(ApiResponse("Follower removed successfully", true), HttpStatus.OK)
    }

}