package com.gralliams.dccehandbook.ui.curriculum

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CurriculumViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "file:///android_asset/curriculum.html"
    }
    val text: LiveData<String> = _text

}