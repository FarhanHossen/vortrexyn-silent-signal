package com.farhan.vortrexyn.silentsignal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.farhan.vortrexyn.silentsignal.navigation.AppNavGraph
import com.farhan.vortrexyn.silentsignal.ui.theme.VortrexynSilentSignalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VortrexynSilentSignalTheme {
                AppNavGraph()
            }
        }
    }
}
