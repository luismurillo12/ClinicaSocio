package com.example.clinicasocio.repository

import androidx.lifecycle.LiveData
import com.example.clinicasocio.data.PasienteDao
import com.example.clinicasocio.model.Pasientes

class PasienteRepository (private val pasienteDao: PasienteDao) {
    suspend fun savePasiente(pasiente:Pasientes){
        if (pasiente.id==0){
            pasienteDao.addPasiente(pasiente)//Si es un lugar nuevo se añade aca
        }else{
            pasienteDao.upadatePasiente(pasiente)// si ya el lugar se sabe el id se actualiza aca
        }
    }
    suspend fun deletePasiente(pasiente:Pasientes){
        if (pasiente.id!=0){//Si el id tiene un valor lo va a intentar eliminar
            pasienteDao.deleteLugar(pasiente)
        }
    }

    val getPasiente: LiveData<List<Pasientes>> = pasienteDao.getPasiente()
}