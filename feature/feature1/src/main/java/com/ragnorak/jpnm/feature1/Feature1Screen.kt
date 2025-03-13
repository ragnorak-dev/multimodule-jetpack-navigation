package com.ragnorak.jpnm.feature1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.ragnorak.jpnm.navigation.Feature2

@Composable
internal fun Feature1Screen(
    navController: NavController
) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(text = "This is feature 1 screen")
            Button(
                onClick = {
                    navController.navigate(Feature2)
                }
            ) {
                Text(text = "Navigate to feature 2")
            }
            Button(
                onClick = { navController.navigate(PrivateFeature1) }
            ) {
                Text(text = "Navigate to private feature 1")
            }
        }
    }
}