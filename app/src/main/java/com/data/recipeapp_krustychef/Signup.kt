package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()

        binding.btnSignup.setOnClickListener {
            val email = binding.edtusername.text.toString().trim()
            val password = binding.edtpassword.text.toString().trim()
            val confirmPassword = binding.edtcpassword.text.toString().trim()

            if (email.isEmpty() && password.isNotEmpty()) {
                Toast.makeText(
                    applicationContext, "Please enter email.", Toast.LENGTH_SHORT
                ).show()
            } else if (email.isNotEmpty() && password.isEmpty()) {
                Toast.makeText(
                    applicationContext, "Please enter password.", Toast.LENGTH_SHORT
                ).show()
            } else if (email.isEmpty() && password.isEmpty()) {
                Toast.makeText(
                    applicationContext, "Please enter email and password.", Toast.LENGTH_SHORT
                ).show()
            } else if (confirmPassword.isEmpty())  {
                Toast.makeText(
                    applicationContext, "Please confirm password.", Toast.LENGTH_SHORT
                ).show()
            } else if (password != confirmPassword) {
                Toast.makeText(
                    applicationContext, "Passwords do not match. Please try again.", Toast.LENGTH_SHORT
                ).show()
            } else {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            Toast.makeText(
                                applicationContext, "Sign up successful.", Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            Toast.makeText(
                                applicationContext, "Sign up failed. Please try again.", Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            }
        }

        binding.backbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.txtView4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
