package com.example.koodinjakaminen.ui.screens

// Add this import for the Modifier class
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.koodinjakaminen.ui.components.ScreenTopBar

@Composable
fun SettingsScreen(navController: NavController) {
    Scaffold(topBar = { ScreenTopBar("Settings", navController) }) { innerPadding ->
        // Now Modifier.padding will be resolved correctly
        Text("Settings Screen", Modifier.padding(innerPadding))
    }
}
