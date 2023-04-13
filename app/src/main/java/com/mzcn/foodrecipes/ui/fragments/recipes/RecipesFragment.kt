package com.mzcn.foodrecipes.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mzcn.foodrecipes.RecyclerAdapter
import com.mzcn.foodrecipes.databinding.FragmentRecipesBinding


class RecipesFragment : Fragment() {


    private lateinit var binding: FragmentRecipesBinding
    //
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        binding = FragmentRecipesBinding.inflate(inflater, container, false)


        val adapter = RecyclerAdapter(arrayListOf("Hello", "World", "Kotlin"))

        binding.recyclerView.adapter = adapter




        return binding.root
    }
}