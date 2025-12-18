package com.farhan.vortrexyn.silentsignal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.farhan.vortrexyn.silentsignal.ui.auth.LoginScreen
import com.farhan.vortrexyn.silentsignal.ui.auth.SignupScreen
import com.farhan.vortrexyn.silentsignal.ui.auth.ForgotPasswordScreen
import com.farhan.vortrexyn.silentsignal.ui.home.HomeScreen
import com.farhan.vortrexyn.silentsignal.ui.profile.ProfileScreen
import com.farhan.vortrexyn.silentsignal.ui.settings.SettingsScreen
import com.farhan.vortrexyn.silentsignal.ui.splash.SplashScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") { SplashScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("signup") { SignupScreen(navController) }
        composable("forgot") { ForgotPasswordScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
        composable("settings") { SettingsScreen(navController) }
    }
}
