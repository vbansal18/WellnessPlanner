package com.example.a30daysofwellness.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a30daysofwellness.R

val poppins = FontFamily(
    Font(R.font.poppins_regular),
    Font(R.font.poppins_bold)
)
val AppTypography = Typography(
    bodySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = poppins,
        fontSize = 14.sp,
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontFamily = poppins,
        fontSize = 12.sp,
    ),
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = poppins,
        fontSize = 20.sp,
    ),
    displayLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = poppins,
        fontSize = 20.sp
    ),
)
