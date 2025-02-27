package com.example.kidzo

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.example.kidzo.databinding.FragmentColorPopBinding

import androidx.cursoradapter.widget.SimpleCursorAdapter.ViewBinder
import androidx.fragment.app.FragmentContainerView

/**
 * A simple [Fragment] subclass.
 * Use the [Color_Pop.newInstance] factory method to
 * create an instance of this fragment.
 */
class Color_Pop : Fragment() {

    private var correctClicks = 0
    private var currentStage = 1
    private val totalStages = 4

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color__pop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buble1: ImageButton = view.findViewById(R.id.buble1)
        val buble2: ImageButton = view.findViewById(R.id.buble2)
        val buble3: ImageButton = view.findViewById(R.id.buble3)
        val buble4: ImageButton = view.findViewById(R.id.buble4)
        val buble5: ImageButton = view.findViewById(R.id.buble5)
        val buble6: ImageButton = view.findViewById(R.id.buble6)
        val buble7: ImageButton = view.findViewById(R.id.buble7)
        val buble8: ImageButton = view.findViewById(R.id.buble8)
        val buble9red: ImageButton = view.findViewById(R.id.buble9)
        val buble10red: ImageButton = view.findViewById(R.id.buble10)
        val buble11red: ImageButton = view.findViewById(R.id.buble11)





    }
}


