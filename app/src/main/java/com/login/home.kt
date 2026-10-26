package com.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.buttonsecond.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import com.example.buttonsecond.ui.theme.HomeSreen


@Composable
//функция первого экрана
fun StartHome(modifier: Modifier = Modifier) {
Box(
    modifier = Modifier.fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colors = HomeSreen
                )
            )
        )
{

    Column(
        modifier= modifier.fillMaxSize().align(Alignment.Center).padding(horizontal = 100.dp),

horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(274.59.dp))
        Icon(
            painter = painterResource(id = R.drawable.masegone),
            contentDescription = null,
            modifier= Modifier.size(57.dp),
            tint = Color.White
        )
        Text(text="GAAMETIIME",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Black,
            letterSpacing = 1.sp)
        Text(text="CONNECT WITH YOUR REALITY",
            color = Color.White,
            fontSize = 7.sp,
            fontWeight = FontWeight.Black,
            letterSpacing = 1.sp)
    }

    Icon(
        painter = painterResource(id = R.drawable.homescreen),
        contentDescription = null,
        modifier= Modifier.fillMaxWidth().height(250.dp) .align(Alignment.BottomCenter),

        tint = Color.White

    )

}



}