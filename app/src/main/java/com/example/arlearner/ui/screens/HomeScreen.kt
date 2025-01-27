package com.example.arlearner.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.arlearner.ui.screens.navigaiton.AlphabetScreen
import com.example.arlearner.ui.screens.navigaiton.HomeScreen
import com.example.arlearner.ui.screens.navigaiton.QuizScreen

@Composable
fun HomeScreen(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Button(
            onClick = { navController.navigate(AlphabetScreen) }
        ) {
            Text(text = "Alphabets")
        }
        Button(
            onClick = { navController.navigate(QuizScreen) }
        ) {
            Text(text = "Quiz")
        }
    }
}