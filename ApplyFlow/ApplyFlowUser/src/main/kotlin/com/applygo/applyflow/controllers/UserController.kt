package com.applygo.applyflow.controllers

import com.applygo.applyflow.entity.*
import com.applygo.applyflow.objects.ApiResponse
import com.applygo.applyflow.services.UserService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user/v1")
@Tag(name = "User Profile Operators", description = "Endpoints for user profile operations.")
class UserController(val userService: UserService) {

    @PostMapping("/create/user")
    @Operation(summary = "Create a new user", description = "Create a new user with the given details.")
    fun createUser(@RequestBody user: User): ResponseEntity<ApiResponse> = userService.createUser(user)

    @PutMapping("/update/personals")
    @Operation(summary = "Update user personal info", description = "Update the personal info of the user.")
    fun updateUserPersonalInfo(@RequestParam userId: String, @RequestBody user: User): ResponseEntity<ApiResponse> =
        userService.updateUserPersonalInfo(userId, user)

    @PutMapping("/update/description")
    @Operation(summary = "Update user description", description = "Update the description of the user.")
    fun updateUserDescription(@RequestParam userId: String, @RequestBody user: User): ResponseEntity<ApiResponse> =
        userService.updateUserDescription(userId, user)

    @DeleteMapping("/delete/user")
    @Operation(summary = "Delete a user", description = "Delete a user with the given user ID.")
    fun deleteUser(@RequestParam userId: String): ResponseEntity<ApiResponse> = userService.deleteUser(userId)

    @PostMapping("/add/skill")
    @Operation(summary = "Add a skill", description = "Add a skill to the user's profile.")
    fun addSkill(@RequestParam userId: String, @RequestBody skill: Skill): ResponseEntity<ApiResponse> =
        userService.addSkill(userId, skill)

    @DeleteMapping("/remove/skill")
    @Operation(summary = "Remove a skill", description = "Remove a skill from the user's profile.")
    fun removeSkill(@RequestParam userId: String, @RequestParam skillId: String): ResponseEntity<ApiResponse> =
        userService.removeSkill(userId, skillId)

    @PostMapping("/add/experience")
    @Operation(summary = "Add a job experience", description = "Add a job experience to the user's profile.")
    fun addExperience(
        @RequestParam userId: String, @RequestBody experience: JobExperience
    ): ResponseEntity<ApiResponse> = userService.addExperience(userId, experience)

    @PutMapping("/update/experience")
    @Operation(summary = "Update a job experience", description = "Update a job experience in the user's profile.")
    fun updateExperience(
        @RequestParam userId: String, @RequestParam experienceId: String, @RequestBody experience: JobExperience
    ): ResponseEntity<ApiResponse> = userService.updateExperience(userId, experienceId, experience)

    @DeleteMapping("/remove/experience")
    @Operation(summary = "Remove a job experience", description = "Remove a job experience from the user's profile.")
    fun removeExperience(
        @RequestParam userId: String, @RequestParam experienceId: String
    ): ResponseEntity<ApiResponse> = userService.removeExperience(userId, experienceId)

    @PostMapping("/add/project")
    @Operation(summary = "Add a project", description = "Add a project to the user's profile.")
    fun addProject(@RequestParam userId: String, @RequestParam project: Project): ResponseEntity<ApiResponse> =
        userService.addProject(userId, project)

    @PutMapping("/update/project")
    @Operation(summary = "Update a project", description = "Update a project in the user's profile.")
    fun updateProject(
        @RequestParam userId: String, @RequestParam projectId: String, @RequestBody project: Project
    ): ResponseEntity<ApiResponse> = userService.updateProject(userId, projectId, project)

    @DeleteMapping("/remove/project")
    @Operation(summary = "Remove a project", description = "Remove a project from the user's profile.")
    fun removeProject(@RequestParam userId: String, @RequestParam projectId: String): ResponseEntity<ApiResponse> =
        userService.removeProject(userId, projectId)

    @PostMapping("/add/publication")
    @Operation(summary = "Add a publication", description = "Add a publication to the user's profile.")
    fun addPublication(
        @RequestParam userId: String, @RequestBody publication: Publication
    ): ResponseEntity<ApiResponse> = userService.addPublication(userId, publication)

