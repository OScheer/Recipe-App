package com.example.recipeapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.recipeapp.viewmodel.DetailViewModel

class DetailFragment: Fragment() {

    private lateinit var viewModel: DetailViewModel
//    private lateinit var dataBinding:

    private var recipeUuid = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            recipeUuid = DetailFragmentArgs.fromBundle(it).mealUuid
        }

        viewModel = ViewModelProviders.of(this).get(DetailViewModel::class.java)
        viewModel.fetch(recipeUuid)

        observeViewModel()
    }

    private fun observeViewModel() {

    }

}