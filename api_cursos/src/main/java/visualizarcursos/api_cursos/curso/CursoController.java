package visualizarcursos.api_cursos.curso;

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
@RequestMapping("api/cursos")
@CrossOrigin({"*"})
public class CursoController {
    @Autowired CursoService cursoService;

    @GetMapping("/")
    public List<Curso> findAll(){
        return cursoService.findAll();
    }

    @GetMapping("/{id}")
    public Curso findById(@PathVariable Long id){
        return cursoService.findById(id);
    }

    @PostMapping("/")
    public Curso save(@RequestBody Curso entity){
        return cursoService.save(entity);
    }

    @PutMapping("/{id}/")
    public Curso update(@RequestBody Curso entity){
        return cursoService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        cursoService.deleteById(id);
    }
}