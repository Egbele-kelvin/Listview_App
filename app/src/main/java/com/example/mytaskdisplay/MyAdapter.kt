package com.example.mytaskdisplay

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>): ArrayAdapter<User>(context,
                R.layout.item_list,arrayList)        {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var inflater : LayoutInflater = LayoutInflater.from(context)
        var view : View = inflater.inflate(R.layout.item_list,null)

        var imageView : ImageView = view.findViewById(R.id.profile_pic)
        var userName: TextView = view.findViewById(R.id.person_name)
        var lastMessage: TextView = view.findViewById(R.id.last_message)
        var lastMsgTime : TextView = view.findViewById(R.id.last_message_time)

        imageView.setImageResource(arrayList[position].imageId)
        userName.text= arrayList[position].name
        lastMessage.text = arrayList[position].lastMessage
        lastMsgTime.text = arrayList[position].lastMessageTime



        return view
    }

}