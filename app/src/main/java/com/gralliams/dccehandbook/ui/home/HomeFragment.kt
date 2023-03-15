package com.gralliams.dccehandbook.ui.home

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.gralliams.dccehandbook.Syllabus
import com.gralliams.dccehandbook.adapters.SyllabusAdapter
import com.gralliams.dccehandbook.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.recyclerSyllabus.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerSyllabus.adapter  = SyllabusAdapter(requireContext(), Syllabus.syallusList)
        return root
    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        inflater.inflate(R.menu.menu_main, menu)
//    }





//   m

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}