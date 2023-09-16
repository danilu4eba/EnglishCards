package com.example.englishcards.data.model

import com.example.englishcards.domain.model.Note

fun Cards.toNote() = Note(
    firstWord,
    translate,
    id

)

fun List<Cards>.toNotes() = this.map { it.toNote() }