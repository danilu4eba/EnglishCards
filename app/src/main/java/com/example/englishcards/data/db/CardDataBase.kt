package com.example.englishcards.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.englishcards.data.model.Cards


@Database(entities = [Cards::class], version = 1)
abstract class CardDataBase : RoomDatabase() {
    abstract fun cardDao(): CardDao
}

