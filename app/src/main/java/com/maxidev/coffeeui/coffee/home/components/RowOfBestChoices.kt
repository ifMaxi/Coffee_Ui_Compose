package com.maxidev.coffeeui.coffee.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.StarRate
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maxidev.coffeeui.R
import com.maxidev.coffeeui.ui.theme.CoffeeUiTheme

@Composable
fun RowOfBestChoices(
    modifier: Modifier = Modifier,
    bestCoffeeAndText: List<Pair<Int, Int>>,
    stars: String
) {
    val spacedBySpace = Arrangement.spacedBy(10.dp)

    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = spacedBySpace
    ) {
        Text(
            text = stringResource(id = R.string.best_choice),
            style = MaterialTheme.typography.bodyLarge
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = spacedBySpace
        ) {
            bestCoffeeAndText.forEach { choice ->
                Card(
                    modifier = Modifier.weight(1f),
                    elevation = CardDefaults.cardElevation(6.dp),
                    colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surface)
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Image(
                            painter = painterResource(id = choice.first),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.height(130.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(all = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = stringResource(id = choice.second),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stars,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Icon(
                            imageVector = Icons.Rounded.StarRate,
                            contentDescription = null
                        )
                    }
                }
            }
        }
        Divider()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFCC80)
@Composable
fun BestPreview() {
    CoffeeUiTheme {
        RowOfBestChoices(
            bestCoffeeAndText =
            listOf(
                Pair(R.drawable.mocca, R.string.mocca),
                Pair(R.drawable.frappe, R.string.frappe)
            ),
            stars = "4"
        )
    }
}
