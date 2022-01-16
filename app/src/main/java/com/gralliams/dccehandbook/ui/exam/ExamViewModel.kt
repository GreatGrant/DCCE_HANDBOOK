package com.gralliams.dccehandbook.ui.exam

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExamViewModel : ViewModel(){
    private var _link = MutableLiveData<String>().apply {
        value = "file:///android_asset/exam.html"
    }

    var link: MutableLiveData<String> = _link
}