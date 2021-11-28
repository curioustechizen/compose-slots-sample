package `in`.kiranrao.slotsdemo.data

import `in`.kiranrao.slotsdemo.ui.components.ShoppingCartItemModel
import `in`.kiranrao.slotsdemo.ui.components.ShoppingCartModel

val sampleShoppingCartModel = ShoppingCartModel(
    items = listOf(
        ShoppingCartItemModel(bookName = "Androids", count = "(x2)", total = "$50"),
        ShoppingCartItemModel(bookName = "Effective Java", count = "(x1)", total = "$20"),
    ),
    totalItemCount = "3",
    grandTotal = "$70.00"
)

val sampleBooks = listOf(
    BookModel(
        bookId = 1,
        title = "Androids",
        subtitle = "Chet Haase",
        price = "$25.00"
    ),
    BookModel(
        bookId = 2,
        title = "Jetpack Compose Internals",
        subtitle = "Jorge Castillo",
        price = "$20.00"
    ),
    BookModel(
        bookId = 3,
        title = "Inside the Android OS",
        subtitle = "G. Blake Meike, Larry Schiefer",
        price = "$35.00"
    ),
    BookModel(
        bookId = 4,
        title = "Crafting Interpreters",
        subtitle = "Bob Nystrom",
        price = "$45.00"
    ),
    BookModel(
        bookId = 5,
        title = "Effective Java - Second Edition",
        subtitle = "Joshua Bloch",
        price = "$30.00"
    ),
    BookModel(
        bookId = 6,
        title = "Working Effectively with Legacy Code",
        subtitle = "Michael C. Feathers",
        price = "$20.00"
    ),
)

val sampleMainScreenModel = MainScreenModel(sampleShoppingCartModel, sampleBooks)