package com.example.tuan4_bt1_089205000251_huynhthanhquy.ui_scene

import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tuan4_bt1_089205000251_huynhthanhquy.R

@Composable
fun Scene1 (navController: NavController? = null, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.icon_jetpackcompose),
            contentDescription = "Icon Jetpack Compose",
            modifier = Modifier.size(200.dp)
                .fillMaxWidth()
        )
        Text(
            text = "Navigation",
            fontSize = 24.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "is a framework that simplifies the implementation of navigation between different UI components (activities, fragments, or composables) in an app",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
                .padding(16.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = { navController?.navigate("Scene2") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2196F3),
                contentColor = androidx.compose.ui.graphics.Color.White
            ),
            modifier = Modifier.padding(top = 16.dp)
                .fillMaxWidth()
                .padding(horizontal = 34.dp)
                .height(50.dp)
        ) {
            Text(
                text = "PUSH"
            )
        }
    }
}

@Preview (showBackground = true)
@Composable
fun previewScene1(){
    Scene1()
}