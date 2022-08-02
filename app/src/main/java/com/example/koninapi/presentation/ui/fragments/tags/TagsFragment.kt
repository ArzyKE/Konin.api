package com.example.koninapi.presentation.ui.fragments.tags

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.koninapi.R
import com.example.koninapi.presentation.base.BaseFragment
import com.example.koninapi.databinding.FragmentTagsBinding
import com.example.koninapi.presentation.ui.adapters.TagsAdapter
import com.example.koninapi.domain.either.Either
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TagsFragment
    : BaseFragment<TagsViewModel, FragmentTagsBinding>(R.layout.fragment_tags) {

    override val binding by viewBinding(FragmentTagsBinding::bind)
    override val viewModel: TagsViewModel by viewModels()
    private val tagsAdapter = TagsAdapter()


    override fun setupListener() {
        setupRecyclerview()
    }

    private fun setupRecyclerview() = with(binding.recyclerviewTags) {
        layoutManager = LinearLayoutManager(requireContext())
        adapter = tagsAdapter
    }

    override fun setupSubscribes() {
        setupObserves()
    }

    private fun setupObserves() {
        viewModel.fetchTags().observe(viewLifecycleOwner) {
            when (it) {
                is Either.Left -> {
                    Log.e("anime", it.value)
                }
                is Either.Right -> {
                    Log.e("kadyrov", it.value.toString())
                    tagsAdapter.submitList(it.value)
                }
            }
        }
    }
}
