package com.metehanbolat.roomflowdi.repository

import com.metehanbolat.roomflowdi.database.User
import com.metehanbolat.roomflowdi.database.UserDao
import javax.inject.Inject

class RoomRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : RoomRepository {

    override suspend fun insertUser(user: User) {
        userDao.addUser(user)
    }

    override fun getAllUser() = userDao.readAllUser()

}