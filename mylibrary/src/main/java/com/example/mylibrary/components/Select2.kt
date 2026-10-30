package com.example.mylibrary.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylibrary.R

@Composable
fun Select2(
    text1:String,
    text3:String,
    onClick:() ->Unit,
    modifier: Modifier = Modifier) {
Column(modifier = Modifier){
    Text(text = text1, color = Color(0xFFFA5075), fontSize = 8 .sp)
    Spacer( modifier=modifier.height(10.dp))

    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = text3, color = Color.Black, fontSize = 12 .sp)
        Spacer(modifier =modifier.width(13.dp))
        Icon(
            modifier = Modifier.clickable{onClick ()},
            painter = painterResource(R.drawable.dropdown),
            contentDescription = "",
            tint = Color(0xFFFA5075)
        )
    }
}
}

@Composable
fun Logout(modifier: Modifier = Modifier) {
    Row(){


    }
}

@Preview
@Composable
fun SelectViod(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Select2(text1="FROM", text3 = "MON,NOV 4,2019",{})
    }
}