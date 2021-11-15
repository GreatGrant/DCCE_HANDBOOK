package com.gralliams.dccehandbook.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gralliams.dccehandbook.POSITION_NOT_SET
import com.gralliams.dccehandbook.R
import com.gralliams.dccehandbook.TAG_POSITION
import com.gralliams.dccehandbook.databinding.FragmentSecondSemesterBinding

/**
 * A placeholder fragment containing a simple view.
 */
class SecondSemesterFragment : Fragment() {

    private var _binding: FragmentSecondSemesterBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondSemesterBinding.inflate(inflater, container, false)
        val root = binding.root


        val webview: WebView = binding.ssWebview

        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}