package matriculacion.api_matricula.carrera;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class CarreraService {
    @Autowired CarreraRepository entityRepository;

    public Carrera save(Carrera entity){
        return entityRepository.save(entity);
    }

    public Carrera findById( Long id){
        return entityRepository.findById(id).orElse(new Carrera());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<Carrera> findAll(){
        return entityRepository.findAll();
    }
}