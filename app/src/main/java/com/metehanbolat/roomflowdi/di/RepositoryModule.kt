package com.metehanbolat.roomflowdi.di

import com.metehanbolat.roomflowdi.repository.RoomRepository
import com.metehanbolat.roomflowdi.repository.RoomRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRoomRepository(roomRepositoryImpl: RoomRepositoryImpl): RoomRepository
}