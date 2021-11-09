package com.example.recyclerview_27_ramadhani

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Manhwa(
    val imgManhwa: Int,
    val nameManhwa: String,
    val descManhwa: String
) : Parcelable