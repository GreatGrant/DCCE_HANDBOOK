package com.gralliams.dccehandbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gralliams.dccehandbook.onboarding.OnboardingActivity

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
            .getBoolean("isFirstRun", true)

        if (isFirstRun) {
            //show start activity
            startActivity(Intent(applicationContext, OnboardingActivity::class.java))
        } else {

            //TODO: MAKE SPLASH SCREEN LAUNCH BEFORE MAINACTIVITY
            startActivity(Intent(applicationContext, HomeActivity::class.java))
        }
        finish()


        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
            .putBoolean("isFirstRun", false).apply()


    }
}