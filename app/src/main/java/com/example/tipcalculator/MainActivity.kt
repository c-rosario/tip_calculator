package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etBaseAmt: EditText
    private lateinit var sbTip: SeekBar
    private lateinit var tvTipPercent: TextView
    private lateinit var tvTipAmt: TextView
    private lateinit var tvTotalAmt: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etBaseAmt = findViewById(R.id.etBaseAmt)
        sbTip = findViewById(R.id.sbTipPercent)
        tvTipPercent = findViewById(R.id.tvTipPercent)
        tvTipAmt = findViewById(R.id.tvTipAmt)
        tvTotalAmt = findViewById(R.id.tvTotal)

        sbTip.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                TODO("Not yet implemented")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }
        }
    }
}