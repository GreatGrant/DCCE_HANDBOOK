package com.gralliams.dccehandbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.gralliams.dccehandbook.databinding.FragmentFirstSemesterBinding


class FirstSemesterFragment : Fragment() {
    private var _binding: FragmentFirstSemesterBinding? = null

    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstSemesterBinding.inflate(inflater, container, false)
        val root = _binding!!.root

        val webView: WebView = _binding!!.fsWebview
        var position = requireActivity().intent.getIntExtra(TAG_POSITION, POSITION_NOT_SET)
        var webUrl =
            when(position){
            0 -> "file:///android_asset/hundred_fs.html"
            1 -> "file:///android_asset/two_hundred_fs.html"
            2 -> "file:///android_asset/three_hundred_fs.html"
            3 -> "file:///android_asset/four_hundred_fs.html"
                else ->"file:///android_asset/five_hundred_fs.html"
            }
        webView.loadUrl(webUrl)



        return root

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}