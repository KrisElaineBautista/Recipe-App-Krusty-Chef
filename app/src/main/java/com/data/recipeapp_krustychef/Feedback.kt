package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.ActivityFeedbackBinding

class Feedback : AppCompatActivity() {

    private lateinit var binding: ActivityFeedbackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedbackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

        binding.logoutbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.infobtn.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
        binding.sendbtn.setOnClickListener {
            val feedbackMessage = binding.edttxtfeedback.text.toString().trim()

            if (feedbackMessage.isNotEmpty()) {
                Toast.makeText(binding.root.context, "Feedback sent", Toast.LENGTH_SHORT).show()
                binding.edttxtfeedback.text.clear()
            } else {
                Toast.makeText(binding.root.context, "Please enter your feedback!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


