package visualizarcursos.api_cursos.cursoplanificacions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/planificacion/cursos")
@CrossOrigin({ "*" })
public class CursoPController {
  
    @Autowired CursoClient cursoclient;

    @GetMapping("/")
    public List<CursoDTO> findAll() {
        return cursoclient.findAll();
    }

    @GetMapping("/{id}/")
    public CursoDTO findById(@PathVariable Long id) {
        return cursoclient.findById(id);
    }

    @PostMapping("/")
    public CursoDTO save(@RequestBody CursoDTO entity) {
        return cursoclient.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        cursoclient.deleteById(id);
    }

    @PutMapping("/{id}/")
    public CursoDTO update(@PathVariable Long id, @RequestBody CursoDTO entity) {
        return cursoclient.update(id, entity);
    }

    @GetMapping("/findByName/{term}")
    public List<CursoDTO> findByName(@PathVariable String term){
        return cursoclient.findByName(term);
    }
}