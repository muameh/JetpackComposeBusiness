package com.mehmetbaloglu.jetpackcomposelessonsbeginnerlevel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mehmetbaloglu.jetpackcomposelessonsbeginnerlevel.ui.theme.JetpackComposeLessonsBeginnerLevelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeLessonsBeginnerLevelTheme {
                SampleText()
            }
        }
    }
}

@Composable
fun SampleText() {

    var number = remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = number.value.toString(), fontSize = 25.sp, color = Color.Black
        )

        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            OutlinedButton(
                onClick = { number.value-- },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(33f)
                    .padding(3.dp)
            ) {
                Text(text = "çıkar")
            }

            Button(
                onClick = { number.value++ },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(33f)
                    .padding(3.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White
                )
            )

            {
                Text(text = "artır")
            }
            Button(
                onClick = { number.value++ },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(33f)
                    .padding(3.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White
                )
            )

            {
                Text(text = "artır")
            }

        }



    }


}


