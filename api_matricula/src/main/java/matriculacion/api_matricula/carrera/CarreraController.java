package matriculacion.api_matricula.carrera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/carrera")
@CrossOrigin({"*"})
public class CarreraController {
    @Autowired CarreraService carreraService;

    @GetMapping("/")
    public List<Carrera> findAll(){
        return carreraService.findAll();
    }

    @GetMapping("/{id}/")
    public Carrera findById(@PathVariable Long id){
        return carreraService.findById(id);
    }

    @PostMapping("/")
    public Carrera save(@RequestBody Carrera entity){
        return carreraService.save(entity);
    }

    @PutMapping("/{id}/")
    public Carrera update(@RequestBody Carrera entity){
        return carreraService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        carreraService.deleteById(id);
    }
}

