package com.gralliams.dccehandbook.Onboarding

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.gralliams.dccehandbook.MainActivity
import com.gralliams.dccehandbook.R


class OnboardingActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var onboardingAdapter: OnboardingAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        makeStatusbarTransparent()
        viewPager = findViewById(R.id.onboarding_view_pager)
        onboardingAdapter = OnboardingAdapter(this)
        viewPager.adapter = onboardingAdapter
        viewPager.setPageTransformer(false, OnboardingPageTransformer())
    }

    // Listener for next button press
    fun nextPage(view: View) {
        if (view.id == R.id.button2) {
            if (viewPager.currentItem < onboardingAdapter.count - 1) {
                viewPager.setCurrentItem(viewPager.currentItem + 1, true)
            }
        }
    }

    private fun makeStatusbarTransparent() {
//        window.decorView.systemUiVisibility =
//            View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        val window = window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.TRANSPARENT
    }

    fun GetStarted(view: View?) {

        val i = Intent(applicationContext, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}