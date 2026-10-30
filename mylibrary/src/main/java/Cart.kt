import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylibrary.R
import com.example.mylibrary.theme.HomeScreen // Ваш градиент
import com.example.mylibrary.theme.PoppinsFontFamily // Ваш шрифт

@Composable
fun Cart(
text1:String,
text2:String,
onClick:() ->Unit,
image:Int,
modifier: Modifier = Modifier
    .height(169.dp).width(315.dp)

) {

        Card(
            modifier = modifier
                .clip(AbsoluteRoundedCornerShape(10.dp))
                .background(HomeScreen, AbsoluteRoundedCornerShape(0.dp)),// потом исправить
            shape = AbsoluteRoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
        ) {
            Box(modifier.fillMaxSize()) {
                Column(
                    Modifier
                        .padding(top = 30.dp, start = 24.dp, bottom = 22.dp)
                        .fillMaxWidth(0.55f)
                ) {
                    Text(
                        text1,
                        color = Color.White
                    )
                    Spacer(Modifier.height(14.dp))
                    Text(
                        text2,
                        color = Color.White
                    )
                    Spacer(Modifier.weight(1f))

                    Icon(
                        painterResource(R.drawable.arrow),
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.clickable { onClick() }
                    )
                }

                Image(
                    painterResource(image),
                    contentDescription = "",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth(0.60f)
                        .fillMaxHeight(0.75f)
                        .padding(bottom = 22.dp, end = 22.dp)
                        .align(Alignment.BottomEnd),
                    alignment = Alignment.BottomEnd
                )
            }
        }
    }

@Preview
@Composable
fun CartOften() {

Column(
    Modifier
        .fillMaxSize()
        .padding(horizontal = 16.dp),
    verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
    horizontalAlignment = Alignment.CenterHorizontally,

){
    Cart(
        "Schedule",
        "Easily schedule event/games then find like minded players for battle. You up for it?",
        {},
        image = R.drawable.onesreen
    )

    Cart(
        "Schedule",
        "Easily schedule event/games then find like minded players for battle. You up for it?",
        {},
        image = R.drawable.onesreen
    )

    Cart(
        "Schedule",
        "Easily schedule event/games then find like minded players for battle. You up for it?",
        {},
        image = R.drawable.onesreen
    )
}
}