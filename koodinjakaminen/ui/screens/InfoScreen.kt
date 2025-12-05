package com.example.koodinjakaminen.ui.screens

import androidx.compose.foundation.layout.padding // <-- Import this
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.koodinjakaminen.ui.components.ScreenTopBar

@Composable
fun InfoScreen(navController: NavController) {
    Scaffold(topBar = { ScreenTopBar("Info", navController) }) { innerPadding ->
        Text(
            text = "Info Screen",
            modifier = Modifier.padding(innerPadding)
        )
    }
}
