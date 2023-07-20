package com.maxidev.coffeeui.coffee.ingredients

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.maxidev.coffeeui.coffee.ingredients.components.ListOfDifferentCoffee
import com.maxidev.coffeeui.coffee.ingredients.components.RowOfMakeYourCoffee
import com.maxidev.coffeeui.data.FakeRecipe

@Composable
fun MakeCoffee(
    modifier: Modifier = Modifier,
    fakeRecipe: FakeRecipe
) {
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        item {
            RowOfMakeYourCoffee(modifier = modifier)
        }
        item {
            ListOfDifferentCoffee(
                pairOfImageAndText = fakeRecipe.pairOfImageAndText,
                clickableCard = {}
            )
        }
    }
}
