package com.gralliams.dccehandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gralliams.dccehandbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
    }
}