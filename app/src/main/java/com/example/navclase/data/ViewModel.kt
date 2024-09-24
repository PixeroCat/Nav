package com.example.navclase.data

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class ContactoVM : ViewModel() {
    // Lista mutable para almacenar los contactos
    private val _contactos = mutableStateListOf<Datos>()
    val contactos: List<Datos> get() = _contactos

    // Función para agregar un contacto a la lista
    fun agregarContacto(nombre: String, apellido: String, email: String, contacto: String) {
        _contactos.add(Datos(nombre, apellido, email, contacto))
    }
}