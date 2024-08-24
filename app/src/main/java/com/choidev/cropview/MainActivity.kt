package com.choidev.cropview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.createBitmap
import com.choidev.cropview.ui.theme.CropViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CropViewTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                 CropView(
                     modifier = Modifier.padding(innerPadding),
                     imageBitmap =            createBitmap(100,100).asImageBitmap(),
                     cropStrokeColor = Color.Black,
                     cropStrokeWidth = 12.dp,
                     onCrop =  { imageBitmap, b, s ->

                     },
                     onRequestCrop = false
                 )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CropViewTheme {
        Greeting("Android")
    }
}