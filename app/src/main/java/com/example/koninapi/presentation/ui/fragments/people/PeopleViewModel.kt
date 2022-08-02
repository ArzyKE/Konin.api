package com.example.koninapi.presentation.ui.fragments.people

import com.example.koninapi.presentation.base.BaseViewModel
import com.example.data.repoisitories.PeopleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PeopleViewModel @Inject constructor(private val repository: PeopleRepository) :
    BaseViewModel() {

    fun fetchPeople(id: Int) = repository.fetchPeople(id)

}