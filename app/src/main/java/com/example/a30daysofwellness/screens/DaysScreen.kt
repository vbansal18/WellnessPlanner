package com.example.a30daysofwellness.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysofwellness.data.daysPlanner

@Preview(showBackground = true)
@Composable
fun DaysScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        items(daysPlanner.size){it ->
            DayItem(
                daysPlanner[it],
            )
        }
    }
}