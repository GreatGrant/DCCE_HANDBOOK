package com.gralliams.dccehandbook.ui.curriculum

import android.content.res.Configuration
import android.os.Bundle
import android.view.*
import android.webkit.WebSettings
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.databinding.FragmentCurriculumBinding

class CurriculumFragment : Fragment() {
    private lateinit var binding: FragmentCurriculumBinding
    private lateinit var viewModel: CurriculumViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        this.binding = FragmentCurriculumBinding.inflate(inflater, container, false)
            viewModel = ViewModelProvider(this)[CurriculumViewModel::class.java]
        binding.webCurriculum.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;

        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(binding.webCurriculum.settings, true);
        }

        viewModel.text.observe(viewLifecycleOwner) { link ->
            this.binding.webCurriculum.loadUrl(link)
        }

        return this.binding.root
    }

}