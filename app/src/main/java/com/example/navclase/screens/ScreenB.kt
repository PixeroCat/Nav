package com.example.navclase.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.navclase.data.ContactoVM

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenB(navController: NavHostController, viewModel: ContactoVM) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Detalles de Contacto") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Regresar")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(20.dp),
            verticalArrangement = Arrangement.Top
        ) {
            // Verificación: Mostrar el número de contactos
            Text(text = "Número de contactos: ${viewModel.contactos.size}")

            // Encabezado
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Nombre", modifier = Modifier.weight(1f))
                Text(text = "Apellido", modifier = Modifier.weight(1f))
                Text(text = "Email", modifier = Modifier.weight(1f))
                Text(text = "Contacto", modifier = Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Mostrar los datos de los contactos
            for (contacto in viewModel.contactos) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = contacto.nombre, modifier = Modifier.weight(1f))
                    Text(text = contacto.apellido, modifier = Modifier.weight(1f))
                    Text(text = contacto.email, modifier = Modifier.weight(1f))
                    Text(text = contacto.contacto, modifier = Modifier.weight(1f))
                }
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre cada contacto
            }
        }
    }
}



