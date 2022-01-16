package com.gralliams.dccehandbook.ui.admission

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AdmisionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "file:///android_asset/admission_req.html"
    }
    val text: LiveData<String> = _text
}