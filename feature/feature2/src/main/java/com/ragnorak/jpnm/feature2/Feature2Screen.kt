package com.ragnorak.jpnm.feature2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
internal fun Feature2Screen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(text = "This is feature 2 screen")
            Button(
                onClick = { navController.navigate(PrivateFeature2) }
            ) {
                Text(text = "Navigate to private feature 2")
            }
        }
    }
}