package com.maxidev.coffeeui.data

import com.maxidev.coffeeui.R

object FakeData {
    // Popular list
    val popularList = listOf(
        R.drawable.expresso_coffee,
        R.drawable.cappuccino,
        R.drawable.milkcoffee,
        R.drawable.frappe,
    )

    // Best choice
    val bestChoice = listOf(
        Pair(R.drawable.milkcoffee, R.string.milk_coffee),
        Pair(R.drawable.mocca, R.string.mocca)
    )

    // More choice
    val moreChoiceOne = listOf(
        Pair(R.drawable.carajillo, R.string.carajillo),
        Pair(R.drawable.macchiato, R.string.macchiato)
    )

    val moreChoiceTwo = listOf(
        Pair(R.drawable.expresso_coffee, R.string.espresso),
        Pair(R.drawable.cappuccino, R.string.cappuccino)
    )
}
