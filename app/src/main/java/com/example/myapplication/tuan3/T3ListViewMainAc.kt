package com.example.myapplication.tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class T3ListViewMainAc : AppCompatActivity() {
    var adt : T3Adapter ?= null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_t3_list_view_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var lv = findViewById<ListView>(R.id.t3ListView);
        ls.add(T3Contact("Nguyen Van A", "15", R.drawable.android))
        ls.add(T3Contact("Nguyen Van DELL", "32", R.drawable.dell))
        ls.add(T3Contact("Lmao Lmao", "17", R.drawable.facebook))
        ls.add(T3Contact("Bruh Bruh", "20", R.drawable.apple))
        ls.add(T3Contact("Brrrrr", "25", R.drawable.blogger))
        ls.add(T3Contact("ZZAXXZZX", "15", R.drawable.chrome))
        ls.add(T3Contact("Alime", "35", R.drawable.hancock))

        adt = T3Adapter(ls, this)
        lv!!.adapter = adt

    }
}