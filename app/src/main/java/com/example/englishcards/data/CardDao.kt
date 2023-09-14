package com.example.englishcards.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

class CardDao {
    @Dao
    interface CardDao {

        @Query("SELECT * FROM cards_table")
        fun getTasks(): Flow<List<Cards>>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insert(task: Cards)

        @Update
        suspend fun update(task: Cards)

        @Delete
        suspend fun delete(task: Cards)
    }
}