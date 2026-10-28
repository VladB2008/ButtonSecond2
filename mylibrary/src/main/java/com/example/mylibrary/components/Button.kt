package com.example.mylibrary.components


import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mylibrary.theme.HomeScreen


@Composable
fun ButtonDefolt(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean =true,
) {

        Button(
            onClick,
            modifier.width(224.dp).height(58.dp).clip(AbsoluteRoundedCornerShape(100.dp))
                .background(HomeScreen)
            ,
            shape = AbsoluteRoundedCornerShape(100.dp),
            enabled = enabled,
            colors = buttonColors(
                contentColor = Color.White,
                containerColor = Color.Transparent
            ),
            contentPadding = PaddingValues(top=18.dp, start = 7.dp, bottom = 19.dp, end = 7.dp )
            ) {
            Text(
                text,
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
