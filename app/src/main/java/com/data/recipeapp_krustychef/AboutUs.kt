package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.ActivityAboutUsBinding

class AboutUs : AppCompatActivity() {

    private lateinit var binding: ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
        binding.feedbackbtn.setOnClickListener {
            val intent = Intent(this,Feedback::class.java)
            startActivity(intent)
        }

    }
}