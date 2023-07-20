package com.maxidev.coffeeui.coffee.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.maxidev.coffeeui.coffee.home.components.GiftCard
import com.maxidev.coffeeui.coffee.home.components.GridOfMoreChoices
import com.maxidev.coffeeui.coffee.home.components.RowOfBestChoices
import com.maxidev.coffeeui.coffee.home.components.RowOfFavouriteCoffees
import com.maxidev.coffeeui.coffee.home.components.RowOfNiceDayAndProfile
import com.maxidev.coffeeui.data.FakeData

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    fakeCoffee: FakeData
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        item {
            RowOfNiceDayAndProfile()
        }
        item {
            RowOfFavouriteCoffees(circularImage = fakeCoffee.popularList)
        }
        item {
            RowOfBestChoices(
                bestCoffeeAndText = fakeCoffee.bestChoice,
                stars = "4"
            )
        }
        item {
            GiftCard()
        }
        item {
            GridOfMoreChoices(
                moreChoicesOfCoffeeOne = fakeCoffee.moreChoiceOne,
                moreChoicesOfCoffeeTwo = fakeCoffee.moreChoiceTwo,
                stars = "5"
            )
        }
    }
}
