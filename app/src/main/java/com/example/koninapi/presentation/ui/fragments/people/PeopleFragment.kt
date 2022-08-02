package com.example.koninapi.presentation.ui.fragments.people

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.koninapi.R
import com.example.koninapi.presentation.base.BaseFragment
import com.example.koninapi.databinding.FragmentPeopleBinding
import com.example.koninapi.domain.either.Either
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PeopleFragment
    : BaseFragment<PeopleViewModel, FragmentPeopleBinding>(R.layout.fragment_people) {

    override val binding by viewBinding(FragmentPeopleBinding::bind)
    override val viewModel: PeopleViewModel by viewModels()

    override fun setupSubscribes() {
        setupObserves()
    }

    private fun setupObserves() {
        viewModel.fetchPeople(1).observe(viewLifecycleOwner) {
            when (it) {
                is Either.Left -> {
                    Log.e("anime", it.value)
                }
                is Either.Right -> {
                    Log.e("Arzymat", it.value.toString())
                    it.value.apply {
                        binding.itemPeopleName.text = name
                        binding.itemPeopleDescription.text = description
                    }
                }
            }
        }
    }
}

