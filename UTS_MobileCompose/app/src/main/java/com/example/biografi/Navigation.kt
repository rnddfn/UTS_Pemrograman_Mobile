package com.example.biografi

import HomeScreen
import androidx.annotation.NavigationRes
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home_Screen") {
        composable(route = "home_Screen") {
            HomeScreen(navController)
        }
        composable(route = "detail_Screen") {
            DetailScreen()
        }
    }
}