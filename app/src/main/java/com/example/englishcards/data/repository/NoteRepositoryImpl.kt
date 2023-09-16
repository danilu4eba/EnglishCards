package com.example.englishcards.data.repository

import com.example.englishcards.data.db.CardDao
import com.example.englishcards.data.model.toNote
import com.example.englishcards.data.model.toNotes
import com.example.englishcards.domain.model.Note
import com.example.englishcards.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val db: CardDao,
) : NoteRepository {
    override fun getAll(): Flow<List<Note>> = db.getAll().map { it.toNotes() }

    override suspend fun get(id: Int): Note? =
        db.get(id)?.toNote()


    override suspend fun deleteByIndexes(ids: Set<Int>) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAll() {
        TODO("Not yet implemented")
    }

    override suspend fun insertNew(note: Note): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun insertNew(notes: List<Note>) {
        TODO("Not yet implemented")
    }
}


