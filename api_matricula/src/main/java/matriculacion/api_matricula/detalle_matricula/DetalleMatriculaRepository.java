package matriculacion.api_matricula.detalle_matricula;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DetalleMatriculaRepository extends CrudRepository<DetalleMatricula, Long> {

    public List<DetalleMatricula> findAll();
}

