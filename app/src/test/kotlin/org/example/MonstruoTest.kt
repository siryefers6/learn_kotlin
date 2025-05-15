package org.example

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.example.Monstruo

class MonstruoTest {

    @Test
    fun InstanciarMonstruo() {
        val monstruo = Monstruo(
            nombre = "Chatacabra",
            tipo = "Anfibio",
            habitats = listOf("Llanos"),
            debilidadElemental = listOf("Hielo", "Rayo"),
            materialesRangoBajo = listOf(
                "Caparazón de Chatacabra (romper pata): ****",
                "Escama de Chatacabra: ***",
                "Piel de Chatacabra: ***",
                "Mandíbula de Chatacabra: **",
                "Certificado Chatacabra: *"
            ),
            materialesRangoAlto = listOf(
                "Coraza de Chatacabra: ****",
                "Escama de Chatacabra+: ***",
                "Piel de Chatacabra+: ***",
                "Mandíbula de Chatacabra+: **",
                "Certificado Chatacabra S: *"
            ),
        )

    }

    @Test
    fun CrearPresentacionMonstruoTest() {

        // Arrange
        val monstruo = Monstruo(
            nombre = "Chatacabra",
            tipo = "Anfibio",
            habitats = listOf("Llanos"),
            debilidadElemental = listOf("Hielo", "Rayo"),
            materialesRangoBajo = listOf(
                "Caparazón de Chatacabra (romper pata): ****",
                "Certificado Chatacabra: *"
            ),
            materialesRangoAlto = listOf(
                "Coraza de Chatacabra: ****",
            ),
        )

        // Act
        val presentacion = monstruo.crearPresentacionMonstruo()
        val resultadoEsperado = """
            Nombre: Chatacabra
            Tipo: Anfibio
            Habitats: Llanos
            Debilidad Elemental: Hielo, Rayo
            Materiales Rango Bajo: Caparazón de Chatacabra (romper pata): ****, Certificado Chatacabra: *
            Materiales Rango Alto: Coraza de Chatacabra: ****
        """.trimIndent()

        // Assert
        assertEquals(resultadoEsperado, presentacion)

    }
}
