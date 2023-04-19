package com.example.assignment21

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment




class ColorsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_colors, container, false)
        val button : Button = view.findViewById(R.id.resbtn)
        var flag : String = "Select Color"
        val spinner : Spinner = view.findViewById(R.id.spinner)
        val spinnerOptions = arrayOf("Select Color","Red","Yellow", "Blue","Green","Pink","Orange","Black")
        spinner.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, spinnerOptions)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = spinnerOptions.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        button.setOnClickListener() { view ->
            val constraintLayout: ConstraintLayout = view.rootView.findViewById(R.id.constraint_layout)
            if(flag=="Red") {
                constraintLayout.setBackgroundResource(R.drawable.red)
                button.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
            }
            if(flag=="Yellow") {
                constraintLayout.setBackgroundResource(R.drawable.yellow)
                button.setBackgroundColor(Color.YELLOW)
            }
            if(flag=="Blue") {
                constraintLayout.setBackgroundResource(R.drawable.blue)
                button.setBackgroundColor(Color.BLUE)
            }
            if(flag=="Green") {
                constraintLayout.setBackgroundResource(R.drawable.green)
                button.setBackgroundColor(Color.GREEN)
            }
            if(flag=="Pink") {
                constraintLayout.setBackgroundResource(R.drawable.pink)
                view.setBackgroundColor(Color.parseColor("#FFC0CB"))
            }
            if(flag=="Orange") {
                constraintLayout.setBackgroundResource(R.drawable.oragne)
                button.setBackgroundColor(Color.parseColor("#FFA500"))
            }
            if(flag=="Black") {
                constraintLayout.setBackgroundResource(R.drawable.black)
                button.setBackgroundColor(Color.BLACK)
            }
        }

      return view
    }
}