package com.gralliams.dccehandbook.ui.admission

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
import com.gralliams.dccehandbook.databinding.FragmentAdmissionBinding

class AdmissionFragment : Fragment() {

    private lateinit var mAdmisionViewModel: AdmissionViewModel
    private lateinit var binding: FragmentAdmissionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        mAdmisionViewModel =
            ViewModelProvider(this)[AdmissionViewModel::class.java]

        this.binding = FragmentAdmissionBinding.inflate(inflater, container, false)
        val root: View = this.binding.root

        binding.webAdmision.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;

        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(binding.webAdmision.settings, true);
        }


        mAdmisionViewModel.text.observe(viewLifecycleOwner, Observer {
            this.binding.webAdmision.loadUrl(it)
        })
        return root
    }

}