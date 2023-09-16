package com.example.englishcards.domain.usecase

import com.example.englishcards.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteAllNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    suspend operator fun invoke() {
        return noteRepository.deleteAll()
    }
}