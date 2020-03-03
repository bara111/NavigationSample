package com.foothill.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_homepage, container, false)

        view.findViewById<Button>(R.id.button_main_Dog).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainActivity_to_dogFragment)
        }
        view.findViewById<Button>(R.id.button_main_Cat).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainActivity_to_catFragment)
        }
        view.findViewById<Button>(R.id.button_main_Horse).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainActivity2_to_horseFragment)
        }
        return view
    }
}
