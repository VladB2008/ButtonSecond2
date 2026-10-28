package com.example.mylibrary.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import com.example.mylibrary.R
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.mylibrary.theme.HomeScreen


@Composable
fun CheckBox(
    checked: Boolean,
    onCheck:(Boolean) -> Unit,
    modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(14.dp)
            .clip(RoundedCornerShape(1.dp))
            .clickable { onCheck(!checked) }
            .border(BorderStroke(1.dp, brush = HomeScreen)),
        contentAlignment = Alignment.Center // Центрируем галочку


    ) {
        if (checked) {
            Icon(
                painter = painterResource(id = R.drawable.checkmark),
                contentDescription = "",
                tint = Color(0xFFFA5075)
            )
        }
    }
}

@Preview
@Composable
private fun Check(){
    Row(
        modifier = Modifier
            .fillMaxSize(),
       horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ){
        var FerstChek by remember { mutableStateOf(false) }
        var SecondChek by remember { mutableStateOf(false) }

        CheckBox(
            checked = FerstChek,
            onCheck = {
                FerstChek = it
                if (FerstChek){
                    SecondChek =false
                }
            }
        )
        Spacer(modifier = Modifier.width(4.dp))

        // 4. Второй чекбокс
        CheckBox(
            checked = SecondChek,
            onCheck = {
                SecondChek = it
                if (SecondChek) {
                    FerstChek = false // Если включили второй, выключаем первый
                }
            }
        )
    }
}
