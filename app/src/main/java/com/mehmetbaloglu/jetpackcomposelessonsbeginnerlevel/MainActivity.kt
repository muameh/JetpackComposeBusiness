package com.mehmetbaloglu.jetpackcomposelessonsbeginnerlevel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.mehmetbaloglu.jetpackcomposelessonsbeginnerlevel.ui.theme.JetpackComposeLessonsBeginnerLevelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeLessonsBeginnerLevelTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    sayfaGecisleri()
                }

            }
        }
    }
}

@Composable
fun GirisEkrani(navController: NavController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Tahmin Oyunu",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Color(0xFF713713),
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(10.dp),
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(id = R.drawable.baseline_casino_24),
            contentDescription = "resim açıklaması buraya"
        )
        Button(
            onClick = { navController.navigate("tahminEkrani") },
            colors = ButtonDefaults.buttonColors(Color(0xDD713713)),
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier.size(250.dp, 50.dp)
        ) {
            Text(
                text = "Oyuna başla", fontSize = 20.sp, color = Color.White
            )
        }
    }
}

@Composable
fun sayfaGecisleri(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "girisEkrani"){
        composable("girisEkrani"){
            GirisEkrani(navController)
        }
        composable("tahminEkrani"){
            TahminEkranı(navController)
        }
        composable("sonucEkrani/{sonuc}",
            arguments = listOf(navArgument("sonuc"){type = NavType.BoolType})){
            var sonuc = it.arguments?.getBoolean("sonuc")
            SonucEkranı(navController, gelenSonuc = sonuc!!)
        }
    }

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeLessonsBeginnerLevelTheme {

    }
}



