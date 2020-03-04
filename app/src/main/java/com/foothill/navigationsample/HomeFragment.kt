package com.foothill.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.foothill.navigationsample.databinding.FragmentHomepageBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomepageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_homepage, null, false)
        binding.buttonMainDog.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_mainActivity_to_dogFragment)
        }
        binding.buttonMainCat.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_mainActivity_to_catFragment)
        }
        binding.buttonMainHorse.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_mainActivity2_to_horseFragment)
        }
        return binding.root
    }
}
