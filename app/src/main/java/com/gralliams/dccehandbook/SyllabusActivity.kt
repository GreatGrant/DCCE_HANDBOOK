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

        var position = intent.getIntExtra(TAG_POSITION, POSITION_NOT_SET)
//        var webUrl = when(position){
//            0 -> "file:///android_asset/hundred_fs.html"
//            1 -> "file:///android_asset/two_hundred_fs.html"
//            2 -> "file:///android_asset/three_hundred_fs.html"
//            3 -> "file:///android_asset/four_hundred_fs.html"
//            4 -> "file:///android_asset/five_hundred_fs.html"
//        }

    }
}