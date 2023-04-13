package com.mzcn.foodrecipes.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mzcn.foodrecipes.adapters.PlaceHolderAdapter
import com.mzcn.foodrecipes.viewmodels.MainViewModel
import com.mzcn.foodrecipes.adapters.RecipesAdapter
import com.mzcn.foodrecipes.databinding.FragmentRecipesBinding
import com.mzcn.foodrecipes.util.NetworkResult
import com.mzcn.foodrecipes.viewmodels.RecipesViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class RecipesFragment : Fragment() {


    private lateinit var mainViewModel: MainViewModel
    private lateinit var recipesViewModel: RecipesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        recipesViewModel = ViewModelProvider(requireActivity())[RecipesViewModel::class.java]

    }


    private val recipesAdapter by lazy {
        RecipesAdapter()
    }

    private val placeHolderAdapter by lazy {
        PlaceHolderAdapter()
    }


    private lateinit var binding: FragmentRecipesBinding
    //
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        binding = FragmentRecipesBinding.inflate(inflater, container, false)

        showShimmerEffect()
        requestApiData()

        return binding.root
    }

    private fun requestApiData(){
        mainViewModel.getRecipes(recipesViewModel.applyQueries())
        mainViewModel.recipesResponse.observe(viewLifecycleOwner) { response ->

            when (response) {
                is NetworkResult.Success -> {
                    hideShimmerEffect()
                    response.data?.let { recipesAdapter.setData(it) }
                }
                is NetworkResult.Error ->{
                    hideShimmerEffect()
                    Toast.makeText(requireContext(), response.message.toString(),Toast.LENGTH_SHORT).show()
                }
                is NetworkResult.Loading ->{
                    showShimmerEffect()
                }
            }

        }
    }



    private fun setupRecyclerView(){
        binding.recyclerView.adapter = recipesAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun showShimmerEffect(){
        binding.recyclerView.adapter = placeHolderAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun hideShimmerEffect(){
        setupRecyclerView()
    }


}