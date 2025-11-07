// file: SplashScreen.kt
package com.example.tugas5pam // Sesuaikan package Anda

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugas5pam.ui.theme.* // Import semua warna Anda

@Composable
fun SplashScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Selamat Datang",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = TealDark,
            modifier = Modifier.padding(top = 80.dp)
        )

        // Ganti R.drawable.card_list_logo dengan logo Anda di folder res/drawable
        Image(
            painter = painterResource(id = R.drawable.logodepan), // Ganti ini
            contentDescription = "App Logo",
            modifier = Modifier
                .size(150.dp)
                .padding(top = 32.dp)
        )

        Text(
            text = "Dzakia Lailah Hamsa",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier.padding(top = 32.dp)
        )

        Text(
            text = "20230140119",
            fontSize = 18.sp,
            color = TextGrey,
            modifier = Modifier.padding(top = 8.dp)
        )

        Spacer(modifier = Modifier.weight(1f)) // Mendorong tombol ke bawah

        Button(
            onClick = {
                // Navigasi ke layar registrasi
                navController.navigate(Screen.Registration.route)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp)
                .height(50.dp),
            shape = RoundedCornerShape(25.dp),
            colors = ButtonDefaults.buttonColors(containerColor = TealMedium)
        ) {
            Text(text = "Submit", color = Color.White, fontSize = 16.sp)
        }
    }
}