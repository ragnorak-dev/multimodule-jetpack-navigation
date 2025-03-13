package com.ragnorak.jpnm.feature2

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.ragnorak.jpnm.navigation.Feature2

fun NavGraphBuilder.feature2Routes(navController: NavHostController) {

    composable<Feature2> {
        Feature2Screen(navController = navController)
    }

    composable<PrivateFeature2> {
        PrivateFeature2Screen()
    }
}