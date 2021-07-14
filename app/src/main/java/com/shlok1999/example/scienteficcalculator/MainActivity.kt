package com.shlok1999.example.scienteficcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_equals.setOnClickListener {
            solve()
        }
    }

    private fun solve() {
        Toast.makeText(this, "Solution started",Toast.LENGTH_SHORT).show()
    }
}