package com.example.myapplication.tuan3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class T3Adapter(val ls: ArrayList<T3Contact>, val ct: Context): BaseAdapter() {
    override fun getCount(): Int {
        return ls.size
    }

    override fun getItem(position: Int): Any {
        return ls[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        //tao view
        var cvv = convertView
        val vax: ViewAx
        if (cvv == null){
            vax = ViewAx()
            cvv = LayoutInflater.from(ct).inflate(R.layout.itemview,  null)
            vax.img = cvv.findViewById(R.id.t3ItemHinh)
            vax.name = cvv.findViewById(R.id.t3ItemTen)
            vax.age = cvv.findViewById(R.id.t3ItemTuoi)

            //tao template
            cvv.tag = vax
        }
        else{
            vax = cvv.tag as ViewAx
        }
        vax.img!!.setImageResource(ls[position].hinh!!)
        vax.name!!.text = ls[position].ten
        vax.age!!.text = ls[position].tuoi

        return cvv
    }
    //dinh nghia class cua item view
    internal inner class ViewAx{
        var img : ImageView? = null;
        var name : TextView? = null;
        var age : TextView? = null;

    }

}