package com.example.assignment21

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout


class AnimalsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_animals, container, false)
        val button: Button = view.findViewById(R.id.resbtnAnimals)
        var flag: String = "Select Color"
        val spinner: Spinner = view.findViewById(R.id.spinnerAnimals)
        val spinnerOptions = arrayOf(
            "Select Animal",
            "Alligator",
            "Bird",
            "Butterfly",
            "Camel",
            "Cat",
            "Chicken",
            "Cow",
            "Dog",
            "Duck",
            "Elephant",
            "Fish",
            "Horse",
            "Lion",
            "Tiger"
        )
        spinner.adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item,
            spinnerOptions
        )
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
            if (flag == "Alligator") {
                constraintLayout.setBackgroundResource(R.drawable.alligator)
            }
            if (flag == "Bird") {
                constraintLayout.setBackgroundResource(R.drawable.bird)
            }
            if (flag == "Butterfly") {
                constraintLayout.setBackgroundResource(R.drawable.butterfly)
            }
            if (flag == "Camel") {
                constraintLayout.setBackgroundResource(R.drawable.camel)
            }
            if (flag == "Cat") {
                constraintLayout.setBackgroundResource(R.drawable.cat)
            }
            if (flag == "Chicken") {
                constraintLayout.setBackgroundResource(R.drawable.chicken)
            }
            if (flag == "Cow") {
                constraintLayout.setBackgroundResource(R.drawable.cow)
            }
            if (flag == "Dog") {
                constraintLayout.setBackgroundResource(R.drawable.dog)
            }
            if (flag == "Duck") {
                constraintLayout.setBackgroundResource(R.drawable.duck)
            }
            if (flag == "Elephant") {
                constraintLayout.setBackgroundResource(R.drawable.elephant)
            }
            if (flag == "Fish") {
                constraintLayout.setBackgroundResource(R.drawable.fish)
            }
            if (flag == "Horse") {
                constraintLayout.setBackgroundResource(R.drawable.horse)
            }
            if (flag == "Lion") {
                constraintLayout.setBackgroundResource(R.drawable.lion)
            }
            if (flag == "Tiger") {
                constraintLayout.setBackgroundResource(R.drawable.tiger)
            }


        }
        return view
    }
}