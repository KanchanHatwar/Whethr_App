package com.example.whethr_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var c: EditText=findViewById(R.id.etcelsius)
        var f: TextView =findViewById(R.id.et_f)
        var b1: Button=findViewById(R.id.btn_convert)
        var clear:Button=findViewById(R.id.btn_clear)

        b1.setOnClickListener()
        {
            val c1:Int = c.text.toString().toInt()
            val f1:Int = ((9/5)*c1)+32
           f.text = f1.toString()

        }
        // clear button
        clear.setOnClickListener(){

            c.setText("")
        }
    }
}