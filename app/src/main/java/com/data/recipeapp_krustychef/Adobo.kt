package com.data.recipeapp_krustychef

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.data.recipeapp_krustychef.databinding.AdoboBinding

class Adobo : AppCompatActivity() {

    private lateinit var binding: AdoboBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AdoboBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backbtn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
        binding.textView6.setText(
            """
            2 lbs pork belly
            2 tablespoons garlic
            5 dried bay leaves
            4 tablespoons vinegar
            1/2 cup soy sauce
            1 tablespoon peppercorn
            2 cups water
            Salt to taste
        """.trimIndent())

        binding.textView8.setText("""
            1. Combine the pork belly, soy sauce, and garlic then marinade for at least 1 hour
            2. Heat the pot and put-in the marinated pork belly then cook for a few minutes Pour remaining marinade including garlic.
            3. Add water, whole pepper corn, and dried bay leaves then bring to a boil. Simmer for 40 minutes to 1 hour
            4. Put-in the vinegar and simmer for 12 to 15 minutes
            5. Add salt to taste
            6. Serve hot. Share and enjoy!
        """.trimIndent()
        )
    }

}

