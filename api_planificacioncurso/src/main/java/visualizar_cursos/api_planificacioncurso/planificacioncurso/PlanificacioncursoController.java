package visualizar_cursos.api_planificacioncurso.planificacioncurso;

import java.util.List;

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

@RestController
@RequestMapping("api/planificacioncurso")
@CrossOrigin({"*"})
public class PlanificacioncursoController {
    @Autowired PlanificacioncursoService planificacioncursoService;

    @GetMapping("/")
    public List<Planificacioncurso> findAll(){
        return planificacioncursoService.findAll();
    }

    @GetMapping("/{id}")
    public Planificacioncurso findById(@PathVariable Long id){
        return planificacioncursoService.findById(id);
    }

    @PostMapping("/")
    public Planificacioncurso save(@RequestBody Planificacioncurso entity){
        return planificacioncursoService.save(entity);
    }

    @PutMapping("/")
    public Planificacioncurso update(@RequestBody Planificacioncurso entity){
        return planificacioncursoService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        planificacioncursoService.deleteById(id);
    }
}