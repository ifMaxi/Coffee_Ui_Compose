package com.maxidev.coffeeui.coffee.shopcart.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maxidev.coffeeui.ui.theme.CoffeeUiTheme

@Composable
fun RowOfItemName(modifier: Modifier = Modifier) {
    val mediumFont = MaterialTheme.typography.bodyMedium

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 80.dp, bottom = 10.dp, start = 37.dp, end = 40.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Product",
            style = mediumFont
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Amount",
            style = mediumFont
        )
        Spacer(modifier = Modifier.width(34.dp))
        Text(
            text = "Price",
            style = mediumFont
        )
    }
}

@Preview
@Composable
fun ItemNamePreview() {
    CoffeeUiTheme {
        RowOfItemName()
    }
}
