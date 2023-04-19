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


class AlphabetFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_alphabet, container, false)
        val button : Button = view.findViewById(R.id.resbtnABC)
        var flag : String = "Select Letter"
        val spinner2 : Spinner = view.findViewById(R.id.ABCspinner)
        val spinnerOptions = arrayOf("Select Letter","A","B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
        spinner2.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, spinnerOptions)
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
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
            if (flag == "A") {
                constraintLayout.setBackgroundResource(R.drawable.lettera)
            }

            if (flag == "B") {
                constraintLayout.setBackgroundResource(R.drawable.letterb)

            }
            if (flag == "C") {
                constraintLayout.setBackgroundResource(R.drawable.letterc)
            }
            if (flag == "D") {
                constraintLayout.setBackgroundResource(R.drawable.letterd)
            }
            if (flag == "E") {
                constraintLayout.setBackgroundResource(R.drawable.lettere)
            }
            if (flag == "F") {
                constraintLayout.setBackgroundResource(R.drawable.letterf)
            }
            if (flag == "G") {
                constraintLayout.setBackgroundResource(R.drawable.letterg)
            }
            if (flag == "H") {
                constraintLayout.setBackgroundResource(R.drawable.letterh)
            }
            if (flag == "I") {
                constraintLayout.setBackgroundResource(R.drawable.letteri)
            }
            if (flag == "J") {
                constraintLayout.setBackgroundResource(R.drawable.letterj)
            }
            if (flag == "K") {
                constraintLayout.setBackgroundResource(R.drawable.letterk)
            }
            if (flag == "L") {
                constraintLayout.setBackgroundResource(R.drawable.letterl)
            }
            if (flag == "M") {
                constraintLayout.setBackgroundResource(R.drawable.letterm)
            }
            if (flag == "N") {
                constraintLayout.setBackgroundResource(R.drawable.lettern)
            }
            if (flag == "O") {
                constraintLayout.setBackgroundResource(R.drawable.lettero)
            }
            if (flag == "P") {
                constraintLayout.setBackgroundResource(R.drawable.letterp)
            }
            if (flag == "Q") {
                constraintLayout.setBackgroundResource(R.drawable.letterq)
            }
            if (flag == "R") {
                constraintLayout.setBackgroundResource(R.drawable.letterr)
            }
            if (flag == "S") {
                constraintLayout.setBackgroundResource(R.drawable.letters)
            }
            if (flag == "T") {
                constraintLayout.setBackgroundResource(R.drawable.lettert)
            }
            if (flag == "U") {
                constraintLayout.setBackgroundResource(R.drawable.letteru)
            }
            if (flag == "V") {
                constraintLayout.setBackgroundResource(R.drawable.letterv)
            }
            if (flag == "W") {
                constraintLayout.setBackgroundResource(R.drawable.letterw)
            }
            if (flag == "X") {
                constraintLayout.setBackgroundResource(R.drawable.letterx)
            }
            if (flag == "Y") {
                constraintLayout.setBackgroundResource(R.drawable.lettery)
            }
            if (flag == "Z") {
                constraintLayout.setBackgroundResource(R.drawable.letterz)
            }

        }
        return view
    }
}