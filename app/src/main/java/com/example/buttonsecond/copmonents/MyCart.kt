package com.example.buttonsecond.copmonents

import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyCart(
    color: Color,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Card(
        modifier = modifier.width(180.dp),
        colors = CardDefaults.cardColors(
            containerColor = color,
            contentColor = Color(0xFF000000)
        )
    ) {
        content()
    }

}