package com.example.tugas5pam

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugas5pam.ui.theme.*


@Composable
fun DetailsScreen(
    navController: NavController,
    nama: String,
    kelamin: String,
    status: String,
    alamat: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(TealAppBg)
            .verticalScroll(rememberScrollState())
    ) {

        AppHeader(title = "List Daftar Peserta")


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Column {
                DetailField(label = "NAMA LENGKAP", value = nama)

                Spacer(modifier = Modifier.height(16.dp))
                DetailField(label = "JENIS KELAMIN", value = kelamin)

                Spacer(modifier = Modifier.height(16.dp))
                DetailField(label = "STATUS PERKAWINAN", value = status)

                Spacer(modifier = Modifier.height(16.dp))
                DetailField(label = "ALAMAT", value = alamat)
            }


            Column(modifier = Modifier.padding(top = 32.dp)) {
                Button(
                    onClick = {
                        navController.navigate(Screen.Splash.route) {
                            popUpTo(Screen.Splash.route) { inclusive = true }
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = TealMedium)
                ) {
                    Text(text = "Beranda", color = Color.White, fontSize = 16.sp)
                }
            }
            }