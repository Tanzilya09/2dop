package com.example.dop2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.dop2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var viewModel: MainViewModel? = null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
        setupObserves()
    }

    private fun initialize() {
        binding.btn.setOnClickListener {
            viewModel?.getRandomNumber()
        }
    }

    private fun setupObserves() {
        viewModel?.getRandomNumber()?.observe(this) {
            binding.txt.text = it.toString()
        }
    }
}