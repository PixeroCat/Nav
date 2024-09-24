package com.example.navclase.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Datos(
    val nombre: String,
    val apellido: String,
    val email: String,
    val contacto: String
) : Parcelable
