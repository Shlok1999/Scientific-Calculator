package com.shlok1999.example.scienteficcalculator

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.mozilla.javascript.Context.enter
import org.mozilla.javascript.Scriptable


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tV_0.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "0")

        }
        tV_1.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "1")

        }
        tV_2.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "2")

        }
        tV_3.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "3")

        }
        tV_4.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "4")

        }
        tV_5.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "5")

        }
        tV_6.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "6")

        }
        tV_7.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "7")

        }
        tV_8.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "8")

        }
        tV_9.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "9")

        }
        //Cancel Button
        Cancel.setOnClickListener(){
            tV_input.setText("")
            tV_output.setText("")
        }

        tV_point.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ ".")

        }
        tV_plus.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "+")

        }
        tV_minus.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "-")
        }
        tV_mul.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "*")

        }
        divide.setOnClickListener(){
            val data=tV_input.text.toString()
            tV_input.setText(data+ "/")

        }
        tV_equals.setOnClickListener(){
            var data=tV_input.text.toString()
//            Toast.makeText(this, ""+data, Toast.LENGTH_SHORT).show()
            data=data.replace("*","*")
            data=data.replace("%","/100")
            data=data.replace("/","/")

            val rhino=org.mozilla.javascript.Context.enter()
            rhino.optimizationLevel=-1

            var finalResult=""
            val scriptable=rhino.initStandardObjects()
            finalResult=rhino.evaluateString(scriptable, data,"Javascript",1,null).toString()

            tV_output.text = finalResult









        }




    }


}


