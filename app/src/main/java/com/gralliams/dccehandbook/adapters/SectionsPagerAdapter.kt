package com.gralliams.dccehandbook.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.gralliams.dccehandbook.R


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(fm: FragmentManager) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    var fragmentList: ArrayList<Fragment> = ArrayList()
    private val TAB_TITLES: ArrayList<String> = ArrayList()

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getPageTitle(position: Int): CharSequence = TAB_TITLES[position]

    override fun getCount(): Int = fragmentList.size

    fun addFragment(fragment: Fragment, title: String){
        fragmentList.add(fragment)
        TAB_TITLES.add(title)
    }
}