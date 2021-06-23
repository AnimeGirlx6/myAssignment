package com.example.assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val contactList: List<ContactItems>): RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder
    {
        val itemveiw = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent,
        false)
        return ContactViewHolder(itemveiw)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int)
    {
        val currentItem = contactList[position]
        holder.imageview.setImageResource(currentItem.imageResource)
        holder.tex1.text = currentItem.text1
        holder.tex2.text = currentItem.text2
        holder.date.text = currentItem.date.toString()
    }

    override fun getItemCount()= contactList.size


    class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val imageview: ImageView = itemView.findViewById(R.id.profile)
        val tex1: TextView = itemView.findViewById(R.id.name)
        val tex2: TextView = itemView.findViewById(R.id.message)
        val date: TextView = itemView.findViewById(R.id.dateText)

    }


}