package matriculacion.api_matricula.estudiante;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {

    public List<Estudiante> findAll();
}
