package com.example.quizclase.theme



import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color


@Composable

fun calcular (){

    val coloresBandas = remember {
    listOf(
        mapOf(
            "nombre" to "Negro", "color" to Color.Black,
            "valorColor" to 0,
            "multiplier" to 1.0,
            "tolerancia" to 1.0
        ),
        mapOf(
            "nombre" to "Marrón",
            "valorColor" to Color(0xFF83503E),
            "value" to 1,
            "multiplier" to 10.0,
            "tolerancia" to 2.0
        ),
        mapOf(
            "nombre" to "Rojo",
            "color" to Color.Red,
            "valorColor" to 2,
            "multiplier" to 100.0,
            "tolerancia" to null
        ),
        mapOf(
            "nombre" to "Naranja",
            "color" to Color(0xFFFF5722),
            "valorColor" to 3,
            "multiplier" to 1000.0,
            "tolerancia" to null
        ),
        mapOf(
            "nombre" to "Amarillo",
            "color" to Color.Yellow,
            "valorColor" to 4,
            "multiplier" to 10000.0,
            "tolerancia" to null
        ),
        mapOf(
            "nombre" to "Verde",
            "color" to Color.Green,
            "valorColor" to 5,
            "multiplier" to 100000.0,
            "tolerancia" to 0.5
        ),
        mapOf(
            "nombre" to "Azul",
            "color" to Color.Blue,
            "valorColor" to 6,
            "multiplier" to 1000000.0,
            "tolerancia" to 0.25
        ),
        mapOf(
            "nombre" to "Violeta",
            "color" to Color(0xFF9C27B0),
            "valorColor" to 7,
            "multiplier" to 10000000.0,
            "tolerancia" to 0.1
        ),
        mapOf(
            "nombre" to "Gris",
            "color" to Color.Gray,
            "valorColor" to 8,
            "multiplicador" to 100000000.0,
            "tolerancia" to 0.05
        ),
        mapOf(
            "nombre" to "Blanco",
            "color" to Color.White,
            "valorColor" to 9,
            "multiplicador" to 1000000000.0,
            "tolerancia" to null
        ),
        mapOf(
            "nombre" to "Dorado",
            "color" to Color(0xFFFFD700),
            "valorColor" to null,
            "multiplicador" to 0.1,
            "tolerancia" to 5.0
        ),
        mapOf(
            "nombre" to "Plateado",
            "color" to Color(0xFFC0C0C0),
            "valorColor" to null,
            "multiplicador" to 0.01,
            "tolerancia" to 10.0
        ),
        mapOf(
            "nombre" to "Ninguno",
            "color" to Color(0xFFE0E0E0),
            "valorColor" to null,
            "multiplicador" to null,
            "tolerancia" to 20.0
        )
    )
    }

    val ValorBandas = remember { coloresBandas.filter { it["valorColor"] != null } }
    val mitiplicarBandas = remember { coloresBandas.filter { it["multiplicador"] != null } }
    val toleranciaBands = remember { coloresBandas.filter { it["toleranci"] != null } }


    var banda1 by remember { mutableStateOf(ValorBandas[0]) }
    var banda2 by remember { mutableStateOf(ValorBandas[0]) }
    var banda3 by remember { mutableStateOf(mitiplicarBandas[0]) }
    var tolerancia by remember { mutableStateOf(toleranciaBands[1])}

    // Calcular el valor
    val resistanceValue = remember(banda1, banda2, banda3, tolerancia) {
        calcular(banda1, banda2, banda3, tolerancia)
    }

}

