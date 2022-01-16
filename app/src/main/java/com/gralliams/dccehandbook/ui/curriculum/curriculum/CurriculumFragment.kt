package com.gralliams.dccehandbook.ui.curriculum.curriculum

import android.content.res.Configuration
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.gralliams.dccehandbook.databinding.FragmentCurriculumBinding
import com.gralliams.dccehandbook.databinding.FragmentPhilosophyBinding

class CurriculumFragment : Fragment() {

    private var _binding: FragmentCurriculumBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCurriculumBinding.inflate(inflater, container, false)

        if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
            when (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
                Configuration.UI_MODE_NIGHT_YES -> {
                    WebSettingsCompat.setForceDark(binding.webCurriculum.settings,
                        WebSettingsCompat.FORCE_DARK_ON
                    )
                }
                Configuration.UI_MODE_NIGHT_NO, Configuration.UI_MODE_NIGHT_UNDEFINED -> {
                    WebSettingsCompat.setForceDark(binding.webCurriculum.settings,
                        WebSettingsCompat.FORCE_DARK_OFF
                    )
                }
                else -> {
                    //
                }
            }
        }

        binding.webCurriculum.loadUrl("file:///android_asset/curriculum.html")
        return binding.root
    }





//   m

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}