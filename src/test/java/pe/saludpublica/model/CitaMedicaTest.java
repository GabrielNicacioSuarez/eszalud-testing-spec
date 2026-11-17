package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
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

    @Test
    @DisplayName("CIT-002: Rechazar cita sin paciente")
    void shouldRejectAppointmentWithoutPatient(){
        LocalDateTime fecha = LocalDateTime.of(
                2026, 12, 15, 10, 30
        );
        assertThrows(IllegalArgumentException.class, () -> new CitaMedica(
                null,
                "DOC001",
                "ESP001",
                fecha,
                "Consulta medica general",
                EstadoCita.PROGRAMADA

        ));
    }

    @Test
    @DisplayName("CIT-003: Rechazar cita sin doctor")
    void shouldRejectAppointmentWithoutDoctor(){
        LocalDateTime fecha = LocalDateTime.of(
                2026, 12, 15, 10, 30
        );
        assertThrows(IllegalArgumentException.class, () -> new CitaMedica(
                "PAC001",
                null,
                "ESP001",
                fecha,
                "Consulta general medica",
                EstadoCita.PROGRAMADA
        ));
    }

    @Test
    @DisplayName("CIT-004: Rechazar cita sin especialidad")
    void shouldRejectAppointmentWithoutSpecialty(){
        LocalDateTime fecha = LocalDateTime.of(
                2026, 12, 15, 10, 30);
        assertThrows(IllegalArgumentException.class, () -> new CitaMedica(
                "PAC001",
                "DOC001",
                null,
                fecha,
                "Consulta medica general",
                EstadoCita.PROGRAMADA
        ));

    }

}
