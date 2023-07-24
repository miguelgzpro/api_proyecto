package matriculacion.api_matricula.estudiante;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity


public class Estudiante {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
            private Integer cedula;
        private String nombre;
        private String correo_electronico;
        private Boolean estado;


}