package com.odev3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.odev3.R
import com.odev3.model.Hoby

class RecyclerViewHobiesAdapter(private val hobyList:List<Hoby>)
    :RecyclerView.Adapter<RecyclerViewHobiesAdapter.ViewHolder>(){
    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView) {

        val name= itemView.findViewById<TextView>(R.id.txtHobbyName)
        val text=itemView.findViewById<TextView>(R.id.txtAciklama)
        val imgHobby=itemView.findViewById<ImageView>(R.id.imgHobby)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context) .inflate(R.layout.hoby_list_item, parent, false)
        return RecyclerViewHobiesAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobyList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text=hobyList[position].name
        holder.text.text=hobyList[position].text

        Glide.with(holder.itemView.context).load(hobyList[position].imges).into(holder.imgHobby)
    }
}
