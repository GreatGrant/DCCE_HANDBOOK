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
            tb.setHomeButtonEnabled(true)
        }

        var position = intent.getIntExtra(TAG_POSITION, POSITION_NOT_SET)
        when(position){
            0 -> setText(R.string.history, "History")
            1 -> setText(R.string.philosophy, "Philosophy")
            2 -> setText(R.string.exam_guide, "Exam Guide")
            3 -> setText(R.string.management, "Management")
            4 -> setText(R.string.entry_demands, "Exam Demands")
            5 -> setText(R.string.course_duration, "Course Duration")
            6 -> setText(R.string.graduation, "Graduation")
            7 -> setText(R.string.grading, "Grading")
            8 -> setText(R.string.staff_list, "Staff List")
        }
    }

    private fun setText(stringRes: Int, toolBarTitle: String) {
        binding.txtCollapse.text =  getString(stringRes)
        binding.toolbar.title  = toolBarTitle
    }
}