    @PutMapping("/update/publication")
    @Operation(summary = "Update a publication", description = "Update a publication in the user's profile.")
    fun updatePublication(
        @RequestParam userId: String, @RequestParam publicationId: String, @RequestBody publication: Publication
    ): ResponseEntity<ApiResponse> = userService.updatePublication(userId, publicationId, publication)

    @DeleteMapping("/remove/publication")
    @Operation(summary = "Remove a publication", description = "Remove a publication from the user's profile.")
    fun removePublication(
        @RequestParam userId: String, @RequestParam publicationId: String
    ): ResponseEntity<ApiResponse> = userService.removePublication(userId, publicationId)

    @PostMapping("/add/education")
    @Operation(summary = "Add an education", description = "Add an education to the user's profile.")
    fun addEducation(@RequestParam userId: String, @RequestBody education: Education): ResponseEntity<ApiResponse> =
        userService.addEducation(userId, education)

    @PutMapping("/update/education")
    @Operation(summary = "Update an education", description = "Update an education in the user's profile.")
    fun updateEducation(
        @RequestParam userId: String, @RequestParam educationId: String, @RequestBody education: Education
    ): ResponseEntity<ApiResponse> = userService.updateEducation(userId, educationId, education)

    @DeleteMapping("/remove/education")
    @Operation(summary = "Remove an education", description = "Remove an education from the user's profile.")
    fun removeEducation(@RequestParam userId: String, @RequestParam educationId: String): ResponseEntity<ApiResponse> =
        userService.removeEducation(userId, educationId)

    @PostMapping("/add/certification")
    @Operation(summary = "Add a certification", description = "Add a certification to the user's profile.")
    fun addCertification(
        @RequestParam userId: String, @RequestBody certification: Certification
    ): ResponseEntity<ApiResponse> = userService.addCertification(userId, certification)

    @PutMapping("/update/certification")
    @Operation(summary = "Update a certification", description = "Update a certification in the user's profile.")
    fun updateCertification(
        @RequestParam userId: String, @RequestParam certificationId: String, @RequestBody certification: Certification
    ): ResponseEntity<ApiResponse> = userService.updateCertification(userId, certificationId, certification)

    @DeleteMapping("/remove/certification")
    @Operation(summary = "Remove a certification", description = "Remove a certification from the user's profile.")
    fun removeCertification(
        @RequestParam userId: String, @RequestParam certificationId: String
    ): ResponseEntity<ApiResponse> = userService.removeCertification(userId, certificationId)

    @PostMapping("/add/achievement")
    @Operation(summary = "Add an achievement", description = "Add an achievement to the user's profile.")
    fun addAchievement(
        @RequestParam userId: String, @RequestBody achievement: Achievement
    ): ResponseEntity<ApiResponse> = userService.addAchievement(userId, achievement)

    @PutMapping("/update/achievement")
    @Operation(summary = "Update an achievement", description = "Update an achievement in the user's profile.")
    fun updateAchievement(
        @RequestParam userId: String, @RequestParam achievementId: String, @RequestBody achievement: Achievement
    ): ResponseEntity<ApiResponse> = userService.updateAchievement(userId, achievementId, achievement)

    @DeleteMapping("/remove/achievement")
    @Operation(summary = "Remove an achievement", description = "Remove an achievement from the user's profile.")
    fun removeAchievement(
        @RequestParam userId: String, @RequestParam achievementId: String
    ): ResponseEntity<ApiResponse> = userService.removeAchievement(userId, achievementId)

    @PostMapping("/add/followers")
    @Operation(summary = "Add a follower", description = "Add a follower to the user's profile.")
    fun addFollowers(@RequestParam userId: String, @RequestParam followerId: String): ResponseEntity<ApiResponse> =
        userService.addFollowers(userId, followerId)

    @DeleteMapping("/remove/followers")
    @Operation(summary = "Remove a follower", description = "Remove a follower from the user's profile.")
    fun removeFollowers(@RequestParam userId: String, @RequestParam followerId: String): ResponseEntity<ApiResponse> =
        userService.removeFollowers(userId, followerId)

}