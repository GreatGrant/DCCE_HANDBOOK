package com.gralliams.dccehandbook.ui.exam

import android.os.Bundle
import android.view.*
import android.webkit.WebSettings
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.databinding.FragmentExamsBinding

class ExamFragment : Fragment() {
    private lateinit var viewModel: ExamViewModel
    private lateinit var binding: FragmentExamsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        this.binding = FragmentExamsBinding.inflate(inflater, container, false)
        val webView = this.binding.webExams
        webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;

        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(webView.settings, true);
        }

        viewModel = ViewModelProvider(this)[ExamViewModel::class.java]

        viewModel.link.observe(viewLifecycleOwner, Observer {
            webView.loadUrl(it)
        })
        return this.binding.root
    }

}