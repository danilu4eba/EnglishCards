package com.example.englishcards.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Cards::class], version = 1)
abstract class CardDataBase: RoomDatabase() {
    abstract fun cardDao(): CardDao

}