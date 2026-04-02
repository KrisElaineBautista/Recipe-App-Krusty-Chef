package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.ActivityAddRecipeBinding

class AddRecipe : AppCompatActivity() {

    private lateinit var binding: ActivityAddRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addbtn1.setOnClickListener {
            val recipeText = binding.edtRecipe.text.toString()
            binding.displayName.text = recipeText
        }

        binding.addbtn2.setOnClickListener {
            val ingredientsText = binding.edtingredients.text.toString()
            binding.displayIngredients.text = ingredientsText
        }

        binding.addbtn3.setOnClickListener {
            val procedureText = binding.edtprocedure.text.toString()
            binding.displayProcedure.text = procedureText
        }

        binding.btnClear.setOnClickListener {
            clearAllFields()
        }

        binding.backbtn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        binding.btnSave.setOnClickListener {
            val recipe = binding.edtRecipe.text.toString()
            val ingredients = binding.edtingredients.text.toString()
            val instructions = binding.edtprocedure.text.toString()

            if (recipe.isBlank() || ingredients.isBlank() || instructions.isBlank()) {
                Toast.makeText(applicationContext, "Please complete all Required Information", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Recipe Saved!", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun clearAllFields() {
        binding.edtRecipe.text.clear()
        binding.edtingredients.text.clear()
        binding.edtprocedure.text.clear()
        binding.displayName.text = getString(R.string.addrecipe_recipename)
        binding.displayIngredients.text = getString(R.string.addrecipe_ingredientsv2)
        binding.displayProcedure.text = getString(R.string.addrecipe_procedurev2)
        showToast("All Fields Cleared")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
