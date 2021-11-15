package com.gralliams.dccehandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.gralliams.dccehandbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)


        binding.recyclerTags.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.HORIZONTAL)
        binding.recyclerTags.adapter  = TagsAdapter(this, Tag.tagList)

        binding.recyclerSyllabus.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerSyllabus.adapter  = SyllabusAdapter(this, Syllabus.syallusList)

    }
}