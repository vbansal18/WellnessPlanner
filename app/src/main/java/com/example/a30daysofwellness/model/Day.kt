package com.example.a30daysofwellness.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    val number : Int,
    @StringRes val title : Int,
    @StringRes val desc : Int,
    @DrawableRes val image : Int,
)
