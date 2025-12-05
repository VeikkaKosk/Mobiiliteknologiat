package com.example.koodinjakaminen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.koodinjakaminen.ui.screens.ScaffoldApp
import com.example.koodinjakaminen.ui.theme.KoodinjakaminenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KoodinjakaminenTheme {
                ScaffoldApp()
            }
        }
    }
}
