package `in`.kiranrao.slotsdemo.ui.components

import `in`.kiranrao.slotsdemo.data.sampleBooks
import `in`.kiranrao.slotsdemo.ui.theme.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BookRow(color: Color, title: String, subtitle: String, price: String, onAdd: () -> Unit) {
    Card {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            Box(
                modifier = Modifier
                    .size(96.dp)
                    .background(color = color, shape = RoundedCornerShape(percent = 20)),
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1.0f)) {
                Text(text = title, style = MaterialTheme.typography.h6)
                Text(text = subtitle, style = MaterialTheme.typography.caption)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = price, style = MaterialTheme.typography.subtitle1)
            }
            IconButton(onClick = onAdd) {
                Icon(
                    Icons.Outlined.AddCircle,
                    contentDescription = null,
                    tint = MaterialTheme.colors.secondaryVariant,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun BookRowPreview() {
    SlotsDemoTheme {
        val book = sampleBooks[0]
        BookRow(
            color = Purple200,
            title = book.title,
            subtitle = book.subtitle,
            price = book.price,
            onAdd = {}
        )
    }
}