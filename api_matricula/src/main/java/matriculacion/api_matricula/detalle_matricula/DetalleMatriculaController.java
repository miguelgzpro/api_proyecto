package matriculacion.api_matricula.detalle_matricula;

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
@RequestMapping("api/detallematricula")
@CrossOrigin({"*"})
public class DetalleMatriculaController {
    @Autowired DetalleMatriculaService detalleMatriculaService;

    @GetMapping("/")
    public List<DetalleMatricula> findAll(){
        return detalleMatriculaService.findAll();
    }

    @GetMapping("/{id}/")
    public DetalleMatricula findById(@PathVariable Long id){
        return detalleMatriculaService.findById(id);
    }

    @PostMapping("/")
    public DetalleMatricula save(@RequestBody DetalleMatricula entity){
        return detalleMatriculaService.save(entity);
    }

    @PutMapping("/{id}/")
    public DetalleMatricula update(@RequestBody DetalleMatricula entity){
        return detalleMatriculaService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        detalleMatriculaService.deleteById(id);
    }
}

