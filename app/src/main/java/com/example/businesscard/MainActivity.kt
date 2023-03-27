package com.example.businesscard


import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Call
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
                    color = MaterialTheme.colors.background
                ) {
                    Business()
                }
            }
        }
    }
}



@Composable
private fun Business() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .background(Color.Magenta)

    ) {

        val image = painterResource(R.drawable.android_logo)
        Image(painter = image, contentDescription = null)

        Text(
            text = stringResource(R.string.name),
            //color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 34.sp

        )
        Text(
            text = stringResource(R.string.role),
            fontSize = 24.sp,
            color = Color.Green,
            modifier = Modifier.padding(bottom=16.dp)
        )
        Column {
            Row{
                Icon(
                    modifier = Modifier.padding(top = 10.dp),
                    imageVector= Icons.Filled.Call,
                    contentDescription = "Contact"
                )
                Text(
                    text = stringResource(R.string.contact),
                    //color = Color.White,
                    modifier = Modifier.padding(top = 10.dp,start=10.dp),
                    fontSize = 18.sp
                )
            }
            Row{
                Icon(
                    modifier = Modifier.padding(top = 10.dp),
                    imageVector= Icons.Filled.Share,
                    contentDescription = "Contact"
                )
                Text(
                    text = stringResource(R.string.share),
                    //color = Color.White,
                    modifier = Modifier.padding(top = 10.dp,start=10.dp),
                    fontSize = 18.sp
                )
            }
            Row{
                Icon(
                    modifier = Modifier.padding(top = 10.dp),
                    imageVector= Icons.Filled.Email,
                    contentDescription = "Contact"
                )
                Text(
                    text = stringResource(R.string.email),
                    //color = Color.White,
                    modifier = Modifier.padding(top = 10.dp,start=10.dp),
                    fontSize = 18.sp
                )
            }

        }



    }
}






@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Business()
    }
}