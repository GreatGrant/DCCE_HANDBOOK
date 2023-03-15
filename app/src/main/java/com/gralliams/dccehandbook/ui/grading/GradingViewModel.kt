package com.gralliams.dccehandbook.ui.grading

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GradingViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "file:///android_asset/grading.html"
    }
    val text: LiveData<String> = _text

}