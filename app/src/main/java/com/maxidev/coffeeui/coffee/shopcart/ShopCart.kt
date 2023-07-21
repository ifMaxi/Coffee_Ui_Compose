package com.maxidev.coffeeui.coffee.shopcart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.maxidev.coffeeui.R
import com.maxidev.coffeeui.coffee.shopcart.components.ColumnOfContentCart
import com.maxidev.coffeeui.coffee.shopcart.components.RowOfButtons
import com.maxidev.coffeeui.coffee.shopcart.components.RowOfItemName
import com.maxidev.coffeeui.coffee.shopcart.components.RowOfTotalPrice
import com.maxidev.coffeeui.data.FakeShopCart

@Composable
fun ShopCart(
    modifier: Modifier = Modifier,
    fakeShop: FakeShopCart
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.shop_cart),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        RowOfItemName()
        ColumnOfContentCart(
            theTriple = fakeShop.triples
        )
        Spacer(modifier = Modifier.height(20.dp))
        RowOfTotalPrice(totalPrice = R.string.total_price)
        RowOfButtons(
            textButtonBuy = R.string.buy,
            textButtonCancel = R.string.cancel
        )
    }
}
