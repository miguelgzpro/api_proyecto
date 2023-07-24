package matriculacion.api_matricula.estudiante;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class EstudianteService {
    @Autowired EstudianteRepository entityRepository;

    public Estudiante save(Estudiante entity){
        return entityRepository.save(entity);
    }

    public Estudiante findById( Long id){
        return entityRepository.findById(id).orElse(new Estudiante());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<Estudiante> findAll(){
        return entityRepository.findAll();
    }
}