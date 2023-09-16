package com.example.englishcards.domain.usecase

import com.example.englishcards.domain.model.Note
import com.example.englishcards.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllCardsUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    operator fun invoke(): Flow<List<Note>> {
        return noteRepository.getAll()
    }
}