package com.gralliams.dccehandbook.onboarding

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.gralliams.dccehandbook.HomeActivity
import com.gralliams.dccehandbook.R
import com.gralliams.dccehandbook.databinding.ActivityOnboardingBinding


class OnboardingActivity : AppCompatActivity() {
    private lateinit var onboardingAdapter: OnboardingAdapter
    private lateinit var binding: ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        makeStatusbarTransparent()
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)


        onboardingAdapter = OnboardingAdapter(this)
        binding.onboardingViewPager.adapter = onboardingAdapter
        binding.onboardingViewPager.setPageTransformer(false, OnboardingPageTransformer())
    }

    // Listener for next button press
    fun nextPage(view: View) {
        if (view.id == R.id.button2) {
            if (binding.onboardingViewPager.currentItem < onboardingAdapter.count - 1) {
                binding.onboardingViewPager.setCurrentItem(binding.onboardingViewPager.currentItem + 1, true)
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

        val i = Intent(applicationContext, HomeActivity::class.java)
        startActivity(i)
        finish()
    }
}