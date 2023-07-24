package matriculacion.api_matricula.matricula;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import matriculacion.api_matricula.estudiante.Estudiante;

@Data
@Entity


public class Matricula {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha_matricula;

     @ManyToOne
     private Estudiante estudiante;

}
