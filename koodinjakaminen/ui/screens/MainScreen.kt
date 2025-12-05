package com.example.koodinjakaminen.ui.screens

import androidx.compose.foundation.layout.padding // <-- Import this
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.koodinjakaminen.ui.components.MainTopAppBar

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(topBar = { MainTopAppBar("My app", navController) }) { innerPadding ->
        // The 'padding' function is an extension on the Modifier class.
        // You need to apply it to a Modifier instance like this:
        Text("Home Screen", modifier = Modifier.padding(innerPadding))
    }
}
