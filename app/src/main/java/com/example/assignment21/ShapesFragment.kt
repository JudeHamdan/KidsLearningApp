package com.example.assignment21

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


class ShapesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_shapes, container, false)
        val button : Button = view.findViewById(R.id.resbtnShapes)
        var flag : String = "Select Color"
        val spinner : Spinner = view.findViewById(R.id.ABCspinner)
        val spinnerOptions = arrayOf("Select Shape","Triangle","Square","Circle","Rectangle","Heart","Star")
        spinner.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, spinnerOptions)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = spinnerOptions.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        button.setOnClickListener() { view ->
            val constraintLayout: ConstraintLayout =
                view.rootView.findViewById(R.id.constraint_layout)
            if (flag == "Triangle") {
                constraintLayout.setBackgroundResource(R.drawable.triangle)
            }
            if (flag == "Rectangle") {
                constraintLayout.setBackgroundResource(R.drawable.rectangle)
            }
            if (flag == "Square") {
                constraintLayout.setBackgroundResource(R.drawable.square)
            }
            if (flag == "Circle") {
                constraintLayout.setBackgroundResource(R.drawable.circle)
            }
            if (flag == "Heart") {
                constraintLayout.setBackgroundResource(R.drawable.heart)
            }
            if (flag == "Star") {
                constraintLayout.setBackgroundResource(R.drawable.star)
            }

        }

        return view
    }
}