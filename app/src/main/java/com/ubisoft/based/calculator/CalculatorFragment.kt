package com.ubisoft.based.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
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
        val resultText = view.findViewById<TextView>(R.id.textView)


        val buttonPlus = view.findViewById<Button>(R.id.buttonPlus)
        buttonPlus.setOnClickListener {
            try {
                val ravno = viewModel.plus()
                resultText.text = ravno.toString()
            } catch (error: Exception) {
                resultText.text = error.message
            }
        }

        val buttonMinus = view.findViewById<Button>(R.id.buttonMinus)
        buttonMinus.setOnClickListener {
            try {
                val ravno = viewModel.minus()
                resultText.text = ravno.toString()
            } catch(error: Exception) {
                resultText.text = error.message
            }
        }

        val buttonMultiply = view.findViewById<Button>(R.id.buttonMultiply)
        buttonMultiply.setOnClickListener {
            try {
                val ravno = viewModel.multiply()
                resultText.text = ravno.toString()
            } catch(error: Exception) {
                resultText.text = error.message
            }
        }

        val buttonDivide = view.findViewById<Button>(R.id.buttonDivide)
        buttonDivide.setOnClickListener {
            try {
                val ravno = viewModel.divide()
                resultText.text = ravno.toString()
            } catch(error: Exception) {
                resultText.text = error.message
            }
        }


        firstNumber.addTextChangedListener { fieldValue ->
            viewModel.refreshFirst(fieldValue.toString())
        }

        secondNumber.addTextChangedListener { fieldValue ->
            viewModel.refreshFirst(fieldValue.toString())
        }
    }
}