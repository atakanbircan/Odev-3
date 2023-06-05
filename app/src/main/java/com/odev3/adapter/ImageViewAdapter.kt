package com.odev3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.odev3.R

class ImageViewAdapter (private val imageist:List<Int>)
: RecyclerView.Adapter<ImageViewAdapter.ViewHolderImage>(){


    class ViewHolderImage(ItemView: View):RecyclerView.ViewHolder(ItemView) {
        val galeri_image=itemView.findViewById<ImageView>(R.id.galeri_image)
    }



    override fun onBindViewHolder(holder: ImageViewAdapter.ViewHolderImage, position: Int) {
        holder.galeri_image.setImageResource(imageist[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewAdapter.ViewHolderImage {
        val view = LayoutInflater.from(parent.context) .inflate(R.layout.image_list, parent, false)
        return ImageViewAdapter.ViewHolderImage(view)
    }

    override fun getItemCount(): Int {
        return imageist.size
    }


}
