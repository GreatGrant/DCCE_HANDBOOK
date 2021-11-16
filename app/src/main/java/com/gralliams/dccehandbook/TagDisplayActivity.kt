package com.gralliams.dccehandbook

import android.content.Intent.ACTION_SEND
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.webkit.WebView
import com.gralliams.dccehandbook.databinding.ActivityTagDisplayBinding

class TagDisplayActivity : AppCompatActivity() {
    lateinit var binding: ActivityTagDisplayBinding
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTagDisplayBinding.inflate(layoutInflater)
        setContentView( binding.root)

        setSupportActionBar(binding.toolbar)
        webView = binding.webCollapse



        var position = intent.getIntExtra(TAG_POSITION, POSITION_NOT_SET)
        when(position){
            0 -> setText(R.string.history, "file:///android_asset/History.html", R.drawable.ic_undraw_map_re_60yf)
            1 -> setText(R.string.philosophy, "file:///android_asset/philosophy.html", R.drawable.ic_undraw_in_thought_re_qyxl)
            2 -> setText(R.string.exam_guide,  "file:///android_asset/exam.html", R.drawable.ic_undraw_exams_g_4_ow)
            3 -> setText(R.string.Regulations, "file:///android_asset/acad_reg.html", R.drawable.undraw_grades_re_j7d6)
            4 -> setText(R.string.entry_demands, "file:///android_asset/admission_req.html",  R.drawable.undraw_pair_programming_re_or4x)
            5 -> setText(R.string.course_duration, "file:///android_asset/five_hundred_fs.html", R.drawable.ic_undraw_visualization_c_2_ps)
            6 -> setText(R.string.graduation, "file:///android_asset/five_hundred_fs.html",R.drawable.ic_undraw_education_f8ru)
            7 -> setText(R.string.grading, "file:///android_asset/grading.html",R.drawable.ic_undraw_certificate__343_v)
            else-> setText(R.string.staff_list, "file:///android_asset/five_hundred_fs.html",R.drawable.undraw_grades_re_j7d6)
        }






    }

    private fun setText(title: Int, url: String, image: Int) {
        webView.loadUrl(url)
        supportActionBar?.let { tb ->
            tb.setHomeButtonEnabled(true)
            tb.setDisplayHomeAsUpEnabled(true)
            tb.title = getString(title)
        }

        binding.appBarImage.setImageResource(image)

    }


    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
//
}