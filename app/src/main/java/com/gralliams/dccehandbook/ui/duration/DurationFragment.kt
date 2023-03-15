package com.gralliams.dccehandbook.ui.duration

import android.content.res.Configuration
import android.os.Bundle
import android.view.*
import android.webkit.WebSettings
import androidx.fragment.app.Fragment
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.databinding.FragmentDurationBinding

class DurationFragment : Fragment() {
    private lateinit var viewModel: DurationViewModel
    private lateinit var binding: FragmentDurationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        this.binding = FragmentDurationBinding.inflate(inflater, container, false)

        binding.webDuration.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;

        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(binding.webDuration.settings, true);
        }

        viewModel.text.observe(viewLifecycleOwner) { link ->
            this.binding.webDuration.loadUrl(link)
        }

        return this.binding.root
    }


}