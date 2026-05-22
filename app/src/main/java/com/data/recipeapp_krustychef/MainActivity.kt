package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()


        binding.btnLogin.setOnClickListener {
            val email = binding.edtusernme.text.toString().trim()
            val password = binding.edtpword.text.toString().trim()

            if (email.isEmpty() && password.isNotEmpty()) {
                Toast.makeText(
                    baseContext, "Please enter email.", Toast.LENGTH_SHORT
                ).show()
            } else if (email.isNotEmpty() && password.isEmpty()) {

                Toast.makeText(
                    baseContext, "Please enter password.", Toast.LENGTH_SHORT
                ).show()
            } else if (email.isEmpty() && password.isEmpty()) {

                Toast.makeText(
                    baseContext, "Please enter email and password.", Toast.LENGTH_SHORT
                ).show()
            } else {

                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val intent = Intent(this, HomeScreen::class.java)
                            startActivity(intent)

                            Toast.makeText(
                                baseContext, "Login successful.", Toast.LENGTH_SHORT
                            ).show()
                        } else {

                            Toast.makeText(
                                baseContext, "Failed to log in! Please create an account.",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            }
        }

        binding.txtView4.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

    }
}







