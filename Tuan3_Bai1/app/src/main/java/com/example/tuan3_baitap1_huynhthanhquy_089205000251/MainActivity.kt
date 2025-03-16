package com.example.tuan3_baitap1_huynhthanhquy_089205000251

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tuan3_baitap1_huynhthanhquy_089205000251.ui.theme.Tuan3_BaiTap1_HuynhThanhQuy_089205000251Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavigation()
        }
    }
}

// Scene one
@Composable
fun SceneOne(navController: NavController? = null,modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.icon_)
    Column (
        modifier = modifier.padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.padding(top = 80.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
                .size(200.dp),
            alignment = Alignment.Center

            )
        Text(
            text = "Jetpack Compose",
            modifier = Modifier.padding(4.dp)
                .height(50.dp)
                .width(200.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
        Text(
            text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(4.dp)
                .fillMaxWidth(),
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { navController?.navigate("SceneTwo") },
            modifier = Modifier.padding(4.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF69E8FF)
            )
        ) {
            Text(text = "I'm Ready")
        }
    }
}

// SectionTitle
@Composable
fun SectionTitle(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        fontSize = 20.sp,
        modifier = modifier.padding(top = 16.dp, bottom = 8.dp)
            .fillMaxWidth(),
        fontWeight = FontWeight.Bold
    )
}

// ComponentCard
@Composable
fun ComponentCard(title: String, description: String, modifier: Modifier = Modifier){
    Card(
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFD0E8FF)),
       modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
    ) {
        Column(
            modifier = Modifier.padding(4.dp)
        ){
            Text(text = title, fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text(text = description, fontSize = 20.sp)
        }
    }
}

// SceneTwo
@Composable
fun SceneTwo(navController: NavController? = null, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.padding(8.dp)
            .fillMaxHeight()
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "UI Components List",
            fontWeight = FontWeight.Black,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp).fillMaxWidth(),
            style = androidx.compose.ui.text.TextStyle(textAlign = TextAlign.Center)
        )

        SectionTitle(title = "Display")
        ComponentCard(title = "Text", description = "Displays text")
        ComponentCard(title = "Image", description = "Displays an image")

        SectionTitle(title = "Input")
        ComponentCard(title = "TextField", description = "Input field for text")
        ComponentCard(title = "PasswordField", description = "Input field for password")

        SectionTitle(title = "Layout")
        ComponentCard(title = "Column", description = "Arranges elements vertically")
        ComponentCard(title = "Row", description = "Arranges elements horizontally")

        Button(
            onClick = { navController?.navigate("SceneThree") },
            modifier = Modifier.padding(4.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF69E8FF)
            )
        ) {
            Text(text = "Text Detail")
        }

        Button(
            onClick = { navController?.navigate("SceneOne") },
            modifier = Modifier.padding(4.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF69E8FF)
            )
            ) {
            Text(text = "Back")
        }
    }
}

@Composable
fun SceneThree(navController: NavController? = null, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start // Canh ve phia ben trai
        ){
            IconButton(onClick = {navController?.popBackStack()}){
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Cyan
                )
            }
            // Tiêu đề luôn ở trên đầu
            Text(
                text = "Text Detail",
                color = Color.Cyan,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, end = 20.dp)
            )
        }

        Spacer(modifier = Modifier.weight(1f)) // Đẩy nội dung xuống giữa màn hình

        // Đoạn văn bản căn giữa màn hình
        Text(
            text = buildAnnotatedString {
                append("The ")

                pushStyle(SpanStyle(textDecoration = TextDecoration.LineThrough))
                append("quick")
                pop()

                append(" ")

                pushStyle(SpanStyle(color = Color(0xFFFF9800), fontWeight = FontWeight.Bold))
                append("Brown")
                pop()

                append("\nfox j u m p s ")

                pushStyle(SpanStyle(fontWeight = FontWeight.Bold))
                append("over")
                pop()

                append("\nthe ")

                pushStyle(SpanStyle(fontStyle = FontStyle.Italic, textDecoration = TextDecoration.Underline))
                append("lazy")
                pop()

                append(" dog.")
            },
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp) // Căn chỉnh văn bản đẹp hơn
        )

        Spacer(modifier = Modifier.weight(1f)) // Đẩy văn bản lên giữa màn hình
    }
}

// AppNavigation
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "SceneOne") {
        composable("SceneOne") { SceneOne(navController) }
        composable("SceneTwo") { SceneTwo(navController) }
        composable("SceneThree") { SceneThree(navController) }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview1() {
    Tuan3_BaiTap1_HuynhThanhQuy_089205000251Theme {
        //SceneOne()
        SceneTwo()
        //sceneThree()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2(){
    Tuan3_BaiTap1_HuynhThanhQuy_089205000251Theme {
        SceneThree()
    }
}