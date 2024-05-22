package com.example.myapplication.tuan6

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R
import com.squareup.picasso.Picasso

class Tuan6DetailAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan6_detail)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        val product = intent.getSerializableExtra("PRODUCT") as Product

        var img = findViewById<ImageView>(R.id.product_Image)
        var style_id = findViewById<TextView>(R.id.product_styleID)
        var brand = findViewById<TextView>(R.id.product_brand)
        var info = findViewById<TextView>(R.id.product_info)
        var price = findViewById<TextView>(R.id.product_price)

        if (product!=null){
            //Hien thi anh
            Picasso.get().load(product.image).into(img);
            //Hien thi text
            style_id.text = "Style ID: ${product.styleid}"
            brand.text = "Brand: ${product.brand}"
            info.text = "Info: ${product.product_info}"
            price.text = "Price: ${product.price.toString()}"
        }
    }
}