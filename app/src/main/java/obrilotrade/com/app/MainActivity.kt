package obrilotrade.com.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import obrilotrade.com.app.ui.composable.approot.AppRoot
import obrilotrade.com.app.ui.theme.ProductAppRBLDRTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductAppRBLDRTheme {
                AppRoot()
            }
        }
    }
}