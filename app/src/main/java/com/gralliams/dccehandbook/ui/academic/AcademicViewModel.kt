package com.gralliams.dccehandbook.ui.academic

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AcademicViewModel: ViewModel() {
    private var _url = MutableLiveData<String>().apply {
        value = "file:///android_asset/acad_reg.html"
    }

    val url: MutableLiveData<String> = _url
}