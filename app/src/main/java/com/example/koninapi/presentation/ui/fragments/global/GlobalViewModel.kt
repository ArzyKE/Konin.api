package com.example.koninapi.presentation.ui.fragments.global

import com.example.koninapi.presentation.base.BaseViewModel
import com.example.koninapi.data.repoisitories.GlobalRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GlobalViewModel @Inject constructor(private val repository: GlobalRepository) :
    BaseViewModel() {

    fun fetchGlobal() = repository.fetchGlobal()

}