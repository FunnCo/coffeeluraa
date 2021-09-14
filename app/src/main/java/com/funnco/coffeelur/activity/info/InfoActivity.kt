package com.funnco.coffeelur.activity.info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.funnco.coffeelur.R
import com.funnco.coffeelur.common.data.Repository
import com.funnco.coffeelur.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        var pageAdapter = PageAdapter(Repository.getCoffeeList())

        binding.activityInfoPager.adapter = pageAdapter

        setContentView(binding.root)
    }
}