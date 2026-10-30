package com.example.mylibrary.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ModalWind(modifier: Modifier = Modifier) {
    var Diolog2 by remember{ mutableStateOf(false) }

    Column() {
        Button(
            onClick = {Diolog2 = true},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1A6FEE)
            )
        ) {
            Text(text = "Подробнее")
        }
    }
}



@Preview
@Composable
fun Modal(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ModalWind()
    }
}