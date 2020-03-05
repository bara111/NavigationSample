package com.foothill.navigationsample.cat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.foothill.navigationsample.R
import com.foothill.navigationsample.databinding.FragmentCatBinding

class CatFragment : Fragment() {
    lateinit var binding: FragmentCatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cat, container, false)
        binding.ButtonNext.setOnClickListener {
        }
        return binding.root
    }
}
