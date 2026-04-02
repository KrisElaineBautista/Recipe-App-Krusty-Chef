package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.ActivityLumpiaScreenBinding

class Lumpia_Screen : AppCompatActivity() {

    private lateinit var binding:ActivityLumpiaScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLumpiaScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backbtn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
    }
        val ingredients = binding.textView6.setText("""
    1 lb ground pork
    1 cup carrots, julienned
    1 cup cabbage, shredded
    1/2 cup green onions, chopped
    2 cloves garlic, minced
    1 onion, finely chopped
    1/4 cup soy sauce
    1 tablespoon oyster sauce
    1 teaspoon sesame oil
    1 teaspoon ground black pepper
    Lumpia wrappers
    Cooking oil, for frying
    Sweet chili sauce, for dipping
""".trimIndent())
        val procedure  = binding.textView8.setText("""
    1. In a large bowl, combine ground pork, carrots, cabbage, green onions, garlic, onion, soy sauce, oyster sauce, sesame oil, and ground black pepper. Mix until well combined.
    2. Take a lumpia wrapper and place a spoonful of the pork mixture onto the center of the wrapper.
    3. Fold the bottom edge of the wrapper over the filling, then fold the sides inward, and roll tightly to enclose the filling completely.
    4. Moisten the top edge of the wrapper with water to seal the lumpia.
    5. Repeat the process with the remaining wrappers and filling.
    6. In a deep pan or skillet, heat cooking oil over medium heat.
    7. Fry the lumpia in batches until golden brown and crispy, about 3-4 minutes per side.
    8. Remove the fried lumpia from the oil and drain on paper towels to remove excess oil.
    9. Serve hot with sweet chili sauce for dipping.
    10. Enjoy your delicious lumpia!
""".trimIndent()
        )
        binding.textView6.setMovementMethod(ScrollingMovementMethod())
        binding.textView8.setMovementMethod(ScrollingMovementMethod())
    }
}
