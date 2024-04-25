package Ejercitacion1;

import Ejercitacion1.Persona;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void testIsAdult() {
        // "Fecha actual"
        LocalDate fechaActual = LocalDate.of(2024,9, 21);

        // Datos de Prueba
        LocalDate fechaNacimientoMenor = LocalDate.of(2015, 1, 20);
        LocalDate fechaNacimientoMayor = LocalDate.of(2000, 3, 10);

        int caso1 = calcularEdad(fechaActual, fechaNacimientoMenor);
        int caso2 = calcularEdad(fechaActual, fechaNacimientoMayor);

        assertFalse(isAdult(caso1));
        assertTrue(isAdult(caso2));

        // assertFalse(isAdult(caso2)); // True
        // assertTrue(isAdult(caso1)); // False

    }

    private int calcularEdad(LocalDate fechaActual, LocalDate fechaNacimiento) {
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }
    private boolean isAdult(int age) {
        return age >= 18;
    }


    @Test
    void testFullName() {
        // Datos de Prueba
        Persona persona1 = new Persona("Walter", "Dos Santos", "chinela10@mail.com",64);

        assertEquals("Dos Santos, Walter", persona1.fullName());

        // assertEquals("Walter Dos Santos", persona1.fullName());
    }
}