package com.example.mytaskdisplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytaskdisplay.databinding.ActivityDashboardActvityBinding

class DashboardActvity : AppCompatActivity() {
    private lateinit var binding : ActivityDashboardActvityBinding
    private lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardActvityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val imageId = intArrayOf(

            R.drawable.flutter_task,   R.drawable.node_task ,   R.drawable.github_task,
            R.drawable.php_logo, R.drawable.javascript_logo, R.drawable.kotlin_logo,R.drawable.ui_ux,R.drawable.python
        )


        val name = arrayOf(

            "FLUTTER",
            "CODE WARS",
            "LINUX SERVER",
            "PHP",
            "JAVASCRIPT",
            "KOTLIN",
            "UI/UX",
            "PYTHON"
        )


        val lastMessage = arrayOf(

            "Submit on time","Submit on time","Submit on time","Submit on time","Submit on time","Submit on time","Submit on time",
            "Submit on time", "Submit on time"
        )

        val lastMsgTime = arrayOf(

            "7:30pm","7:30pm","7:30pm","7:30pm","7:30pm","7:30pm","7:30pm","7:30pm"
        )

        val phoneNumber = arrayOf(

            "08185666748",  "08185666748",  "08185666748",  "08185666748",  "08185666748",  "08185666748",
            "08185666748","08185666748"
        )

        val country = arrayOf(
            "Rivers State", "Lagos","Enugu", "Abuja","Calabar",  "Kogi", "Jos","Kano"
        )

        userArrayList = ArrayList()

        for ( i in name.indices){
            val user = User(name[i],lastMessage[i],lastMsgTime[i],phoneNumber[i],country[i],imageId[i])
            userArrayList.add(user)

        }

        binding.listView.isClickable = true
        binding.listView.adapter = MyAdapter(this,userArrayList)
        binding.listView.setOnItemClickListener { parent, view, position, id ->

            val name =name[position]
            val phoneNumber = phoneNumber[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent (this, UserActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("phone",phoneNumber)
            i.putExtra("County", country)
            i.putExtra("imageId", imageId)
            startActivity(i)

        }

    }



}