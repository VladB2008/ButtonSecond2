package com.example.mylibrary.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun StandardButtonsScreen() {

    val BluePrimary = Color(0xFF0D6EFD)
    val BlueDisabled = Color(0xFFC0D4FC)
    val GrayBackground = Color(0xFF1143A8)
    val DarkText = Color(0xFF1C1C1E)


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        val interactionSource1 = remember { MutableInteractionSource() }
        val isPressed1 by interactionSource1.collectIsPressedAsState()
        val color1 = if (isPressed1) BlueDisabled else BluePrimary

        Button(
            onClick = {  },
            interactionSource = interactionSource1,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = color1,
                contentColor = Color.White
            )
        ) {

            Box(modifier = Modifier.fillMaxWidth()) {
                Text("Подтвердить", modifier = Modifier.align(androidx.compose.ui.Alignment.Center))

            }
        }


        val interactionSource2 = remember { MutableInteractionSource() }
        val isPressed2 by interactionSource2.collectIsPressedAsState()


        val color2 = if (isPressed2) GrayBackground else Color.Transparent

        val textColor2 = if (isPressed2) DarkText else BluePrimary

        Button(
            onClick = {  },
            interactionSource = interactionSource2,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(1.dp, BluePrimary),
            colors = ButtonDefaults.buttonColors(
                containerColor = color2,
                contentColor = textColor2
            )
        ) {
            Text("Подтвердить")
        }
    }
}

@Preview
@Composable
fun ClickBotton(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
        .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    )
    {
        StandardButtonsScreen()
    }
}