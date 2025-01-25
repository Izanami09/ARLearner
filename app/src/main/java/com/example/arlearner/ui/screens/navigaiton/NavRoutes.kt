package com.example.arlearner.ui.screens.navigaiton

import kotlinx.serialization.Serializable

@Serializable
object HomeScreen

@Serializable
data class ARScreen(val model : String)

@Serializable
object AlphabetScreen

@Serializable
object QuizScreen