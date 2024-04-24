package com.example.myapplication.tuan4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.tuan3.T3Contact

class T4Adapter(val ls: ArrayList<T4Person>, val ct: Context): BaseAdapter() {
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
            cvv = LayoutInflater.from(ct).inflate(R.layout.itemview_w4,  null)
            vax.id = cvv.findViewById(R.id.idW4)
            vax.name = cvv.findViewById(R.id.nameW4)
            vax.email = cvv.findViewById(R.id.emailW4)

            //tao template
            cvv.tag = vax
        }
        else{
            vax = cvv.tag as ViewAx
        }
        vax.id!!.text = ls[position].id
        vax.name!!.text = ls[position].name
        vax.email!!.text = ls[position].email

        return cvv
    }
    //dinh nghia class cua item view
    internal inner class ViewAx{
        var id : TextView? = null;
        var name : TextView? = null;
        var email : TextView? = null;

    }

}