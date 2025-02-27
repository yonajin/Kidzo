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
 * Use the [bahay_page.newInstance] factory method to
 * create an instance of this fragment.
 */
class bahay_page : Fragment() {

    private lateinit var color_button : ImageButton
    private lateinit var profile_button : ImageButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bahay_page, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        color_button = view.findViewById(R.id.clrs)
        color_button.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.navto_color_levels)
        }
        profile_button = view.findViewById(R.id.profbtn)
        profile_button.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_bahay_page_to_profile_Page)
        }
    }
}