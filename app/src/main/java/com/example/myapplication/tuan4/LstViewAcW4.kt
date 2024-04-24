package com.example.myapplication.tuan4

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.example.myapplication.R

class LstViewAcW4 : AppCompatActivity() {
    var context : Context = this
    var adt : T4Adapter ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lst_view_ac_w4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //khai bao
        val queue = Volley.newRequestQueue(context);
        val url = "https://hungnttg.github.io/array_json_new.json";
        var lst = ArrayList<T4Person>()
        //Goi request
        val request = JsonArrayRequest(url,{response->
            for (i in 0 until response.length()){
                try {
                    val person = response.getJSONObject(i);
                    val id = person.getString("id");
                    val name = person.getString("name");
                    val email = person.getString("email");
                    lst.add(T4Person(id, name, email));
                }
                catch (e: Exception){
                    e.printStackTrace();
                }
            }
        }, {error -> Log.w("Loi", error.message.toString())});
        queue.add(request);
        var lv4 = findViewById<ListView>(R.id.lstViewW4);
        var btnView = findViewById<Button>(R.id.btnnnnn);
        adt = T4Adapter(lst, this);
        btnView.setOnClickListener{
            lv4!!.adapter = adt;
        }

    }
}