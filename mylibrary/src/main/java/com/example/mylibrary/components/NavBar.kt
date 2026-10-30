package com.example.mylibrary.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
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
import com.example.mylibrary.R


enum class NavItems(
    val icon: Int,
    val iconName: String,
) {
    Statistics(R.drawable.statistics_icon, "Statistics"),
    Discover(R.drawable.location_pin, "Discover"),
    Schedule(R.drawable.schedule, "Schedule"),
    Chat(R.drawable.chat, "Chat"),
    Profile(R.drawable.profile, "Profile")
}

@Composable
fun Nav(
    nav: NavItems,
    onNavClick: (NavItems) -> Unit,
) {

    Box() {

        Image(
            painterResource(R.drawable.container__task_bar),
            contentDescription = null,
            modifier = Modifier.matchParentSize()
        )

        NavigationBar(
            contentColor = Color.Transparent,
            containerColor = Color.Transparent,
            modifier = Modifier.padding(top = 28.dp),

            ) {


            NavItems.entries.forEach { navItem ->

                NavigationBarItem(
                    selected = navItem == nav,
                    onClick = {
                        onNavClick(navItem)
                    },
                    icon = {
                        if (navItem == NavItems.Schedule)
                        {
                            Box(

                                Modifier.size(58.dp).clip(CircleShape).border(5.dp, Color.White,CircleShape),

                                contentAlignment = Alignment.Center
                            ) {

                                Icon(
                                    painterResource(navItem.icon),
                                    contentDescription = null,
                                )
                            }
                        } else {
                            Icon(
                                painterResource(navItem.icon),
                                contentDescription = null,
                            )
                        }


                    },
                    label = if (navItem == NavItems.Schedule) null else {
                        {
                            Text(
                                navItem.iconName
                            )
                        }
                    },
                    modifier = Modifier.then(
                        if (navItem == NavItems.Schedule)
                            Modifier.padding(bottom = 38.dp)
                        else
                            Modifier
                    ),
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.Transparent,
                        unselectedIconColor = Color.White,
                        unselectedTextColor = Color.White,
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White
                    )
                )
            }

        }
    }


}

@Preview
@Composable
private fun NavPrev() {


    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var nowNav by remember { mutableStateOf(NavItems.Schedule) }

        Nav(
            nav = nowNav,
            { fromNav ->
                nowNav = fromNav
            }
        )
    }
}

