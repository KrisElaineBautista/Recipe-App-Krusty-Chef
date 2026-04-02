package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.data.recipeapp_krustychef.databinding.ActivityBulaloScreenBinding

private lateinit var binding: ActivityBulaloScreenBinding
class Bulalo_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBulaloScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backbtn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
        val ingredients = binding.textView6.setText(
            """
    2 lbs beef shank (bulalo), cut into serving pieces
    1 large onion, quartered
    3 cloves garlic, crushed
    1 medium-sized potato, peeled and quartered
    2 ears corn on the cob, cut into thirds
    1 medium-sized cabbage, quartered
    2 stalks green onions, chopped
    Salt and pepper to taste
""".trimIndent())
        val procedure  = binding.textView8.setText( """
    1. In a large pot, add the beef shank pieces and cover with water. Bring to a boil and skim off any scum that rises to the surface.
    2. Add the quartered onion and crushed garlic to the pot. Simmer over medium-low heat for about 2-3 hours or until the beef is tender.
    3. Once the beef is tender, add the quartered potato and cook for another 10 minutes.
    4. Add the corn on the cob pieces to the pot and cook for an additional 5 minutes.
    5. Season with salt and pepper to taste.
    6. Add the quartered cabbage to the pot and cook until the cabbage is tender but still slightly crisp, about 3-5 minutes.
    7. Remove the pot from the heat and transfer the bulalo to a serving bowl.
    8. Garnish with chopped green onions.
    9. Serve hot and enjoy your comforting bulalo soup!
""".trimIndent())
        binding.textView6.setMovementMethod(ScrollingMovementMethod())
        binding.textView8.setMovementMethod(ScrollingMovementMethod())
    }

}
