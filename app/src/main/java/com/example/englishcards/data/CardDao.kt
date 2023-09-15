package com.example.englishcards.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
    @Dao
    interface CardDao {

        @Query("SELECT * FROM cards_table")
        fun getCards(): Flow<List<Cards>>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insert(cards: Cards)

        @Update
        suspend fun update(cards: Cards)

        @Delete
        suspend fun delete(cards: Cards)
    }
