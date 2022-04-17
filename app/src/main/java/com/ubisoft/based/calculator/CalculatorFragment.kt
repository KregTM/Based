package com.ubisoft.based.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.ubisoft.based.R

class CalculatorFragment: Fragment() {
    private val viewModel : CalculatorViewModel = CalculatorViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstNumber = view.findViewById<EditText>(R.id.firstNumberInput)
        val secondNumber = view.findViewById<EditText>(R.id.secondNumberInput)

        val buttonPlus = view.findViewById<Button>(R.id.buttonPlus)
        buttonPlus.setOnClickListener {
            val userFirstInput = firstNumber.text
        }

        val buttonMinus = view.findViewById<Button>(R.id.buttonMinus)
        buttonMinus.setOnClickListener {

        }
    }
}