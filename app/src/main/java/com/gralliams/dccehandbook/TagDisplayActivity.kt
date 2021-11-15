package com.gralliams.dccehandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.gralliams.dccehandbook.databinding.ActivityTagDisplayBinding

class TagDisplayActivity : AppCompatActivity() {
    lateinit var binding: ActivityTagDisplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTagDisplayBinding.inflate(layoutInflater)
        setContentView( binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.let { tb ->
            tb.setHomeButtonEnabled(true)
            tb.setDisplayHomeAsUpEnabled(true)
        }

//        var position = intent.getIntExtra(TAG_POSITION, POSITION_NOT_SET)
//        when(position){
//            0 -> setText(R.string.history, "History", R.drawable.atbugate)
//            1 -> setText(R.string.philosophy, "Philosophy", R.drawable.atilport)
//            2 -> setText(R.string.exam_guide, "Exam Guide", R.drawable.senateport)
//            3 -> setText(R.string.management, "Management", R.drawable.undraw_grades_re_j7d6)
//            4 -> setText(R.string.entry_demands, "Exam Demands",  R.drawable.undraw_pair_programming_re_or4x)
//            5 -> setText(R.string.course_duration, "Course Duration", R.drawable.undraw_pair_programming_re_or4x)
//            6 -> setText(R.string.graduation, "Graduation",R.drawable.atbugate)
//            7 -> setText(R.string.grading, "Grading",R.drawable.atbugate)
//            8 -> setText(R.string.staff_list, "Staff List",R.drawable.atbugate)
//        }

        val webView: WebView = binding.txtCollapse
        var position = intent.getIntExtra(TAG_POSITION, POSITION_NOT_SET)
        var webUrl =
            when(position){
                0 -> "file:///android_asset/History.html"
                1 -> "file:///android_asset/two_hundred_fs.html"
                2 -> "file:///android_asset/three_hundred_fs.html"
                3 -> "file:///android_asset/four_hundred_fs.html"
                else ->"file:///android_asset/five_hundred_fs.html"
            }
        webView.loadUrl(webUrl)



    }


    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
//
}