package com.example.englishcards.data.db

import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.englishcards.data.model.Cards
import kotlinx.coroutines.flow.Flow

@Entity
interface CardDao {
    @Query("SELECT * FROM cards_table ORDER BY id DESC")
    fun getAll(): Flow<List<Cards>>

    @Query("SELECT * FROM cards_table ORDER BY id DESC")
    suspend fun getAllSuspend(): List<Cards>

    @Query("SELECT * FROM cards_table WHERE id = :id")
    suspend fun get(id: Int): Cards?

    @Query("DELETE FROM cards_table")
    suspend fun deleteAll()

    @Insert
    suspend fun insert(card: Cards)

    @Insert
    suspend fun insert(cards: List<Cards>)

    @Update
    suspend fun update(card: Cards)

    @Delete
    suspend fun delete(card: Cards)


}