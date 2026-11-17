package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    @DisplayName("DOC-001: Crear un doctor con datos válidos")
    void shouldCreateDoctorWithValidData() {
        Doctor doctor = new Doctor("12345678", "María", "Rojas", "CMP12345", "CARDIOLOGIA");

        assertNotNull(doctor);
        assertEquals("12345678", doctor.getDocumento());
        assertEquals("María", doctor.getNombres());
        assertEquals("Rojas", doctor.getApellidos());
        assertEquals("CMP12345", doctor.getColegiatura());
        assertEquals("CARDIOLOGIA", doctor.getEspecialidad());
    }

    @Test
    @DisplayName("DOC-002: Rechazar doctor sin documento")
    void shouldRejectDoctorWithoutDocument() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Doctor(
                        null,
                        "María",
                        "Rojas",
                        "CMP12345",
                        "CARDIOLOGIA"
                )
        );
    }

}
