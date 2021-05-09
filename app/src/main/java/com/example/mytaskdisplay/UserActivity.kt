package com.example.mytaskdisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytaskdisplay.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = intent.getStringExtra("name")
        var phone = intent.getStringExtra("Phone")
        var country = intent.getStringExtra("country")
        var imageId = intent.getIntExtra("imageId",R.drawable.kotlin_logo)



        binding.nameProfile.text= name
        binding.namePhone.text = phone
        binding.nameCountry.text = country
        binding.profileImage.setImageResource(imageId)
    }
}