package com.example.broadcastreceiverinandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.broadcastreceiverinandroid.services.broadcast.AirplaneModeScreen
import com.example.broadcastreceiverinandroid.services.broadcast.SendBroadcastDataScreen
import com.example.broadcastreceiverinandroid.ui.theme.BroadcastReceiverInAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BroadcastReceiverInAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //AirplaneModeScreen()
                    SendBroadcastDataScreen()
                }
            }
        }
    }
}
