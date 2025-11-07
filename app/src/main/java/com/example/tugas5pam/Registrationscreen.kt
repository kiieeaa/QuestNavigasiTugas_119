package com.example.tugas5pam

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugas5pam.ui.theme.* // Import warna
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

@Composable
fun RegistrationScreen(navController: NavController) {

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var statusPerkawinan by remember { mutableStateOf("") }

    // Opsi untuk Radio Button
    val jenisKelaminOptions = listOf("Laki-laki", "Perempuan")
    val statusPerkawinanOptions = listOf("Janda", "Lajang", "Duda")

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(TealAppBg)
            .verticalScroll(rememberScrollState())
    ) {
        // Header
        AppHeader(title = "Formulir Pendaftaran")
        Column(modifier = Modifier.padding(24.dp)) {


            Text(text = "NAMA LENGKAP", color = TextGrey, fontSize = 14.sp)
            CustomTextField(
                value = nama,
                onValueChange = { nama = it },
                hint = "Isian nama lengkap",
                modifier = Modifier.padding(top = 8.dp)
            )


            Text(text = "JENIS KELAMIN", color = TextGrey, fontSize = 14.sp, modifier = Modifier.padding(top = 16.dp))
            jenisKelaminOptions.forEach { option ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = (jenisKelamin == option),
                            onClick = { jenisKelamin = option }
                        )
                        .padding(vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = (jenisKelamin == option),
                        onClick = { jenisKelamin = option }
                    )
                    Text(text = option, modifier = Modifier.padding(start = 8.dp))
                }
            }


            Text(text = "STATUS PERKAWINAN", color = TextGrey, fontSize = 14.sp, modifier = Modifier.padding(top = 16.dp))
            statusPerkawinanOptions.forEach { option ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = (statusPerkawinan == option),
                            onClick = { statusPerkawinan = option }
                        )
                        .padding(vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = (statusPerkawinan == option),
                        onClick = { statusPerkawinan = option }
                    )
                    Text(text = option, modifier = Modifier.padding(start = 8.dp))
                }
            }


            Text(text = "ALAMAT", color = TextGrey, fontSize = 14.sp, modifier = Modifier.padding(top = 16.dp))
            CustomTextField(
                value = alamat,
                onValueChange = { alamat = it },
                hint = "Alamat",
                modifier = Modifier.padding(top = 8.dp)
            )


            Button(
                onClick = {