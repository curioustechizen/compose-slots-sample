package `in`.kiranrao.slotsdemo

import `in`.kiranrao.slotsdemo.data.sampleMainScreenModel
import `in`.kiranrao.slotsdemo.ui.components.BookList
import `in`.kiranrao.slotsdemo.ui.components.MainScreen
import `in`.kiranrao.slotsdemo.ui.components.MainScreenWithSlots
import `in`.kiranrao.slotsdemo.ui.components.ShoppingCart
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import `in`.kiranrao.slotsdemo.ui.theme.SlotsDemoTheme

class SlotsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SlotsDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreenWithSlots(
                        shoppingCartContent = {
                            ShoppingCart(shoppingCartModel = sampleMainScreenModel.shoppingCartModel)
                        },
                        booksContent = {
                            BookList(
                                books = sampleMainScreenModel.books,
                                onBookAdded = {}
                            )
                        },
                        isWideScreen = true
                    )
                }
            }
        }
    }
}