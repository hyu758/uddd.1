package com.example.myapplication.tuan4

import android.content.Context
import android.widget.TextView
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class VolleyFn1 {
    var strJson = ""
    //ham doc du lieu tu API
    fun getAllData(context: Context, textView: TextView){
        //Tao request
        val queue = Volley.newRequestQueue(context);
        val url = "http://localhost:8080/test/getData.php";

        //Goi request
        val request = JsonArrayRequest(url,{response->
            for (i in 0 until response.length()){
                try {
                    val person = response.getJSONObject(i);
                    val id = person.getString("id");
                    val first_name = person.getString("firstname");
                    val last_name = person.getString("lastname");
                    val name = first_name + last_name;
                    val email = person.getString("email");
                    strJson+="Id: $id\n";
                    strJson+="Name: $name\n";
                    strJson+="Email: $email\n";
                }
                catch (e: Exception){
                    e.printStackTrace();
                }
            }
            textView.setText(strJson);
        }, {error -> textView.text = error.message});
        queue.add(request);

    }
}