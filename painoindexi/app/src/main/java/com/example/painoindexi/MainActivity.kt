package com.example.painoindexi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.foundation.text.KeyboardOptions

class MainActivity : ComponentActivity() {

    private val bmiViewModel: BmiViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BmiApp(bmiViewModel)
        }
    }
}

@Composable
fun BmiApp(viewModel: BmiViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Height input
        OutlinedTextField(
            value = viewModel.height,
            onValueChange = { viewModel.height = it },
            label = { Text("Height (m)") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Weight input
        OutlinedTextField(
            value = viewModel.weight,
            onValueChange = { viewModel.weight = it },
            label = { Text("Weight (kg)") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Button to calculate BMI
        Button(onClick = { viewModel.calculateBmi() }, modifier = Modifier.fillMaxWidth()) {
            Text("Calculate BMI")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Display BMI result
        Text(text = "Your BMI: ${"%.2f".format(viewModel.bmi)}")
    }
}
