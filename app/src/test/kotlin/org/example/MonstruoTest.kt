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

}
