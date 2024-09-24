package com.example.navclase.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.navclase.data.ContactoVM
import com.example.navclase.data.Datos

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenB(
    navController: NavHostController
) {

    val viewModel: ContactoVM = viewModel()
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        "Detalles de Contacto",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Regresar"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding) // Añadir padding interno del Scaffold
                .padding(20.dp),
            verticalArrangement = Arrangement.Top
        ) {
            // Encabezado
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Nombre", modifier = Modifier.weight(1f))
                Text(text = "Apellido", modifier = Modifier.weight(1f))
                Text(text = "Email", modifier = Modifier.weight(1f))
                Text(text = "Contacto", modifier = Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la barra y los datos

            // Datos ingresados
            for (contactos in viewModel.contactos) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = contactos.nombre, modifier = Modifier.weight(1f))
                    Text(text = contactos.apellido, modifier = Modifier.weight(1f))
                    Text(text = contactos.email, modifier = Modifier.weight(1f))
                    Text(text = contactos.contacto, modifier = Modifier.weight(1f))
                }
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre contactos
            }
        }
    }
}
