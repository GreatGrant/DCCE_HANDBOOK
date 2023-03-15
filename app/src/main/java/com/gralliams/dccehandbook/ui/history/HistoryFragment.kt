package com.gralliams.dccehandbook.ui.history

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {

    private lateinit var historyViewModel: HistoryViewModel
    private lateinit var binding: FragmentHistoryBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        historyViewModel =
            ViewModelProvider(this)[HistoryViewModel::class.java]

        binding = FragmentHistoryBinding.inflate(inflater, container, false)
        var webView = binding.webHistory

        webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;
        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(webView.settings, true);
        }

        historyViewModel.text.observe(viewLifecycleOwner, Observer {
            webView.loadUrl(it)
        })
        return binding.root
    }

}