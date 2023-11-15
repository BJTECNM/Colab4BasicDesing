package com.laraknife.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.laraknife.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {

    /*
    Hecho por Brayan Josue Hernández Lara (LaraKnife)
    Domingo 19 de Noviembre de 2023
    Número de control: 192T0220
    Materia: Desarrollo de aplicaciones móviles
    Ingeniería en Sistemas Computacionales
    Noveno Semestre
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}

@Composable
private fun TarjetaPresentacion() {
    Column(
        Modifier.fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFFD2E8D4)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Profile picture",
            modifier = Modifier
                .background(Color(0xFF073143))
                .width(110.dp)
                .height(110.dp)
        )
        Text(
            text = stringResource(R.string.account_name),
            Modifier.padding(top = 4.dp),
            fontSize = 40.sp,
            color = Color.Black
        )
        Text(
            text = stringResource(R.string.puesto),
            Modifier.padding(top = 8.dp),
            color = Color(0xFF08703F),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Column(
            Modifier.fillMaxWidth()
                .fillMaxHeight(0.5f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    Icons.Default.Phone,
                    contentDescription = "Phone icon",
                    Modifier.padding(8.dp),
                    tint = Color(0xFF08703F)
                )
                Text(
                    text = stringResource(R.string.account_phone),
                    Modifier.padding(8.dp),
                    fontSize = 20.sp
                )
            }
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    Icons.Default.Share,
                    contentDescription = "Share icon",
                    Modifier.padding(8.dp),
                    tint = Color(0xFF08703F)
                )
                Text(
                    text = stringResource(R.string.account_page),
                    Modifier.padding(8.dp),
                    fontSize = 20.sp)
            }
            Row(
                Modifier.fillMaxWidth()
                    .padding(bottom = 32.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    Icons.Default.Email,
                    contentDescription = "Email icon",
                    Modifier.padding(8.dp),
                    tint = Color(0xFF08703F)
                )
                Text(
                    text = stringResource(R.string.account_email),
                    Modifier.padding(8.dp),
                    fontSize = 20.sp
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TarjetaPreview() {
    TarjetaPresentacionTheme {
        TarjetaPresentacion()
    }
}