package com.metehanbolat.roomflowdi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.metehanbolat.roomflowdi.database.User
import com.metehanbolat.roomflowdi.repository.RoomRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: RoomRepository
): ViewModel() {

    fun getAllUser() = repository.getAllUser().asLiveData(viewModelScope.coroutineContext)

    fun addUser(user: User) = viewModelScope.launch {
        repository.insertUser(user)
    }
}