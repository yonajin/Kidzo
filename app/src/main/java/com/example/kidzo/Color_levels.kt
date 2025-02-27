package com.example.kidzo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 * Use the [Color_levels.newInstance] factory method to
 * create an instance of this fragment.
 */
class Color_levels : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color_levels, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backButton: ImageButton = view.findViewById(R.id.bkbutton)
        val level1Button: ImageButton = view.findViewById(R.id.level1btn)


        backButton.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
        level1Button.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_color_levels_to_color_Pop)
        }
    }
}