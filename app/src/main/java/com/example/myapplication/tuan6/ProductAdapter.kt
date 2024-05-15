package com.example.myapplication.tuan6

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R
import com.squareup.picasso.Picasso

class ProductAdapter(val ls : ArrayList<Product>, val context : Context): BaseAdapter() {
    override fun getCount(): Int {
        return ls.size;
    }

    override fun getItem(position: Int): Any {
        return ls[position];
    }

    override fun getItemId(position: Int): Long {
        return position.toLong();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var cvv = convertView
        val vax: ViewAx
        if (cvv == null){
            vax = ViewAx()
            cvv = LayoutInflater.from(context).inflate(R.layout.item_view_t6,  null)
            vax.imageView = cvv.findViewById(R.id.product_Image);
            vax.styleID = cvv.findViewById(R.id.product_styleID);
            vax.product_brand = cvv.findViewById(R.id.product_brand);
            vax.product_price = cvv.findViewById(R.id.product_price);
            vax.product_info = cvv.findViewById(R.id.product_info);
            //tao template
            cvv.tag = vax
        }
        else{
            vax = cvv.tag as ViewAx
        }

        val product : Product = ls[position];
        if (product!=null){
            Picasso.get().load(product.image).into(vax.imageView)
            vax.styleID!!.text = product.styleid;
            vax.product_brand!!.text = product.brand;
            vax.product_price!!.text = product.price.toString();
            vax.product_info!!.text = product.product_info;
        }

        return cvv;
    }

    internal inner class ViewAx{
        var imageView : ImageView ?= null;
        var styleID : TextView ?= null;
        var product_brand : TextView ?= null;
        var product_price : TextView ?= null;
        var product_info : TextView ?= null;
    }

}