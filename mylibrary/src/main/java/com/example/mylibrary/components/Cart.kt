import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
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
    text1: String,
    text2: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    // 1. Контейнер с фиксированными размерами как в Figma
    Box(
        modifier = modifier
            .width(315.dp)
            .height(169.dp)
            .clip(AbsoluteRoundedCornerShape(10.dp))
            .background(HomeScreen) // Заливаем градиентом
    ) {
        // 2. Текстовая часть (слева)
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(170.dp) // Фиксированная ширина, чтобы текст не налезал на картинку
                .padding(start = 20.dp, top = 24.dp, bottom = 24.dp), // Отступы как в Figma
            verticalArrangement = Arrangement.SpaceBetween // Распределяем текст и стрелку
        ) {
            Column {
                Text(
                    text = text1,
                    fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = text2,
                    fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 16.sp, // Межстрочный интервал
                    color = Color.White
                )
            }

            // 3. Иконка стрелки (внизу)
            Icon(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "Перейти",
                tint = Color.White,
                modifier = Modifier
                    .size(24.dp)
                    .clickable { onClick() } // Клик только по стрелке
            )
        }

        // 4. Картинка справа (девушка с часами)
        Image(
            painter = painterResource(id = R.drawable.onesreen),
            contentDescription = null,
            contentScale = ContentScale.Crop, // Crop обрезает картинку, если она не влезает
            modifier = Modifier
                .align(Alignment.BottomEnd) // Прижимаем в правый нижний угол
                .width(150.dp) // Задаем ширину картинки
                .fillMaxHeight(0.9f) // Высота 90% от карточки (чтобы не прилипала к верху)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CartOften() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Cart(
            text1 = "Schedule",
            text2 = "Easily schedule event/games then find like minded players for battle. You up for it?",
            onClick = {}
        )
    }
}