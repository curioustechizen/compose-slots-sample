package `in`.kiranrao.slotsdemo.ui.components

import `in`.kiranrao.slotsdemo.data.sampleShoppingCartModel
import `in`.kiranrao.slotsdemo.ui.theme.SlotsDemoTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ShoppingCart(shoppingCartModel: ShoppingCartModel) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        ShoppingCartSummary(
            totalItemCount = shoppingCartModel.totalItemCount,
            grandTotalPrice = shoppingCartModel.grandTotal
        )
        Spacer(modifier = Modifier.height(96.dp))
        shoppingCartModel.items.forEach {
            ShoppingCartItem(name = it.bookName, count = it.count, total = it.total)
        }
    }
}

@Composable
fun ShoppingCartItem(name: String, count: String, total: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = name, style = MaterialTheme.typography.h5, modifier = Modifier.weight(1.0f))
        Text(
            text = count,
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(horizontal = 2.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = total,
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(horizontal = 4.dp)
        )
    }
}

@Composable
fun ShoppingCartSummary(
    totalItemCount: String,
    grandTotalPrice: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Books: ", style = MaterialTheme.typography.h6)
            Text(
                text = totalItemCount,
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.primary
            )

        }
        Text(text = grandTotalPrice, style = MaterialTheme.typography.h4)
    }
}

@Preview
@Composable
fun ShoppingCartSummaryPreview() {
    SlotsDemoTheme {
        Surface {
            ShoppingCartSummary(
                totalItemCount = "3",
                grandTotalPrice = "$125.00",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun ShoppingCartItemPreview() {
    SlotsDemoTheme {
        Surface {
            ShoppingCartItem("Androids", "(x2)", "$50.00")
        }
    }
}

@Preview
@Composable
fun ShoppingCartPreview() {
    SlotsDemoTheme {
        Surface {
            ShoppingCart(sampleShoppingCartModel)
        }
    }
}

