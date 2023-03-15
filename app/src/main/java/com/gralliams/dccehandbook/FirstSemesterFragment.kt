package com.gralliams.dccehandbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.databinding.FragmentFirstSemesterBinding


class FirstSemesterFragment : Fragment() {
    private lateinit var binding: FragmentFirstSemesterBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstSemesterBinding.inflate(inflater, container, false)

        val webView: WebView = binding.fsWebview
        webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;



        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(webView.settings, true);
        }

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



        return binding.root

    }


}