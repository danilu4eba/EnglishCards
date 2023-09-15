package com.example.englishcards

import androidx.lifecycle.ViewModel
import com.example.englishcards.data.CardDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CardViewModel @Inject constructor(
    private val cardDao: CardDao
): ViewModel()