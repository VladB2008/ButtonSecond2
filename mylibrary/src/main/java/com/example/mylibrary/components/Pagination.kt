package com.example.mylibrary.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun Points(currentNum: Int) {

    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        repeat(3) { num ->
            Point(if (num == currentNum) true else false)
        }

    }

}

@Composable
fun Point(
    isChoose: Boolean
) {

    Box(
        Modifier
            .size(10.dp)
            .background(if (!isChoose) Color(0x4DFA5075) else Color(0xFFFA5075), CircleShape)
            .clip(CircleShape)
    )


}


@Preview
@Composable
private fun PointsPrev() {

        Column(
            Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
            Alignment.CenterHorizontally
        ) {

            Points(0)
            Points(1)
            Points(2)
        }

    }
