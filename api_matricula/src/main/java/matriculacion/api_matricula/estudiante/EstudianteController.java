package matriculacion.api_matricula.estudiante;

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
@RequestMapping("api/estudiante")
@CrossOrigin({"*"})
public class EstudianteController {
    @Autowired EstudianteService estudianteService;

    @GetMapping("/")
    public List<Estudiante> findAll(){
        return estudianteService.findAll();
    }

    @GetMapping("/{id}/")
    public Estudiante findById(@PathVariable Long id){
        return estudianteService.findById(id);
    }

    @PostMapping("/")
    public Estudiante save(@RequestBody Estudiante entity){
        return estudianteService.save(entity);
    }

    @PutMapping("/{id}/")
    public Estudiante update(@RequestBody Estudiante entity){
        return estudianteService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        estudianteService.deleteById(id);
    }
}
