package com.example.englishcards.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.englishcards.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [Cards::class], version = 1)
abstract class CardDataBase : RoomDatabase() {
    abstract fun cardDao(): CardDao
    class Callback @Inject constructor(
        private val database: Provider<CardDataBase>,
        @ApplicationScope private val applicationScope: CoroutineScope
    ) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            val dao = database.get().cardDao()

            applicationScope.launch {
                dao.insert(Cards("table", "стол", 0))
                dao.insert(Cards("table", "стол", 1))
                dao.insert(Cards("table", "стол", 2))
                dao.insert(Cards("table", "стол", 3))
                dao.insert(Cards("table", "стол", 4))
                dao.insert(Cards("table", "стол", 5))

            }
        }
    }
}