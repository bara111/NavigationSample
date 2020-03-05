package com.foothill.navigationsample.dog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.foothill.navigationsample.R
import com.foothill.navigationsample.databinding.FragmentDogBinding

class DogFragment : Fragment() {
    lateinit var binding: FragmentDogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_dog, container, false)
        binding.ButtonNext.setOnClickListener {
        }
        return binding.root
    }
}
