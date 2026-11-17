
package pe.saludpublica.model;

import java.time.LocalDateTime;

public class CitaMedica {

    private String paciente;
    private String doctor;
    private String especialidad;
    private LocalDateTime fechaHora;
    private String motivo;
    private EstadoCita estado;

    public CitaMedica(
            String paciente,
            String doctor,
            String especialidad,
            LocalDateTime fechaHora,
            String motivo,
            EstadoCita estado
    ) {
        //PENDIENTE PARA LA PRUEBA GREEN
    }

    public String getPaciente() {
        return paciente;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }
}
