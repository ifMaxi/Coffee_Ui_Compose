package com.maxidev.coffeeui.coffee.shopcart.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maxidev.coffeeui.R
import com.maxidev.coffeeui.ui.theme.CoffeeUiTheme

@Composable
fun RowOfTotalPrice(
    modifier: Modifier = Modifier,
    @StringRes totalPrice: Int
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = stringResource(id = totalPrice),
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "$56",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview
@Composable
fun TotalPricePreview() {
    CoffeeUiTheme {
        RowOfTotalPrice(totalPrice = R.string.total_price)
    }
}
