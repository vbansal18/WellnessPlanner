package com.example.a30daysofwellness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.a30daysofwellness.screens.DaysScreen
import com.example.a30daysofwellness.screens.TopAppBar
import com.example.a30daysofwellness.ui.theme._30DaysOfWellnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysOfWellnessTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { TopAppBar() })
                { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        DaysScreen()
                    }
                }
            }
        }
    }
}

