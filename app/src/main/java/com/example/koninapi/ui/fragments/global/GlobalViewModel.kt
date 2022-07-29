package com.example.koninapi.ui.fragments.global

import com.example.koninapi.base.BaseViewModel
import com.example.koninapi.data.repoisitories.GlobalRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GlobalViewModel @Inject constructor(private val repository: GlobalRepository) :
    BaseViewModel() {

    fun fetchGlobal() = repository.fetchGlobal()

}