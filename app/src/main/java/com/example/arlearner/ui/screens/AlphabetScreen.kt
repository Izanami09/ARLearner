package com.example.arlearner.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi

import androidx.compose.foundation.layout.FlowRow

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.arlearner.ui.screens.navigaiton.ARScreen
import com.example.arlearner.ui.screens.navigaiton.AlphabetScreen
import kotlin.random.Random

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AlphabetScreen(
    navController: NavController
){
    val listOfAlphabets = listOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
    Column( modifier = Modifier.height(60.dp)) {
        Text(
            text = "Alphabets",
            fontSize = 24.sp
        )
    }
    FlowRow(
        modifier = Modifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalArrangement = Arrangement.Center,
    ) {
        listOfAlphabets.forEach{
            alphabet -> AlphabetItems(alphabet = alphabet){
                navController.navigate(ARScreen(alphabet))
            }
        }
    }
}

@Composable
fun AlphabetItems(alphabet:String,onClick : () -> Unit){
    val color = remember(alphabet) {
            generateRandomLightColor()
    }
    Box(
        modifier = Modifier
            .size(50.dp)
            .clickable { onClick() }
            .clip(RoundedCornerShape(60.dp))
            .background(generateRandomLightColor())
    ){
        Text(
            text = alphabet,
            modifier = Modifier.align(Alignment.Center),
            fontSize = 24.sp
        )
    }
}

fun generateRandomLightColor() : Color{

    val random = Random(System.currentTimeMillis())
    val red = random.nextInt(from=150 , until = 255)
    val green = random.nextInt(from=200 , until = 255)
    val blue = random.nextInt(from=200 , until = 255)

    val color = Color(red,green,blue)

    return color
}