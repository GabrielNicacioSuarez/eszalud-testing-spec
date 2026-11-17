package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;


public class CitaMedicaTest {

    @Test
    @DisplayName("CIT-001: Crear una cita medica con datos validos")
    void shouldCreateAppointmentWithValidData(){
        LocalDateTime fecha = LocalDateTime.of(
                2026, 12, 15, 10, 30
        );

        CitaMedica cita = new CitaMedica(
                "PAC001",
                "DOC001",
                "ESP001",
                fecha,
                "Consulta medica general",
                EstadoCita.PROGRAMADA
        );

        assertNotNull(cita);
        assertEquals("PAC001", cita.getPaciente());
        assertEquals("DOC001", cita.getDoctor());
        assertEquals("ESP001", cita.getEspecialidad());
        assertEquals(fecha,cita.getFechaHora());
        assertEquals("Consulta medica general", cita.getMotivo());
        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());

    }
}
