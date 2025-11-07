package com.example.tugas5pam

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Registration : Screen("registration_screen")


    object Details : Screen("details_screen/{nama}/{kelamin}/{status}/{alamat}") {
        fun createRoute(nama: String, kelamin: String, status: String, alamat: String): String {
            return "details_screen/$nama/$kelamin/$status/$alamat"
        }
    }
}
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
