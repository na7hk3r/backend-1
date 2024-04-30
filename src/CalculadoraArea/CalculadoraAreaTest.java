package CalculadoraArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraAreaTest {

    @Test
    void testCalcularAreaCirculo() {
        double radio = 5;
        double resultadoEsperado = Math.PI * radio * radio;
        assertEquals(resultadoEsperado, CalculadoraArea.calcularAreaCirculo(radio));
    }

    @Test
    void testCalcularAreaCuadrado() {
        double lado = 4;
        double resultadoEsperado = lado * lado;
        assertEquals(resultadoEsperado, CalculadoraArea.calcularAreaCuadrado(lado));
    }

    @Test
    void testCalcularAreaConRadioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraArea.calcularArea("círculo", -3);
        });
    }
}
