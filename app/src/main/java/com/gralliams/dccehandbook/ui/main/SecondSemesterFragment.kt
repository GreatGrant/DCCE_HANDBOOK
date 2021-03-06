package com.gralliams.dccehandbook.ui.main

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
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


        val webView: WebView = binding.ssWebview
        if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
            when (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
                Configuration.UI_MODE_NIGHT_YES -> {
                    WebSettingsCompat.setForceDark(webView.settings,
                        WebSettingsCompat.FORCE_DARK_ON
                    )
                }
                Configuration.UI_MODE_NIGHT_NO, Configuration.UI_MODE_NIGHT_UNDEFINED -> {
                    WebSettingsCompat.setForceDark(webView.settings,
                        WebSettingsCompat.FORCE_DARK_OFF
                    )
                }
                else -> {
                    //
                }
            }
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


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}