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

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.recyclerSyllabus.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerSyllabus.adapter  = SyllabusAdapter(requireContext(), Syllabus.syallusList)
        return binding.root
    }
}