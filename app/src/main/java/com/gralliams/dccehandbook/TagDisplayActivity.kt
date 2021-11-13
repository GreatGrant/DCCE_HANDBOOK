package com.gralliams.dccehandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        var position = intent.getIntExtra(TAG_POSITION, POSITION_NOT_SET)
        when(position){
            0 -> setText(R.string.history, "History", R.drawable.atbugate)
            1 -> setText(R.string.philosophy, "Philosophy", R.drawable.atilport)
            2 -> setText(R.string.exam_guide, "Exam Guide", R.drawable.senateport)
            3 -> setText(R.string.management, "Management", R.drawable.undraw_grades_re_j7d6)
            4 -> setText(R.string.entry_demands, "Exam Demands",  R.drawable.undraw_pair_programming_re_or4x)
            5 -> setText(R.string.course_duration, "Course Duration", R.drawable.undraw_pair_programming_re_or4x)
            6 -> setText(R.string.graduation, "Graduation",R.drawable.atbugate)
            7 -> setText(R.string.grading, "Grading",R.drawable.atbugate)
            8 -> setText(R.string.staff_list, "Staff List",R.drawable.atbugate)
        }



    }


    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
    private fun setText(stringRes: Int, toolBarTitle: String, image:  Int) {
        binding.txtCollapse.text =  getString(stringRes)
        binding.toolbar.title  = toolBarTitle
        binding.appBarImage.setImageResource(image)
    }
}