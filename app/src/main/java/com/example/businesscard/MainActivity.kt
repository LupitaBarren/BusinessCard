package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreateBizCard()
                }
            }
        }
    }
}

@Composable
fun CreateBizCard() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF073042)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        val image = painterResource(id = R.drawable.icon)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
        Text(text = "Full Name", color = Color.White, fontSize = 32.sp)
        Text(text = "Title", color = Color(0xFF4ddc84))
    }

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 50.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom) {
        HorizontalDivider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp)) {
            Text(text = "Phone: +00 (00) 000 000",
                color = Color.White,
                modifier = Modifier.padding(8.dp))
        }

        HorizontalDivider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp)) {
            Text(text = "Social Media: @socialmediahandle",
                color = Color.White,
                modifier = Modifier.padding(8.dp))
        }

        HorizontalDivider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp)) {
            Text(text = "E-Mail: email@domail.com",
                color = Color.White,
                modifier = Modifier.padding(8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        CreateBizCard()
    }
}