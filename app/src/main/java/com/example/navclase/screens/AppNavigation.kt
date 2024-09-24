package com.example.navclase.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navclase.data.ContactoVM

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screen_a") {
        // Compartir el mismo ViewModel entre ambas pantallas
        composable("screen_a") {
            val viewModel: ContactoVM = viewModel()
            ScreenA(navController = navController, viewModel = viewModel)
        }
        composable("screen_b") {
            val viewModel: ContactoVM = viewModel()
            ScreenB(navController = navController, viewModel = viewModel)
        }
    }
}


