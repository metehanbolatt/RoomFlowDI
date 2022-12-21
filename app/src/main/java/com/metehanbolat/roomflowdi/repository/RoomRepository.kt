package com.metehanbolat.roomflowdi.repository

import com.metehanbolat.roomflowdi.database.User
import kotlinx.coroutines.flow.Flow

interface RoomRepository {

    suspend fun insertUser(user: User)
    fun getAllUser(): Flow<List<User>>

}