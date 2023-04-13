package com.mzcn.foodrecipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Orientation
import com.mzcn.foodrecipes.databinding.ActivityMainBinding
import com.mzcn.foodrecipes.databinding.FragmentRecipesBinding
import com.mzcn.foodrecipes.databinding.PlaceholderRowLayoutBinding


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