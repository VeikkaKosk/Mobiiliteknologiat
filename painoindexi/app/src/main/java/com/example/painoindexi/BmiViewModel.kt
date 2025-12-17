package com.example.painoindexi

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {

    // User input states
    var weight by mutableStateOf("")
    var height by mutableStateOf("")

    // BMI result
    var bmi by mutableStateOf(0.0)
        private set

    // Function to calculate BMI
    fun calculateBmi() {
        val weightDouble = weight.toDoubleOrNull()
        val heightDouble = height.toDoubleOrNull()

        if (weightDouble != null && heightDouble != null && heightDouble > 0) {
            bmi = weightDouble / (heightDouble * heightDouble)
        } else {
            bmi = 0.0
        }
    }
}
