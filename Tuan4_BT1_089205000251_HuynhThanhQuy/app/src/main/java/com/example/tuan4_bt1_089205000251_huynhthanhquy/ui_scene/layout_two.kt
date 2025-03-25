package com.example.tuan4_bt1_089205000251_huynhthanhquy.ui_scene

import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun Scene2(navController: NavController? = null, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
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
                text = "LazyColumn",
                fontSize = 24.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF2196F3),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp)
            )
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp) // Khoảng cách ngoài cùng
        ) {
            items(100) { i ->
                val index = i + 1
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp) // Khoảng cách giữa các hàng
                        .background(Color(0xB22196F3), shape = RoundedCornerShape(12.dp)) // Bo góc
                        .padding(16.dp) // Padding bên trong
                ) {
                    Text(
                        text = "${String.format("%02d", index)} | The only way to do great work is to love what you do.",
                        fontSize = 18.sp,
                        modifier = Modifier
                            .weight(1f) // Đẩy icon ra bên phải
                            .padding(end = 8.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.icon_next),
                        contentDescription = "Icon Right",
                        modifier = Modifier
                            .size(40.dp) // Điều chỉnh kích thước icon
                            .clickable(
                                onClick = { navController?.navigate("Scene3") }
                            )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewScene2(){
    Scene2()
}