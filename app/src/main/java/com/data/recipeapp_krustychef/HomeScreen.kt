package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.ActivityHomeScreenBinding

class HomeScreen : AppCompatActivity() {

    private lateinit var binding: ActivityHomeScreenBinding
    private val allRecipes = mutableListOf<Pair<String, Triple<TextView, ImageView, Button>>>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
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

        binding.addbtn.setOnClickListener {
            val intent = Intent(this, AddRecipe::class.java)
            startActivity(intent)
        }

        binding.btnview1.setOnClickListener {
            val intent = Intent(this, Adobo::class.java)
            startActivity(intent)
        }
        binding.btnview2.setOnClickListener {
            val intent = Intent(this, Sisig_Screen::class.java)
            startActivity(intent)
        }

        binding.btnview3.setOnClickListener {
            val intent = Intent(this, Pancit_Screen::class.java)
            startActivity(intent)
        }

        binding.btnview4.setOnClickListener {
            val intent = Intent(this, Lumpia_Screen::class.java)
            startActivity(intent)
        }
        binding.btnview5.setOnClickListener {
            val intent = Intent(this, Bulalo_Screen::class.java)
            startActivity(intent)
        }

        allRecipes.apply {
            add("Pork Adobo" to Triple(binding.txtname1, binding.foodimg1, binding.btnview1))
            add("Pork Sisig" to Triple(binding.txtname2, binding.foodimg2, binding.btnview2))
            add("Pancit" to Triple(binding.txtname3, binding.foodimg3, binding.btnview3))
            add("Lumpia" to Triple(binding.txtname4, binding.foodimg4, binding.btnview4))
            add("Bulalo" to Triple(binding.txtname5, binding.foodimg5, binding.btnview5))
        }

        binding.edtSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                filterRecipes(s.toString())
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun filterRecipes(query: String) {
        allRecipes.forEach { (recipeName, views) ->
            val (nameView, imageView, btnView) = views
            if (recipeName.contains(query, ignoreCase = true)) {

                nameView.visibility = View.VISIBLE
                imageView.visibility = View.VISIBLE
                btnView.visibility = View.VISIBLE
            } else {

                nameView.visibility = View.GONE
                imageView.visibility = View.GONE
                btnView.visibility = View.GONE
            }
        }
    }

}












