package com.example.englishcards.domain.usecase

import com.example.englishcards.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteCardsWithIndexesUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(ids: Iterable<Int>) {
        noteRepository.deleteByIndexes(ids.toSet())
    }

    suspend operator fun invoke(vararg ids: Int) {
        noteRepository.deleteByIndexes(ids.toSet())
    }
}