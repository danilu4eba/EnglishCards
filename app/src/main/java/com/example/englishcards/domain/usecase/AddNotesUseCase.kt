package com.example.englishcards.domain.usecase

import com.example.englishcards.domain.model.Note
import com.example.englishcards.domain.repository.NoteRepository
import javax.inject.Inject

class AddNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(notes: List<Note>) {
        return noteRepository.insertNew(notes)
    }
}