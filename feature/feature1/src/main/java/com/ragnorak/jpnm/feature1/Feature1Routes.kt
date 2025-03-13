package com.ragnorak.jpnm.feature1

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ragnorak.jpnm.navigation.Feature1

fun NavGraphBuilder.feature1Routes(navController: NavController) {

    composable<Feature1> {
        Feature1Screen(navController = navController)
    }

    composable<PrivateFeature1> {
        PrivateFeature1Screen()
    }
}