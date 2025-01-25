package com.example.arlearner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.arlearner.ui.screens.navigaiton.ARScreen
import com.example.arlearner.ui.screens.navigaiton.AlphabetScreen
import com.example.arlearner.ui.screens.navigaiton.HomeScreen
import com.example.arlearner.ui.screens.navigaiton.QuizScreen
import com.example.arlearner.ui.theme.ARLearnerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ARLearnerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = HomeScreen,
                        modifier = Modifier.padding(innerPadding)
                    ){
                        composable<HomeScreen>{

                        }
                        composable<ARScreen> {

                        }
                        composable<AlphabetScreen> {

                        }
                        composable<QuizScreen> {

                        }
                    }
                }
            }
        }
    }
}

