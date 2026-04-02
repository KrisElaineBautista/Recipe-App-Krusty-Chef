package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.ActivityPancitScreenBinding

class Pancit_Screen : AppCompatActivity() {

    private lateinit var binding: ActivityPancitScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPancitScreenBinding.inflate((layoutInflater))
        setContentView(binding.root)
        binding.backbtn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
        val ingredients = binding.textView6.setText("""
    1/2 lb pancit noodles
    2 tablespoons cooking oil
    3 cloves garlic, minced
    1 onion, sliced
    1/2 lb chicken breast, sliced thinly
    1/2 lb pork, thinly sliced
    1 cup shrimp, peeled and deveined
    1 cup mixed vegetables (carrots, cabbage, snow peas, bell peppers, etc.), sliced thinly
    3 tablespoons soy sauce
    2 tablespoons oyster sauce
    Salt and pepper to taste
    4 cups chicken broth or water
""".trimIndent())
        val procedure  = binding.textView8.setText( """
    1. In a pot, boil water and cook pancit noodles according to package instructions. Drain and set aside.
    2. In a large pan or wok, heat cooking oil over medium heat.
    3. Sauté minced garlic and sliced onion until fragrant and translucent.
    4. Add sliced chicken breast and pork. Stir-fry until meat is cooked through.
    5. Add shrimp and cook until they turn pink and opaque.
    6. Stir in mixed vegetables and cook until slightly tender yet still crisp.
    7. Season with soy sauce, oyster sauce, salt, and pepper. Adjust seasoning according to taste.
    8. Add cooked pancit noodles to the pan and toss until well combined with the meat and vegetables.
    9. Pour chicken broth or water into the pan and allow the pancit to simmer until the liquid is absorbed and the noodles are fully cooked.
    10. Serve hot and enjoy!
""".trimIndent()
        )
        binding.textView6.setMovementMethod(ScrollingMovementMethod())
        binding.textView8.setMovementMethod(ScrollingMovementMethod())


    }
}

