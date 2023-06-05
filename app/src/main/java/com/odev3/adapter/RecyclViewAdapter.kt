package com.odev3.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.odev3.R
import com.odev3.model.Experience

class RecyclViewAdapter(private val mList: List<Experience>)
    : RecyclerView.Adapter<RecyclViewAdapter.ViewHolder>() {
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val name = itemView.findViewById<TextView>(R.id.txtName)
        val positionAtCompany = itemView.findViewById<TextView>(R.id.txtposition)
        val softwareLanguage =itemView.findViewById<TextView>(R.id.txtSoftwareLang)
        val duration = itemView.findViewById<TextView>(R.id.txtduration)
        val imgCompany = itemView.findViewById<ImageView>(R.id.imgCompany)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d("test","onCreateViewHolder")
        val view = LayoutInflater.from(parent.context) .inflate(R.layout.custom_list_item, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        Log.d("test","listSize")
        return  mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("test",position.toString())
        holder.name.text = mList[position].name
        holder.positionAtCompany.text = mList[position].position
        holder.softwareLanguage.text =mList[position].softwareLanguage
        holder.duration.text = mList[position].duration

        Glide.with(holder.itemView.context).load(mList[position].logo).into(holder.imgCompany)

    }


}