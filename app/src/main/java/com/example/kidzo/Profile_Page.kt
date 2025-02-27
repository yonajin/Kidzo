package com.example.kidzo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 * Use the [Profile_Page.newInstance] factory method to
 * create an instance of this fragment.
 */
class Profile_Page : Fragment() {

    private lateinit var home_button : ImageButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile__page, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        home_button = view.findViewById(R.id.homebtn)
        home_button.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_profile_Page_to_bahay_page)
        }
    }
}