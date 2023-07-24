package matriculacion.api_matricula.detalle_matricula;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class DetalleMatriculaService {
    @Autowired DetalleMatriculaRepository entityRepository;

    public DetalleMatricula save(DetalleMatricula entity){
        return entityRepository.save(entity);
    }

    public DetalleMatricula findById( Long id){
        return entityRepository.findById(id).orElse(new DetalleMatricula());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<DetalleMatricula> findAll(){
        return entityRepository.findAll();
    }
}
