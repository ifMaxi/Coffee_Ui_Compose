package com.maxidev.coffeeui.coffee.ingredients.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun ListOfDifferentCoffee(
    modifier: Modifier = Modifier,
    pairOfImageAndText: List<Pair<Int, Int>>,
    clickableCard: () -> Unit
) {
    pairOfImageAndText.forEach { contentList ->
        Card(
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(100.dp)
                .clickable { clickableCard() },
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(id = contentList.first),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(130.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    modifier = Modifier.align(Alignment.CenterVertically),
                    text = stringResource(id = contentList.second),
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
    }
}
