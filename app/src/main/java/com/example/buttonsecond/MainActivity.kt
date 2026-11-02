package com.example.buttonsecond

import Cart
import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
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
import com.example.mylibrary.R
import com.example.mylibrary.components.ButtonDefolt
import com.example.mylibrary.components.CheckBox
import com.example.mylibrary.components.Nav
import com.example.mylibrary.components.NavItems
import com.example.mylibrary.components.OurInput
import com.example.mylibrary.components.Points
import com.example.mylibrary.components.Select
import com.example.mylibrary.components.StandardButtonsScreen

import com.example.mylibrary.theme.ButtonSecondTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContent {
            ButtonSecondTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Greeting(

                        modifier = Modifier.padding(innerPadding)
                    )
                }


            }

        }

    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    //кнопкаlibr
    LazyColumn(

    ) {

        item {

            Column(
                modifier = modifier
                     // ← Добавляет прокрутку
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ButtonDefolt("Let’s Combat!", {})
                //Chekbox


                var FerstChek by remember { mutableStateOf(true) }
                var SecondChek by remember { mutableStateOf(false) }
                Row(
                    modifier = Modifier
                ) {
                    CheckBox(
                        checked = FerstChek,
                        onCheck = {
                            FerstChek = it
                            if (FerstChek) {
                                SecondChek = false
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
                //Input


                var valueTextFiled by remember { mutableStateOf("") }
                OurInput(
                    valueTextFiled,
                    {
                        valueTextFiled = it

                    },
                    placeholder = "Full Name"
                )
                //NavBar
                var nowNav by remember { mutableStateOf(NavItems.Schedule) }

                Nav(
                    nav = nowNav,
                    onNavClick = { fromNav -> nowNav = fromNav }
                )
                //Pagination
                Column(
                    Modifier

                        .padding(horizontal = 16.dp),
                    Arrangement.spacedBy(10.dp)

                ) {

                    Points(0)
                    Points(1)
                    Points(2)
                }
                //Select

                Select(text = "FROM", text2 = "MON,NOV 4,2019", onClick = {})


                Cart(
                    "Schedule",
                    "Easily schedule event/games then find like minded players for battle. You up for it?",
                    {},
                    image = R.drawable.onesreen,

                )

            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}




