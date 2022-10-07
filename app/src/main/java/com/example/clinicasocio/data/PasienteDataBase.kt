package com.example.clinicasocio.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.clinicasocio.model.Pasientes

@Database(entities = [Pasientes::class], version = 1 , exportSchema = false)
abstract class PasienteDataBase {
    abstract fun pasienteDao(): PasienteDao

    companion object{
        @Volatile
        private var INSTANCE: PasienteDataBase? = null

        fun getDataBase(context: Context): PasienteDataBase{
            var local = INSTANCE
            if (local != null){
                return local
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PasienteDataBase::class.java,
                    "lugar_database"
                ).build()
                INSTANCE= instance
                return instance
            }
        }
    }
}