package com.gralliams.dccehandbook.ui.philosophy

import android.os.Bundle
import android.view.*
import android.webkit.WebSettings
import androidx.fragment.app.Fragment
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.databinding.FragmentPhilosophyBinding

class PhilosophyFragment : Fragment() {

//    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentPhilosophyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhilosophyBinding.inflate(inflater, container, false)
        val webView = binding.webPhilosophy

        webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;
        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(webView.settings, true);
        }

        binding.webPhilosophy.loadUrl("file:///android_asset/philosophy.html")
        return binding.root
    }

}