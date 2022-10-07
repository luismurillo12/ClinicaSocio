package com.example.clinicasocio.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "pasiente")
data class Pasientes(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "Nombre")
    val nombre: String,
    @ColumnInfo(name = "Apellido")
    val apellido: String?,
    @ColumnInfo(name = "Telefono")
    val telefono: String?,
    @ColumnInfo(name = "Correo")
    val correo: String?,
    @ColumnInfo(name = "Edad")
    val edad: Int?,
    @ColumnInfo(name = "Altura")
    val altura: Double?,
    @ColumnInfo(name = "Peso")
    val peso: Double?
//el ? es para decir que va a hacer nulo, y esta clase es la creacion de la BD
): Parcelable
