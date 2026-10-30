package com.example.mylibrary.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
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
import androidx.compose.ui.unit.dp


@Composable
fun OurInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "",
    Icon: Int = 0,
) {

    Column(Modifier.width(263.dp)) {
        BasicTextField(
            value,
            onValueChange,
            modifier = modifier,
            singleLine = true,
            decorationBox = { inner ->
                if (value.isEmpty()) Text(placeholder, color = Color.Black)
                inner()
            }
        )
        Spacer(Modifier.height(8.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .background(
                    Color.Red
                )
                .height(1.dp)
        )
    }
}


@Preview
@Composable
private fun InputPrev() {


    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var valueTextFiled by remember { mutableStateOf("") }
        OurInput(
            valueTextFiled,
            {
                valueTextFiled = it

            },
            placeholder = "Full Name"
        )
    }

}


