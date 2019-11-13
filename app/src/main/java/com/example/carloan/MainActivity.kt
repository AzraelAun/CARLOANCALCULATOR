package com.example.carloan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {

            val input1: String = txtCar.text.toString()
            val input2: String = txtDown.text.toString()
            val input3: String = txtLoan.text.toString()
            val input4: String = txtInterest.text.toString()
            val Carprice: Double = input1.toDouble()
            val Downp: Double = input2.toDouble()
            val Loan: Double = input3.toDouble()
            val InterestRate: Double = input4.toDouble()
            val carLoan: Double = Carprice - Downp
            val interest = carLoan * InterestRate * Loan
            val Monthly = (carLoan + interest) / Loan / 12


            txtOutput1.text = "%.2f".format(carLoan)
            txtOutput2.text = "%.2f".format(interest)
            txtOutput3.text = "%.2f".format(Monthly)


        }
    }
}