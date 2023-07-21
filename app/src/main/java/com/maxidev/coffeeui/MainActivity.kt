package com.maxidev.coffeeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maxidev.coffeeui.coffee.components.BottomNavigationBar
import com.maxidev.coffeeui.coffee.home.HomeScreen
import com.maxidev.coffeeui.coffee.ingredients.MakeCoffee
import com.maxidev.coffeeui.coffee.shopcart.ShopCart
import com.maxidev.coffeeui.data.FakeData
import com.maxidev.coffeeui.data.FakeRecipe
import com.maxidev.coffeeui.data.FakeShopCart
import com.maxidev.coffeeui.ui.theme.CoffeeUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeUiTheme {
                val navController: NavHostController = rememberNavController()

                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(
                            navController = navController
                        )
                    }
                ) { contentPadding ->
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(contentPadding),
                        color = MaterialTheme.colorScheme.surface
                    ) {
                        NavHost(
                            modifier = Modifier,
                            navController = navController,
                            startDestination = "homescreen"
                        ) {
                            composable(route = "homescreen") {
                                HomeScreen(fakeCoffee = FakeData)
                            }
                            composable(route = "recipescreen") {
                                MakeCoffee(fakeRecipe = FakeRecipe)
                            }
                            composable(route = "cartscreen") {
                                ShopCart(fakeShop = FakeShopCart)
                            }
                        }
                    }
                }
            }
        }
    }
}
