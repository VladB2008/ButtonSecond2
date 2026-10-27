package com.example.mylibrary.components


import android.media.Image
import androidx.compose.foundation.Image
import com.example.mylibrary.R// спросить у олега как понять какой импорт у R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.mylibrary.theme.HomeSreen

@Composable
fun Cart(
    text1:String,
    text2:String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier) {
    Card(modifier = modifier
        .clip(AbsoluteRoundedCornerShape(10.dp))//повторить
        .background(HomeSreen),
        colors = CardDefaults.cardColors(contentColor = Color.Transparent)//повторить
    ){
Box(Modifier.fillMaxSize()){
    Column(modifier
        .padding(top = 30.dp) //раставить отталкиваясь от фигмы
        .fillMaxWidth(0.55f)//на повторение
    ) {
Text(
    text1,
    color = Color.White,
)
        Spacer(Modifier.height(14.dp))//сравнить с фигма
        Text(
            text2,
            color = Color.White,
        )
        Spacer(Modifier.weight(1f))//сравнить с фигма

        Icon(
           painter =  painterResource(id = R.drawable.arrow),
            contentDescription = "",
            tint =Color.White,
            modifier=modifier.clickable{onClick()}//повторить
        )
    }

    Image(//разница картинок и иконок?
 painter = painterResource(id = R.drawable.onesreen),
        contentDescription = "",
        contentScale = ContentScale.Fit,//повторить важно
 modifier = Modifier
     .fillMaxWidth(0.60f)
     .fillMaxHeight(0.75f)
     .padding(bottom = 22.dp, end = 22.dp)
     .align(Alignment.BottomEnd),
        alignment = Alignment.BottomEnd,
    )
}
    }
}

@Preview

@Composable
fun CartOften() {
   Cart(
       text1= "Schedule",
       text2 = "Easily schedule event/games then find like minded players for battle. You up for it?",
       {},
   )
}
