package `in`.kiranrao.slotsdemo

import `in`.kiranrao.slotsdemo.data.sampleMainScreenModel
import `in`.kiranrao.slotsdemo.ui.components.MainScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import `in`.kiranrao.slotsdemo.ui.theme.SlotsDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SlotsDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen(mainScreenModel = sampleMainScreenModel)
                }
            }
        }
    }
}