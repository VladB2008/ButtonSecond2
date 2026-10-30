package com.example.mylibrary.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ButtonDefolt(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        onClick = onClick,

        // 1. Исправили modifier (добавили =) и убрали лишний .clip()
        modifier = Modifier
            .width(224.dp)
            .height(58.dp),

        // 2. Оставили только один shape
        shape = AbsoluteRoundedCornerShape(100.dp),

        enabled = enabled,

        // 3. Цвета
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black,
            contentColor = Color.White,          // Цвет текста в обычном состоянии
              // Цвет текста при нажатии (чтобы не сливался с белым фоном)
        ),

        // 4. Убрали вертикальные отступы, оставили только горизонтальные
        contentPadding = PaddingValues(horizontal = 7.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview
@Composable
private  fun But(){
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ButtonDefolt("Let’s Combat!",{})
    }
    }
