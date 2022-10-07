package com.example.clinicasocio.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.clinicasocio.data.PasienteDataBase
import com.example.clinicasocio.model.Pasientes
import com.example.clinicasocio.repository.PasienteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ClinicaViewModel(application: Application) : AndroidViewModel(application) {

    private val pasienteRepository: PasienteRepository = TODO()
    val getPasientes: LiveData<List<Pasientes>>

    init {
        val lugarDao= PasienteDataBase.getDataBase(application).pasienteDao()
        pasienteRepository= PasienteRepository(lugarDao)
        getPasientes= pasienteRepository.getPasiente
    }

    fun saveLugar(pasiente:Pasientes){
        viewModelScope.launch(Dispatchers.IO){
            pasienteRepository.savePasiente(pasiente)
        }

        fun deleteLugar(pasiente:Pasientes){
            viewModelScope.launch(Dispatchers.IO){
                pasienteRepository.deletePasiente(pasiente)
            }
        }

    }
}