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
    NavHost(navController = navController, startDestination = Screen.Splash.route) {


        composable(Screen.Splash.route) {
            SplashScreen(navController = navController)
        }


        composable(Screen.Registration.route) {
            RegistrationScreen(navController = navController)
        }


        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument("nama") { type = NavType.StringType },
                navArgument("kelamin") { type = NavType.StringType },
                navArgument("status") { type = NavType.StringType },
                navArgument("alamat") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val nama = backStackEntry.arguments?.getString("nama") ?: ""
            val kelamin = backStackEntry.arguments?.getString("kelamin") ?: ""
            val status = backStackEntry.arguments?.getString("status") ?: ""
            val alamat = backStackEntry.arguments?.getString("alamat") ?: ""

            DetailsScreen(
                navController = navController,
                nama = nama,
                kelamin = kelamin,
                status = status,
                alamat = alamat
            )
        }
    }
}

