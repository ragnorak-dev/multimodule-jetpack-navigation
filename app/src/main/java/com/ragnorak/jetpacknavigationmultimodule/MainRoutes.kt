package com.ragnorak.jetpacknavigationmultimodule

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ragnorak.jpnm.navigation.Feature1
import com.ragnorak.jpnm.navigation.Main

fun NavGraphBuilder.mainRoutes(navController: NavController) {

    composable<Main> {
        MainScreen {
            navController.navigate(Feature1)
        }
    }
}