
package com.example.tugas5pam

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas5pam.ui.theme.*
import com.example.tugas5pam.R


@Composable
fun AppHeader(title: String) {
    Text(
        text = title,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .background(TealMedium)
            .padding(20.dp)
            .padding(top = 30.dp),
        textAlign = TextAlign.Center
    )
}


@Composable
fun DetailField(label: String, value: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .background(TealFieldBg)
            .padding(16.dp)

    ) {
        Text(
            text = label,
            color = TextGrey,
            fontSize = 14.sp
        )
        Text(
            text = value,
            color = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 4.dp),
            fontFamily = FontFamily.Cursive



        )

    }
}