package com.odev3.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.odev3.R
import com.odev3.model.Experience

class ExperienceCustomAdapter(private val list:List<Experience>,private val context: Context):
    BaseAdapter() {

    lateinit var inflater: LayoutInflater
    init {
        inflater= LayoutInflater.from(context)
    }
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //val rootView = context.layoutInflater.inflate(R.layout.custom_list_item,null,true)
        var view = convertView

        view = inflater.inflate( R.layout.custom_list_item, null)

        //val rootView =
            //LayoutInflater.inflate( R.layout.custom_list_item, null)
        //    LayoutInflater.from(parent.context).inflate(R.layout.custom_list_item, parent, false)

        val name = view.findViewById<TextView>(R.id.txtName)
        val positionAtCompany = view.findViewById<TextView>(R.id.txtposition)
        val softwareLanguage = view.findViewById<TextView>(R.id.txtSoftwareLang)
        val duration = view.findViewById<TextView>(R.id.txtduration)
        val imgCompany = view.findViewById<ImageView>(R.id.imgCompany)

        val experience = list.get(position)
        name.text = experience.name
        positionAtCompany.text = experience.position
        softwareLanguage.text = experience.softwareLanguage
        duration.text = experience.duration

        Glide.with(view).load(experience.logo).into(imgCompany)


        //val currentItem = list[position]

        println(list.size)
        return view

        }
    }





