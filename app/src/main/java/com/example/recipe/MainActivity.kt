package com.example.recipe

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recipe.ui.theme.RecipeTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Recipe()
        }
    }
}

@Composable
fun Recipe(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            ) {
            Column(
                modifier = Modifier
                    .padding(17.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(13.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    //adding image using the drawbles directory
                    Image(
                        painter = painterResource(id = R.drawable.biryani),
                        contentDescription = "Recipe picture",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "   Chicken Biryani",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                //the line in the app
                Divider(color = Color.Black, thickness = 4.dp)
                //column with ingredients
                Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
                    Text(text = "Ingredients", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text(text = "• 1 tablespoon ghee or vegetable oil")
                    Text(text = "• 1½ pounds boneless, skinless chicken breasts, cut into 1-inch cubes")
                    Text(text = "• 1 medium yellow onion, chopped")
                    Text(text = "• 1 jalapeño pepper, seeded and minced")
                    Text(text = "• 3 tablespoons prepared ginger paste")
                    Text(text = "• 2 teaspoons garam masala powder")
                    Text(text = "• 1 teaspoon ground cumin")
                    Text(text = "• 1 teaspoon ground turmeric powder")
                    Text(text = "• 1½ teaspoons salt")
                    Text(text = "• 1 tablespoon minced garlic")
                    Text(text = "• 2 large tomatoes, chopped")
                    Text(text = "• ½ cup golden raisins")
                    Text(text = "• 1 cup uncooked long-grain basmati rice")
                    Text(text = "• 2¼ cups low-sodium chicken broth")
                    Text(text = "• ¼ cup chopped fresh cilantro leaves")
                    Text(text = "• ¼ cup sliced unsalted almonds")
                    Text(text = "• 1 lime, cut into wedges")
                }

                Divider(color = Color.Black, thickness = 4.dp)
                //column with instructions
                Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
                    Text(text = "Instructions", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text(text = "1. Heat the ghee or oil over medium-high heat in a large nonstick skillet or frying pan. Once shimmering, add the chicken pieces and let them cook undisturbed for 3-5 minutes until golden brown.")
                    Text(text = "2. Turn the chicken pieces and add the onion, jalapeño, ginger paste, garam masala, cumin, turmeric, and salt. Sauté for 3 minutes or until the onions have softened.")
                    Text(text = "3. Add the minced garlic, tomatoes, and raisins to the pan. Stir well, then add the rice and chicken broth.")
                    Text(text = "4. Allow the liquid to come to a boil, then cover the pan with a lid and turn the heat down to medium-low. Let the rice steam for 15 minutes.")
                    Text(text = "5. Turn off the heat and fluff the rice with a fork. Re-cover the pan and allow the rice to continue to steam for another 10 minutes.")
                    Text(text = "6. Sprinkle cilantro leaves and almond slices on top for garnish.")
                    Text(text = "7. Serve the biryani straight out of the pan into each bowl, accompanied by lime wedges for squeezing.")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecipeTheme {
        Recipe()
    }
}
