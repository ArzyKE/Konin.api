package com.example.koninapi.ui.fragments.people

import com.example.koninapi.base.BaseViewModel
import com.example.koninapi.data.repoisitories.PeopleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PeopleViewModel @Inject constructor(private val repository: PeopleRepository) :
    BaseViewModel() {

    fun fetchPeople(id: Int) = repository.fetchPeople(id)

}