package com.example.clinicasocio.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.clinicasocio.model.Pasientes

@Dao
interface PasienteDao {
    //Las funcionaes de bajo nivel para hacer un CRUD
    @Insert(onConflict = OnConflictStrategy.IGNORE)//que si no lo puede insertar que no de error
    suspend fun addPasiente(pasientes: Pasientes)//esto va a insertar un registro en mi tabla

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun upadatePasiente(pasientes: Pasientes)//esto va a actualizar un registro en mi tabla

    @Delete
    suspend fun deleteLugar(pasientes: Pasientes)//esto va a eliminar un registro en mi tabla

    @Query("SELECT * FROM PASIENTE")//Consulta general de SQL
    fun getPasiente() : LiveData<List<Pasientes>> //datos que se pueden cargar en tiempo real
}