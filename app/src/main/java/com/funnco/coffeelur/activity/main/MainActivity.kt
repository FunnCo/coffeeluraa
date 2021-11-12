package com.funnco.coffeelur.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.funnco.coffeelur.common.data.Repository
import com.funnco.coffeelur.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.hide()

        val adapterPositions = CoffeeAdapter(Repository.getCoffeeList(), this)
        binding.activityMainRecyclerPositions.adapter = adapterPositions
        binding.activityMainRecyclerPositions.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        val adapterCategories = CategoryAdapter(Repository.getCategories())
        binding.activityMainRecyclerCategories.adapter = adapterCategories
        binding.activityMainRecyclerCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        setContentView(binding.root)
    }

}