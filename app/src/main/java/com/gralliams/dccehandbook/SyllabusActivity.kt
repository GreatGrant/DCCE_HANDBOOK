package com.gralliams.dccehandbook

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.gralliams.dccehandbook.ui.main.SectionsPagerAdapter
import com.gralliams.dccehandbook.databinding.ActivitySyllabusBinding
import com.gralliams.dccehandbook.ui.main.SecondSemesterFragment

class SyllabusActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySyllabusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySyllabusBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val sectionsPagerAdapter = SectionsPagerAdapter( supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        sectionsPagerAdapter.addFragment(FirstSemesterFragment(), getString(R.string.tab_text_1))
        sectionsPagerAdapter.addFragment(SecondSemesterFragment(), getString(R.string.tab_text_2))
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

        val title  =
            when(intent.getIntExtra(TAG_POSITION, POSITION_NOT_SET)){
                0 ->  "100 Level"
                1 ->  "200 Level"
                2 ->  "300 Level"
                3 ->  "400 Level"
                else ->"500 Level"
            }
        binding.title.text =  title


    }
}