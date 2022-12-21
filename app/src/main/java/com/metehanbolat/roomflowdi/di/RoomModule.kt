package com.metehanbolat.roomflowdi.di

import android.content.Context
import androidx.room.Room
import com.metehanbolat.roomflowdi.database.UserDao
import com.metehanbolat.roomflowdi.database.UserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    fun provideUserDatabase(
        @ApplicationContext context: Context
    ): UserDatabase = Room.databaseBuilder(
        context,
        UserDatabase::class.java,
        "user_database"
    ).build()

    @Provides
    fun provideUserDao(userDatabase: UserDatabase): UserDao = userDatabase.userDao()
}