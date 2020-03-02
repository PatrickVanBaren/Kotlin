package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private val mCalculator = Calc()
    private var mSumButton: Button? = null //var <- обязательно!
    private var mDiffButton:Button? = null
    private var mFirstNumber: EditText? = null
    private var mSecondNumber: EditText? = null
    private var mResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSumButton = findViewById(R.id.sum_button)
        mDiffButton = findViewById(R.id.diff_button)
        mResult = findViewById(R.id.text_view)
        mFirstNumber = findViewById(R.id.first_number_view)
        mSecondNumber = findViewById(R.id.second_number_view)

        mSumButton?.setOnClickListener {        //? <- Обязательно!
            mResult?.text = String.format(      //? <- Обязательно!
                Locale.US,
                "Result: %d",
                mCalculator.sum(getFirstNumber(), getSecondNumber())
            )
        }

        mDiffButton?.setOnClickListener({ v ->
            mResult?.setText(
                String.format(
                    Locale.US,
                    "Result: %d",
                    mCalculator.diff(getFirstNumber(), getSecondNumber())
                )
            )
        })
    }

    private fun getFirstNumber(): Int {
        return Integer.valueOf(mFirstNumber?.text.toString())
    }

    private fun getSecondNumber(): Int {
        return Integer.valueOf(mSecondNumber?.getText().toString())
    }
}
