
package com.example.tugas5pam.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext


private val DarkColorScheme = darkColorScheme(
    primary = TealMedium,
    secondary = TealButtonLight,
    background = Color(0xFF00251A),
    surface = Color(0xFF004D40),
    onPrimary = White,
    onSecondary = White,
    onBackground = TealAppBg,
    onSurface = TealAppBg
)


private val LightColorScheme = lightColorScheme(
    primary = TealMedium,
    secondary = TealButtonLight,
    background = TealAppBg,
    surface = TealFieldBg,
    onPrimary = White,
    onSecondary = White,
    onBackground = TextGrey,
    onSurface = Black
)

@Composable
fun Tugas5PAMTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),

    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}