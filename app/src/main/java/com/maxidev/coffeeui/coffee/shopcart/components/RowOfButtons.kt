package com.maxidev.coffeeui.coffee.shopcart.components

import android.widget.Toast
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maxidev.coffeeui.R
import com.maxidev.coffeeui.coffee.components.SimpleButton
import com.maxidev.coffeeui.ui.theme.CoffeeUiTheme

@Composable
fun RowOfButtons(
    modifier: Modifier = Modifier,
    @StringRes textButtonBuy: Int,
    @StringRes textButtonCancel: Int
) {
    val context = LocalContext.current

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 100.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        SimpleButton(
            text = textButtonCancel,
            onClick = {
                Toast.makeText(
                    context, "I'm sorry, but you can't cancel 😈",
                    Toast.LENGTH_LONG
                ).show()
            }
        )
        SimpleButton(
            text = textButtonBuy,
            onClick = {
                Toast.makeText(
                    context, "Thanks for buying!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        )
    }
}

@Preview
@Composable
fun ButtonsPreview() {
    CoffeeUiTheme {
        RowOfButtons(
            textButtonBuy = R.string.buy,
            textButtonCancel = R.string.cancel
        )
    }
}
