package com.romakumari.relativenumberactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var tvnumber : TextView? =null
    private var btnplus : Button? =null
    private var btnminus : Button?= null
    private var btndiv : Button?= null
    private var btnmultiply: Button?= null
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvnumber =findViewById(R.id.tvnumber)
        btnplus= findViewById(R.id.btnplus)
        btnminus=findViewById(R.id.btnminus)
        btndiv=findViewById(R.id.btndiv)
        btnmultiply=findViewById(R.id.btnmultiply)

        btnplus?.setOnClickListener {
            number +=2
            tvnumber?.text = number.toString()
        }
        btnminus?.setOnClickListener {
            number -=2
            tvnumber?.text = number.toString()
        }
        btndiv?.setOnClickListener {
            number/=2
            tvnumber?.text = number.toString()
        }
        btnmultiply?.setOnClickListener {
            number*=2
            tvnumber?.text = number.toString()


        }

    }
}