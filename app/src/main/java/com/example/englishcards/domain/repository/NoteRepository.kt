package com.example.englishcards.domain.repository

import com.example.englishcards.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getAll(): Flow<List<Note>>

    suspend fun get(id: Int): Note?

    suspend fun getNotesWithRelevantCards(currentTime: Long): List<Note>

    suspend fun deleteByIndexes(ids: Set<Int>)
    suspend fun deleteAll()

    suspend fun insertNew(note: Note): Boolean
    suspend fun insertNew(notes: List<Note>)
}