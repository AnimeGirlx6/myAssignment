package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    private lateinit var recycler_view : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        recycler_view = findViewById(R.id.recycler_view)

        val contactList = generateContactList(100)


        recycler_view.adapter = ContactAdapter(contactList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
//     initRecycleView()

    }

//    private fun initRecycleView(recycleView:RecyclerView)
//    {
//        recycleView = findViewById(R.id.recycler_view)
//        recycleView.layoutManager = LinearLayoutManager(this)
//        //contactAdapter = ContactAdapt()
//        //recyclerView.adapter = contactAdapter(contactList)
//    }

    private fun generateContactList(size: Int): List<ContactItems>
    {
        val list = ArrayList<ContactItems>()
        val simpleDateFormat = SimpleDateFormat("yyyy.MM.dd")
        val currentDateAndTime: String = simpleDateFormat.format(Date())
            for(i in 0 until size)
            {
                val drawable = when (i % 11)
                {
                    0 -> R.drawable.ic_becca
                    1 -> R.drawable.ic_cawo
                    2 -> R.drawable.ic_dad
                    3 -> R.drawable.ic_family_gc
                    4 -> R.drawable.ic_hoodo
                    5 -> R.drawable.ic_lil_bro
                    6 -> R.drawable.ic_mom
                    7 -> R.drawable.ic_salma
                    8 -> R.drawable.ic_soft_eng_class
                    9 -> R.drawable.ic_yusra
                    else -> R.drawable.ic_error
                }
                val item = ContactItems(drawable, "Contact $i", "Message Content",currentDateAndTime )
                list += item
            }
                 return list
    }
}