package com.example.kmpcurso

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kmpcurso.ui.theme.KMPCursoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KMPCursoTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        CustomText(
                            modifier = Modifier
                                .wrapContentSize()
                                .background(Color.Gray),
                            texto = "Hola mundo",
                            fontSize = 25.sp
                        )

                        CustomText(
                            modifier = Modifier
                                .wrapContentSize()
                                .background(Color.Gray),
                            texto = "Hola mundo",
                            fontSize = 25.sp
                        )

                        CustomText(
                            modifier = Modifier
                                .wrapContentSize()
                                .background(Color.Gray),
                            texto = "Hola mundo",
                            fontSize = 25.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CustomText(modifier: Modifier, texto: String, fontSize: TextUnit) {
    Text(
        text = texto,
        color = Color.Red,
        modifier = modifier,
        fontSize = fontSize,
        fontWeight = FontWeight.Bold
    )
}


@Preview(showBackground = true)
@Composable
fun CustomPreview() {
    KMPCursoTheme {
        CustomText(
            modifier = Modifier
                .wrapContentSize()
                .background(Color.Gray),
            texto = "Hola mundo",
            fontSize = 25.sp
        )
    }
}