package com.example.tuan3_bai2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.tuan3_bai2.ui.theme.Tuan3_Bai2Theme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tuan3_Bai2Theme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun Scene1(navController: NavController? = null, destination: String, modifier: Modifier = Modifier){
    LaunchedEffect(Unit) {
        delay(2000)
        navController?.navigate(destination) {
            popUpTo("Scene1") { inclusive = true }
        }
    }
    val image = painterResource(id = R.drawable.uth)
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = image,
            alignment = Alignment.Center,
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
        )
        Text(
            text = "UTH SmartTasks",
            modifier = Modifier
                .fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF55C1FF)
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun Scene2(navController: NavController? = null, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp), // Đẩy toàn bộ hàng xuống một chút
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.weight(1f).padding(start = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp) // Tạo khoảng cách giữa các hình tròn
            ) {
                Canvas(modifier = Modifier.size(15.dp)) {
                    drawCircle(color = Color.Blue, radius = size.minDimension / 2)
                }
                Canvas(modifier = Modifier.size(15.dp)) {
                    drawCircle(color = Color.Gray, radius = size.minDimension / 2)
                }
                Canvas(modifier = Modifier.size(15.dp)) {
                    drawCircle(color = Color.Gray, radius = size.minDimension / 2)
                }
            }

            Text(
                text = "skip",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF55C1FF),
                fontSize = 20.sp,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 16.dp, bottom = 8.dp) // Tạo khoảng cách với mép phải
                    .clickable { navController?.navigate("Scene1?destination=Scene4") }
            )
        }
        Spacer(modifier = Modifier.weight(0.4f))
        Image(
            painter = painterResource(id = R.drawable.bro),
            alignment = Alignment.Center,
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .fillMaxWidth()
        )
        Text(
            text = "Easy Time Management",
            modifier = Modifier
                .fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
        )
        Text(
            text = "With management based on priority and daily tasks, it will give you convenience in managing and determining the tasks that must be done first ",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Button (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            onClick = { navController?.navigate("Scene1?destination=Scene3")},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF55C1FF)
            )
        ) {
            Text(
                text = "Next",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun Scene3(navController: NavController? = null, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp), // Đẩy toàn bộ hàng xuống một chút
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.weight(1f).padding(start = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp) // Tạo khoảng cách giữa các hình tròn
            ) {
                Canvas(modifier = Modifier.size(15.dp)) {
                    drawCircle(color = Color.Gray, radius = size.minDimension / 2)
                }
                Canvas(modifier = Modifier.size(15.dp)) {
                    drawCircle(color = Color.Blue, radius = size.minDimension / 2)
                }
                Canvas(modifier = Modifier.size(15.dp)) {
                    drawCircle(color = Color.Gray, radius = size.minDimension / 2)
                }
            }

            Text(
                text = "skip",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF55C1FF),
                fontSize = 20.sp,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .align(Alignment.CenterVertically) // Căn giữa theo chiều dọc với hình tròn
                    .padding(end = 16.dp, bottom = 8.dp) // Tạo khoảng cách với mép phải
                    .clickable { navController?.navigate("Scene1?destination=Scene4") }
            )
        }
        Spacer(modifier = Modifier.weight(0.4f))
        Image(
            painter = painterResource(id = R.drawable.bro2),
            alignment = Alignment.Center,
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .fillMaxWidth()
        )
        Text(
            text = "Increase Work Effectiveness",
            modifier = Modifier
                .fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
        )
        Text(
            text = "Time management and the determination of more important tasks will give your job statistics better and always improve",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.iconback),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.CenterVertically)
                    .clickable { navController?.navigate("Scene1?destination=Scene2") }
            )
            Button (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                onClick = { navController?.navigate("Scene1?destination=Scene4")},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF55C1FF)
                )
            ) {
                Text(
                    text = "Next",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun Scene4(navController: NavController? = null, modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp), // Đẩy toàn bộ hàng xuống một chút
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.weight(1f).padding(start = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp) // Tạo khoảng cách giữa các hình tròn
            ) {
                Canvas(modifier = Modifier.size(15.dp)) {
                    drawCircle(color = Color.Gray, radius = size.minDimension / 2)
                }
                Canvas(modifier = Modifier.size(15.dp)) {
                    drawCircle(color = Color.Gray, radius = size.minDimension / 2)
                }
                Canvas(modifier = Modifier.size(15.dp)) {
                    drawCircle(color = Color.Blue, radius = size.minDimension / 2)
                }
            }

            Text(
                text = "skip",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF55C1FF),
                fontSize = 20.sp,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .align(Alignment.CenterVertically) // Căn giữa theo chiều dọc với hình tròn
                    .padding(end = 16.dp, bottom = 8.dp) // Tạo khoảng cách với mép phải
                    .clickable { navController?.navigate("Scene1?destination=Scene4") }
            )
        }
        Spacer(modifier = Modifier.weight(0.4f))
        Image(
            painter = painterResource(id = R.drawable.bro3),
            alignment = Alignment.Center,
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .fillMaxWidth()
        )
        Text(
            text = "Reminder Notification",
            modifier = Modifier
                .fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
        )
        Text(
            text = "The advantage of this application is that it also provides reminders for you so you don't forget to keep doing your assignments well and according to the time you have set",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.iconback),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.CenterVertically)
                    .clickable { navController?.navigate("Scene1?destination=Scene3") }
            )
            Button (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                onClick = { navController?.navigate("Scene1?destination=Scene4")},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF55C1FF)
                )
            ) {
                Text(
                    text = "Get Started",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Scene1") {
        composable("Scene1?destination={destination}") { backStackEntry ->
            val destination = backStackEntry.arguments?.getString("destination") ?: "Scene2"
            Scene1(navController, destination)
        }
        composable("Scene2") { Scene2(navController) }
        composable("Scene3") { Scene3(navController) }
        composable("Scene4") { Scene4(navController) }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tuan3_Bai2Theme {
//        Scene1()
//        Scene2()
//        Scene3()
//        Scene4()
    }
}