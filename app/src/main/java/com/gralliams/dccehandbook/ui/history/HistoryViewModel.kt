package com.gralliams.dccehandbook.ui.history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "file:///android_asset/History.html"
    }
    val text: LiveData<String> = _text
}