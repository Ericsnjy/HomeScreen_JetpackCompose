package com.example.homescreen

import android.graphics.drawable.RotateDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.TopEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.DefaultStrokeLineWidth
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homescreen.ui.theme.HomeScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {
    var googleSearch by remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier.fillMaxSize())
    {
       Image(modifier = Modifier.fillMaxSize(),
           painter = painterResource(id = R.drawable.bgeric),
                   contentDescription = "background",
           contentScale = ContentScale.Crop
       )

    Row(modifier= Modifier
        .fillMaxSize(),
//        .padding(25.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Absolute.SpaceBetween)

        {
        Text(
            text = "07:28",
            fontSize = 48.sp,
            color = Color.White,
            modifier = Modifier
                .clickable {}
                .padding(horizontal = 25.dp, vertical = 25.dp)
        )

        Image(modifier = Modifier
            .size(120.dp)
            .padding(horizontal = 30.dp, vertical = 30.dp),
            painter = painterResource(id = R.drawable.awan),
            contentDescription = "Cuaca"
        )


        }

    Row(modifier = Modifier
        .fillMaxSize(),
//        .padding(80.dp)
//        .padding(horizontal = 25.dp, vertical = 80.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween
    )
        {
        Text(
            text = "Sab, 09 Maret",
            fontSize = 10.sp,
            color = Color.White,
            modifier = Modifier
                .clickable {}
                .padding(horizontal = 25.dp, vertical = 80.dp)
                .alpha(0.6f)
            )

        Text(
            text = "Berkabut 25° C",
            fontSize = 10.sp,
            color = Color.White,
            modifier = Modifier
                .clickable {}
                .padding(horizontal = 30.dp, vertical = 75.dp)
                .alpha(0.6f)
            )
        }

        Row (
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 20.dp, horizontal = 20.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Absolute.SpaceEvenly
            )
        {
            Image(modifier = Modifier
                .clickable {}
                .size(60.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.ps),
                contentDescription = "Playstore"
            )

            Image(modifier = Modifier
                .clickable {}
                .size(60.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.pesan),
                contentDescription = "pesan"
            )

            Image(modifier = Modifier
                .clickable {}
                .size(60.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.kuncipng),
                contentDescription = "kunci"
            )

            Image(modifier = Modifier
                .clickable {}
                .size(60.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.telepon),
                contentDescription = "telepon"
            )

            Image(modifier = Modifier
                .clickable {}
                .size(60.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.kamera),
                contentDescription = "kamera"
            )
        }

    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(modifier = Modifier
                .rotate(90f)
                .padding(vertical = 90.dp),
                painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                contentDescription = "Panah"
            )
            }

        Box (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 350.dp)
            .size(height = 90.dp, width = 350.dp)
            .padding(top = 30.dp, start = 25.dp, end = 25.dp)
            .clip(RoundedCornerShape(40.dp))
            .background(Color.DarkGray)
            .alpha(0.5f)
        )
        {
            Row (modifier= Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
                



            ){
                Image(modifier = Modifier
                    .size(50.dp)
                    .padding(top = 15.dp, start = 10.dp),
                    painter = painterResource(id = R.drawable.gg),
                    contentDescription = "Google"
                )

                Image( modifier = Modifier.size(50.dp).padding(top = 10.dp),
                    painter = painterResource(id = R.drawable.mic) ,
                    contentDescription = "mic"
                )
            }


        }



    }

}
