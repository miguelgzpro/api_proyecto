package matriculacion.api_matricula.carrera;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CarreraRepository extends CrudRepository<Carrera, Long> {

    public List<Carrera> findAll();
}

