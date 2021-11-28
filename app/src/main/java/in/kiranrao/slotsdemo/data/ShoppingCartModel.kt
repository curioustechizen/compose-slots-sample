package `in`.kiranrao.slotsdemo.ui.components

class ShoppingCartModel(
    val items: List<ShoppingCartItemModel>,
    val totalItemCount: String,
    val grandTotal: String
)

class ShoppingCartItemModel(
    val bookName: String,
    val count: String,
    val total: String
)