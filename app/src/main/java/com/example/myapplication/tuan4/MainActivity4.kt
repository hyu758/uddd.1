package com.example.myapplication.tuan4

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class MainActivity4 : AppCompatActivity() {
    var context : Context = this;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btnGet = findViewById<Button>(R.id.btnGetData);
        var txtView = findViewById<TextView>(R.id.txtView4);
        val fn1 = VolleyFn1()
        btnGet!!.setOnClickListener{
            fn1.getAllData(context, txtView!!);
        }
    }
}