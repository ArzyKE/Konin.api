package com.example.koninapi.ui.fragments.tags

import com.example.koninapi.base.BaseViewModel
import com.example.koninapi.data.repoisitories.TagsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TagsViewModel @Inject constructor(private val repository: TagsRepository) : BaseViewModel() {

    fun fetchTags() = repository.fetchTags()
}