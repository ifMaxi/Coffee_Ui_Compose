package com.maxidev.coffeeui.coffee.shopcart.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
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
fun ColumnOfContentCart(
    modifier: Modifier = Modifier,
    theTriple: List<Triple<Int, String, String>>
) {
    val smallFont = MaterialTheme.typography.bodySmall

    Column(
        modifier = modifier
            .padding(all = 18.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        theTriple.forEach { items ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(id = items.first),
                    style = smallFont
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = items.second,
                    style = smallFont
                )
                Spacer(modifier = Modifier.width(80.dp))
                Text(
                    text = items.third,
                    style = smallFont
                )
            }
            Divider()
        }
    }
}

@Preview
@Composable
fun ContentCartPreview() {
    CoffeeUiTheme {
        ColumnOfContentCart(
            theTriple = listOf(
                Triple(first = R.string.espresso, second = "1", third = "$20"),
                Triple(first = R.string.macchiato, second = "1", third = "$36")
            )
        )
    }
}
