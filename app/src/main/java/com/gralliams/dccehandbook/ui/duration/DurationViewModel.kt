package com.gralliams.dccehandbook.ui.duration

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DurationViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "file:///android_asset/duration.html"
    }
    val text: LiveData<String> = _text

}