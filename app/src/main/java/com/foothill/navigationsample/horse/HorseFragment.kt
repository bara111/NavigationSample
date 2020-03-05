package com.foothill.navigationsample.horse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.foothill.navigationsample.R
import com.foothill.navigationsample.databinding.FragmentHorseBinding

class HorseFragment : Fragment() {
    lateinit var binding: FragmentHorseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_horse, container, false)
        binding.ButtonNext.setOnClickListener {
        }
        return binding.root
    }
}
