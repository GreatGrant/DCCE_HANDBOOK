package com.gralliams.dccehandbook

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.let { tb ->
            tb.setHomeButtonEnabled(true)
            tb.setDisplayHomeAsUpEnabled(true)
            tb.title = "About"
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    fun followOnTwitter(view: android.view.View) {
        connectToUrl("https://m.twitter.com/iAmGreatGrant")
    }

    fun linkUp(view: android.view.View) {
        connectToUrl("https://linkedin.com/in/Great-Grant-Williams")
            }

    fun mailMe(view: android.view.View) {
         var intent = Intent(Intent.ACTION_SEND)
         intent.type =  "message/rfc822"
        intent.apply{
            putExtra(Intent.EXTRA_SUBJECT, "Hello there!")
            putExtra(Intent.EXTRA_EMAIL, arrayOf("greatgrant116@gmail.com"))
        }
        var mailer = Intent.createChooser(intent, "Send mail using...")
        startActivity(mailer)
    }
    fun connectOnGit(view: android.view.View) {
        connectToUrl("https://github.com/GreatGrant")
        }

        private fun connectToUrl(url: String){
            try{
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }catch (e: Exception){
                var intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }
    }