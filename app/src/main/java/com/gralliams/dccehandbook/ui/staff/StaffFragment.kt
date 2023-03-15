package com.gralliams.dccehandbook.ui.staff

import android.content.res.Configuration
import android.os.Bundle
import android.view.*
import android.webkit.WebSettings
import androidx.fragment.app.Fragment
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.databinding.*

class StaffFragment : Fragment() {

    private var _binding: FragmentStaffBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentStaffBinding.inflate(inflater, container, false)

        val webView =  binding.webStaff
        webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK;
        if(WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(webView.settings, true);
        }


        webView.loadUrl("file:///android_asset/staff.html")
        return binding.root
    }


}