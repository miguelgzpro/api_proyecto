package matriculacion.api_matricula.detalle_matricula;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import  matriculacion.api_matricula.matricula.Matricula;
import  matriculacion.api_matricula.asignatura.Asignatura;

@Data
@Entity


public class DetalleMatricula {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @ManyToOne
    private Matricula matricula;
     @ManyToOne
    private Asignatura asignatura;
    

}
