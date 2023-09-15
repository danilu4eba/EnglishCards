package com.example.englishcards

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.englishcards.data.CardDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CardViewModel @Inject constructor(
    cardDao: CardDao
): ViewModel(){
    val cards = cardDao.getCards().asLiveData()
}


