package com.gralliams.dccehandbook.ui.academic

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
import com.gralliams.dccehandbook.databinding.FragmentAcademicBinding

class AcademicFragment : Fragment(){
    private lateinit var binding: FragmentAcademicBinding
    private lateinit var viewModel: AcademicViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAcademicBinding.inflate(inflater, container, false)

        binding.webAcademic.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;

        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(binding.webAcademic.settings, true);
        }


        viewModel = ViewModelProvider(this)[AcademicViewModel::class.java]

        viewModel.url.observe(viewLifecycleOwner, Observer {
            binding.webAcademic.loadUrl(it)
        })
        return binding.root
    }

}