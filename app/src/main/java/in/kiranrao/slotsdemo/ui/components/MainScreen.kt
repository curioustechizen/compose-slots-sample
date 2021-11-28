package `in`.kiranrao.slotsdemo.ui.components

import `in`.kiranrao.slotsdemo.data.MainScreenModel
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainScreen(mainScreenModel: MainScreenModel, isWideScreen: Boolean = false) {
    if (isWideScreen) {
        Row(Modifier.fillMaxHeight()) {
            Box(Modifier.weight(0.65f)) {
                BookList(
                    books = mainScreenModel.books,
                    onBookAdded = {}
                )
            }
            Box(Modifier.weight(0.35f)) {
                ShoppingCart(shoppingCartModel = mainScreenModel.shoppingCartModel)
            }
        }
    } else {
        BottomSheetScaffold(
            sheetContent = { ShoppingCart(shoppingCartModel = mainScreenModel.shoppingCartModel) }
        ) {
            BookList(books = mainScreenModel.books, onBookAdded = {})
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainScreenWithSlots(
    shoppingCartContent: @Composable () -> Unit,
    booksContent: @Composable () -> Unit,
    isWideScreen: Boolean = false
) {
    if (isWideScreen) {
        Row(Modifier.fillMaxHeight()) {
            Box(Modifier.weight(0.65f)) {
                booksContent()
            }
            Box(Modifier.weight(0.35f)) {
                shoppingCartContent()
            }
        }
    } else {
        BottomSheetScaffold(sheetContent = { shoppingCartContent() }) {
            booksContent()
        }
    }
}