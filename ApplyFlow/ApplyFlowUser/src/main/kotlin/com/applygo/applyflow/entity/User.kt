package com.applygo.applyflow.entity

import com.applygo.applyflow.objects.EMPTY
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

data class User(
    var id: String? = null,
    var email: String = EMPTY,
    var userHandle: String = EMPTY,
    var personalInfo: PersonalInfo = PersonalInfo(),
    var userDescription: UserDescription = UserDescription(),
    var followDetails: FollowDetails = FollowDetails(),
    var skills: MutableList<Skill> = mutableListOf(),
    var experience: MutableList<JobExperience> = mutableListOf(),
    var education: MutableList<Education> = mutableListOf(),
    var projects: MutableList<Project> = mutableListOf(),
    var publications: MutableList<Publication> = mutableListOf(),
    var certifications: MutableList<Certification> = mutableListOf(),
    var achievements: MutableList<Achievement> = mutableListOf(),
    var resumeUrl: String = EMPTY,
    var createdAt: String = System.currentTimeMillis().toString()
)

@Document
data class UserPayload(
    @Id var id: String? = null, var profilePictureUrl: String, var fullName: String, var headline: String
)

data class PersonalInfo(
    var fullName: String = EMPTY,
    var gender: String = EMPTY,
    var dateOfBirth: String = EMPTY,
    var address: Address = Address(),
    var phoneNumber: String = EMPTY,
    var profilePictureUrl: String = EMPTY,
    var externalUrl: String = EMPTY
)

data class Address(
    var city: String = EMPTY, var state: String = EMPTY, var country: String = EMPTY
)

data class UserDescription(
    var headline: String = EMPTY, var bio: String = EMPTY, var professionalSummary: String = EMPTY
)

data class FollowDetails(
    var followers: Int = 0, var followersIds: MutableList<String> = mutableListOf()
)

data class Skill(
    var createdAt: String = System.currentTimeMillis().toString(),
    var name: String = EMPTY,
)

data class JobExperience(
    var createdAt: String = System.currentTimeMillis().toString(),
    var companyName: String = EMPTY,
    var position: String = EMPTY,
    var startDate: String = EMPTY,
    var endDate: String = EMPTY,
    var description: String = EMPTY
)

data class Education(
    var createdAt: String = System.currentTimeMillis().toString(),
    var institutionName: String = EMPTY,
    var degree: String = EMPTY,
    var startDate: String = EMPTY,
    var endDate: String = EMPTY,
)

data class Project(
    var createdAt: String = System.currentTimeMillis().toString(),
    var title: String,
    var description: String = EMPTY,
    var techStack: List<String> = mutableListOf(),
    var projectUrl: String = EMPTY,
)

data class Publication(
    var createdAt: String = System.currentTimeMillis().toString(),
    var title: String = EMPTY,
    var publisher: String = EMPTY,
    var publicationDate: String = EMPTY,
    var publicationUrl: String = EMPTY
)

data class Certification(
    var createdAt: String = System.currentTimeMillis().toString(),
    var name: String = EMPTY,
    var issuingOrganization: String = EMPTY,
    var issueDate: String = EMPTY,
    var credentialUrl: String = EMPTY,
    var certificateUrl: String = EMPTY
)

data class Achievement(
    var createdAt: String = System.currentTimeMillis().toString(),
    var title: String = EMPTY,
    var issueDate: String = EMPTY,
    var description: String = EMPTY,
    var achievementUrl: String = EMPTY
)
