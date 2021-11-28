package `in`.kiranrao.slotsdemo.ui.components

import `in`.kiranrao.slotsdemo.data.BookModel
import `in`.kiranrao.slotsdemo.data.sampleBooks
import `in`.kiranrao.slotsdemo.ui.theme.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BookList(books: List<BookModel>, onBookAdded: (bookId: Int) -> Unit) {
    LazyColumn {
        itemsIndexed(books) { index, item ->
            BookRow(
                color = colors[index % colors.size],
                title = item.title,
                subtitle = item.subtitle,
                price = item.price,
                onAdd = { onBookAdded(item.bookId) }
            )
            if (index < books.lastIndex) Divider()
        }
    }
}

@Preview
@Composable
fun BookListPreview() {
    SlotsDemoTheme {
        BookList(books = sampleBooks, onBookAdded = {})
    }
}

private val colors = listOf(Purple200, Teal200, Purple500, Purple700)