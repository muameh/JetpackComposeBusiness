package com.mehmetbaloglu.jetpackcomposelessonsbeginnerlevel

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun SonucEkranı(navController: NavController,gelenSonuc:Boolean) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {

        if (gelenSonuc == true){
            Text(
                text = "Kazandınız !",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                color = Color(0xFF713713),
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(10.dp),
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(id = R.drawable.baseline_tag_faces_24),
                contentDescription = "resim açıklaması buraya"
            )
        } else {
            Text(
                text = "Kaybettiniz !",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                color = Color(0xFF713713),
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(10.dp),
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(id = R.drawable.baseline_sentiment_very_dissatisfied_24),
                contentDescription = "resim açıklaması buraya",
                modifier = Modifier.size(200.dp)
            )
        }


    }
}
