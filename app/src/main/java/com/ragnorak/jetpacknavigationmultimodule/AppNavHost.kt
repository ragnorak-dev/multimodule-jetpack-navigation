package com.ragnorak.jetpacknavigationmultimodule

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.ragnorak.jpnm.feature1.feature1Routes
import com.ragnorak.jpnm.feature2.feature2Routes
import com.ragnorak.jpnm.navigation.Main
import com.ragnorak.jpnm.navigation.Route

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: Route = Main,

    ) {
    NavHost(navController = navController,
        startDestination = startDestination
    ) {
        mainRoutes(navController = navController)
        feature1Routes(navController = navController)
        feature2Routes(navController = navController)
    }

}