package com.applygo.applyflow.helpers

import com.applygo.applyflow.entity.User
import com.applygo.applyflow.objects.Helper
import com.applygo.applyflow.objects.USER_COLLECTION
import com.applygo.applyflow.repository.UserRepository
import com.google.api.core.ApiFuture
import com.google.cloud.firestore.WriteResult
import com.google.firebase.cloud.FirestoreClient

@Helper
class FirebaseRepositoryHelper : UserRepository {

    override fun saveUser(user: User): ApiFuture<WriteResult> =
        FirestoreClient.getFirestore().collection(USER_COLLECTION).document(user.id!!).set(user)

    override fun getUser(userId: String): User =
        FirestoreClient.getFirestore().collection(USER_COLLECTION).document(userId).get().get()
            .toObject(User::class.java)!!

    override fun deleteUserdata(userId: String): ApiFuture<WriteResult> =
        FirestoreClient.getFirestore().collection(USER_COLLECTION).document(userId).delete()

}