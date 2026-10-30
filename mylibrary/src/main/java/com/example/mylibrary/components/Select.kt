package com.example.mylibrary.components


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylibrary.R

@Composable
fun Select(
    text: String,
    text2: String,
    onClick: ()->Unit,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier.fillMaxSize() ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Column(
            modifier = Modifier,
        ) {
            Text(text, color = Color(0xFFFA5075), fontSize = 8.sp)
            Spacer(modifier.height(10.dp))

            Row(

                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text2, color = Color.Black, fontSize = 20.sp)
                Spacer(modifier = modifier.width(20.dp))
                Icon(
                    painter = painterResource(id = R.drawable.dropdown),
                    contentDescription = "",
                    modifier = Modifier.size(12.dp),
                    tint = Color(0xFFFA5075)
                )

            }
        }

    }

}

@Preview
@Composable
fun SelectProject(

) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Select(text = "FROM", text2 = "MON,NOV 4,2019", onClick = {})
    }
}