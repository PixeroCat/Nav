package com.example.navclase.data

import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class ContactoVM : ViewModel(){
    val contactos = mutableListOf<Datos>()

    fun agregarContacto(nombre: String, apellido:String, email:String, contacto:String){
        contactos.add(Datos(nombre, apellido, email, contacto))
    }
}