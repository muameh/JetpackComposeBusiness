package com.mehmetbaloglu.jetpackcomposelessonsbeginnerlevel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

    var number = remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        
        Text(text = number.value.toString(),Modifier.padding(10.dp))
        
        Text(text = "Add", modifier = Modifier.clickable {
                number.value++

        }, color = Color.Red)

    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SampleText()
}