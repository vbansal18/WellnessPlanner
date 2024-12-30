package com.example.a30daysofwellness.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.a30daysofwellness.R
import com.example.a30daysofwellness.model.Day

@Composable
fun DayItem(
    day: Day,
    modifier: Modifier = Modifier
){
    val expanded = remember{
        mutableStateOf(false)
    }

    Card(
        modifier = modifier
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessMediumLow
                )
            )
            .fillMaxWidth()
            .padding(14.dp)
            .clickable {
                expanded.value = !expanded.value
            }
    ) {
        Column(
            modifier = modifier.fillMaxWidth().padding(14.dp)
        ) {
            Text(
                text = "Day ${day.number}",
                style = MaterialTheme.typography.bodyMedium,
            )
            Text(
                text = stringResource(day.title),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(top = 8.dp),
            )
            Image(
                painter = painterResource(day.image),
                contentDescription = stringResource(R.string.title_day_1),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(vertical = 8.dp)
                    .clip(MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop

            )
            if(expanded.value){
                Text(
                    text = stringResource(day.desc),
                    style = MaterialTheme.typography.bodySmall,
                )
            }
        }
    }
}