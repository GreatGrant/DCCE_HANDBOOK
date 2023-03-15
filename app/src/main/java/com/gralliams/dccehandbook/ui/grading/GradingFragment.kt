package com.gralliams.dccehandbook.ui.grading

import android.content.res.Configuration
import android.os.Bundle
import android.view.*
import android.webkit.WebSettings
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.databinding.FragmentGradingBinding

class GradingFragment : Fragment() {
    private lateinit var binding: FragmentGradingBinding
    private lateinit var viewModel: GradingViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        this.binding = FragmentGradingBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[GradingViewModel::class.java]

        binding.webGrading.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;
        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(binding.webGrading.settings, true);
        }

        viewModel.text.observe(viewLifecycleOwner){link ->
            this.binding.webGrading.loadUrl(link)
        }
        return this.binding.root
    }

}