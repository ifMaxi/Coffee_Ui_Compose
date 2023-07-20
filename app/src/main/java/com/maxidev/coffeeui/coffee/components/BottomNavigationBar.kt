package com.maxidev.coffeeui.coffee.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Coffee
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    val navItems = listOf(
        BottomNavItem(
            name = "Home",
            icons = Icons.Default.Home,
            routes = "HomeScreen"
        ),
        BottomNavItem(
            name = "Recipes",
            icons = Icons.Default.Coffee,
            routes = "RecipeScreen"
        ),
        BottomNavItem(
            name = "Cart",
            icons = Icons.Default.ShoppingCart,
            routes = "CartScreen"
        )
    )

    NavigationBar(
        modifier = modifier
            .fillMaxWidth()
            //.height(55.dp)
    ) {
        navItems.forEach { item ->
            val selected = item.routes == backStackEntry.value?.id

            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icons,
                        contentDescription = null
                    )
                },
                label = { Text(text = item.name) },
                //alwaysShowLabel = false,
                selected = selected,
                onClick = {
                    navController.navigate(item.routes)
                }
            )
        }
    }
}

data class BottomNavItem(
    val name: String,
    val icons: ImageVector,
    val routes: String
)
