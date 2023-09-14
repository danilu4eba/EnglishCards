package com.example.englishcards.data

import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@androidx.room.Entity(tableName = "cards_table")
@Parcelize
data class Cards(
    val firstWord:String,
    val translate:String,
    @PrimaryKey(autoGenerate = true) val id: Int
):Parcelable
