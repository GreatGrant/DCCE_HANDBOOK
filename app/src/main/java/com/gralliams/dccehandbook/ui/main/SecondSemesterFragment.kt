package com.gralliams.dccehandbook.ui.main

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.POSITION_NOT_SET
import com.gralliams.dccehandbook.TAG_POSITION
import com.gralliams.dccehandbook.databinding.FragmentSecondSemesterBinding

/**
 * A placeholder fragment containing a simple view.
 */
class SecondSemesterFragment : Fragment() {

    private lateinit var binding: FragmentSecondSemesterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondSemesterBinding.inflate(inflater, container, false)
        val root = binding.root


        val webView: WebView = binding.ssWebview
        webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;

        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(webView.settings, true);
        }

        val webUrl =
            when(requireActivity().intent.getIntExtra(TAG_POSITION, POSITION_NOT_SET)){
                0 -> "file:///android_asset/hundred_ss.html"
                1 -> "file:///android_asset/two_hundred_ss.html"
                2 -> "file:///android_asset/three_hundred_ss.html"
                3 -> "file:///android_asset/four_hundred_ss.html"
                else ->"file:///android_asset/five_hundred_ss.html"
            }
        webView.loadUrl(webUrl)


        return root
    }


}