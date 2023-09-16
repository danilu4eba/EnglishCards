package com.example.englishcards.ui.library

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.englishcards.data.db.CardDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


class CardViewModel constructor(
    cardDao: CardDao
): ViewModel(){

}


