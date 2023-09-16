package com.example.englishcards.data.di

import android.content.Context
import androidx.room.Room
import com.example.englishcards.data.db.CardDao
import com.example.englishcards.data.db.CardDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideCardDatabase(@ApplicationContext app: Context): CardDataBase {
        return Room.databaseBuilder(
            app,
            CardDataBase::class.java,
            "flashcards_database"
        ).build()
    }

    @Provides
    fun provideCardDatabaseDao(cardDatabase: CardDataBase): CardDao {
        return cardDatabase.cardDao()
    }
}