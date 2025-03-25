package com.example.tuan4_bt1_089205000251_huynhthanhquy.ui_scene

import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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
fun Scene3(navController: NavController? = null, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Image(
                painter = painterResource(id = R.drawable.icon_back),
                contentDescription = "Icon Back",
                modifier = Modifier.size(50.dp)
                    .padding(8.dp)
                    .clickable(
                        onClick = { navController?.popBackStack() }
                    )
            )
            Text(
                text = "Detail",
                fontSize = 24.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF2196F3),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp)
            )
        }
        Text(
            text = "“The only way to do great work is to love what you do”",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 20.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.img_steve_jobs_talk),
            contentDescription = "Icon Steve Jobs",
            alignment = Alignment.Center,
            modifier = Modifier.size(500.dp)
                .padding(16.dp)
                .fillMaxWidth(),
        )

        // Spacer để đẩy button xuống đáy
        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = ({ navController?.navigate("Scene1") }),
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2196F3),
                contentColor = androidx.compose.ui.graphics.Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 75.dp, start = 24.dp, end = 24.dp)
                .height(50.dp)
        ) {
            Text(
                text = "Back to Root",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewScene3(){
    Scene3()
}