package org.example

class Monstruo(
    val nombre: String,
    val tipo: String,
    val habitats: List<String>,
    val debilidadElemental: List<String>,
    val materialesRangoBajo: List<String>,
    val materialesRangoAlto: List<String>
) {
    fun crearPresentacionMonstruo(): String {
        return """
            Nombre: $nombre
            Tipo: $tipo
            Habitats: ${habitats.joinToString(", ")}
            Debilidad Elemental: ${debilidadElemental.joinToString(", ")}
            Materiales Rango Bajo: ${materialesRangoBajo.joinToString(", ")}
            Materiales Rango Alto: ${materialesRangoAlto.joinToString(", ")}
        """.trimIndent()
    }
}

