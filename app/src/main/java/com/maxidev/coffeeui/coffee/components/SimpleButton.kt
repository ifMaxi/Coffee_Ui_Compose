package com.maxidev.coffeeui.coffee.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maxidev.coffeeui.R
import com.maxidev.coffeeui.ui.theme.CoffeeUiTheme

@Composable
fun SimpleButton(
    modifier: Modifier = Modifier,
    @StringRes text: Int,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .padding(20.dp)
            .height(50.dp)
            .width(120.dp),
        onClick = onClick,
        elevation = ButtonDefaults.buttonElevation(6.dp),
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)
    ) {
        Text(
            text = stringResource(id = text),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@Preview
@Composable
fun ButtonPreview() {
    CoffeeUiTheme {
        SimpleButton(text = R.string.buy, onClick = {})
    }
}
