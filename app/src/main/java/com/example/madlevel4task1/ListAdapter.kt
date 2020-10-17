package com.example.madlevel4task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_activity.view.*

class ListAdapter (private val items: List<Item>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun databind(item_activity: Item) {
            itemView.tvName.text = item_activity.productName
            itemView.tvQuantity.text = item_activity.productQuantity.toString()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_activity, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ListAdapter.ViewHolder, position: Int) {
        holder.databind(items[position])
    }


}