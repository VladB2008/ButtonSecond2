package com.example.mylibrary.components

import android.R
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ButtonDefolt(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {

        Button(
            onClick,
            modifier.clip(AbsoluteCutCornerShape(100.dp)),
            shape = AbsoluteRoundedCornerShape(100.dp)
            ) {
            Text(
                text,
//                style,
                textAlign = TextAlign.Center
            )
        }
    }


@Preview
@Composable
fun But(){
    ButtonDefolt("Let's Combat!", {})
}