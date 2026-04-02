package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.ActivitySisigScreenBinding

class Sisig_Screen : AppCompatActivity() {

    private lateinit var  binding: ActivitySisigScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySisigScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backbtn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
        val ingredients = binding.textView6.setText(
            """
            1 lb pork belly, boiled and grilled then finely chopped
            1/4 cup pig's brain (optional), boiled and mashed
            1 large onion, minced
            3 cloves garlic, minced
            3 to 5 pieces red chili (siling labuyo), chopped
            3 tablespoons soy sauce
            3 tablespoons calamansi juice or lemon juice
            2 tablespoons butter
            Salt and pepper to taste
            2 pieces green chili (siling pansigang), chopped (optional)
            1 tablespoon mayonnaise (optional)
            1 raw egg (optional)
            Chicharon (pork cracklings), crushed (optional)
        """.trimIndent())
        val procedure  = binding.textView8.setText( """
            1. Grill the boiled pork belly until crispy, then finely chop it into small pieces.
            2. In a pan, melt butter and sauté the minced onion until translucent.
            3. Add the minced garlic and chopped red chili. Sauté until aromatic.
            4. Add the chopped pork belly to the pan. Stir and cook until lightly browned.
            5. If using pig's brain, add it to the pan and mix well with the pork.
            6. Pour in the soy sauce and calamansi juice. Stir and cook for a few minutes.
            7. Season with salt and pepper according to taste. Add chopped green chili if desired for extra spice.
            8. Optional: Crack a raw egg into the pan and mix well, allowing it to cook with the pork.
            9. Transfer the cooked sisig to a sizzling plate or serving dish.
            10. Optional: Top the sisig with crushed chicharon for added crunchiness and texture.
            11. Serve hot with a side of mayonnaise for dipping or drizzling over the sisig, and enjoy!
        """.trimIndent()
        )
        binding.textView6.setMovementMethod(ScrollingMovementMethod())
        binding.textView8.setMovementMethod(ScrollingMovementMethod())
    }

}




