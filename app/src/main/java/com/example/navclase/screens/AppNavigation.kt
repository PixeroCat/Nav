package com.example.navclase.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "screen_a"){
        composable("screen_a"){
            ScreenA(navController)
        }
        composable("screen_b"){
            ScreenB(navController)
        }

//        composable("screen_b/{nombre}/{apellido}/{email}/{contacto}"){ backStackEntry ->
//            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
//            val apellido = backStackEntry.arguments?.getString("apellido") ?: ""
//            val email = backStackEntry.arguments?.getString("email") ?: ""
//            val contacto = backStackEntry.arguments?.getString("contacto") ?: ""
//            ScreenB(navController, nombre, apellido, email, contacto)
//        }
    }
}


