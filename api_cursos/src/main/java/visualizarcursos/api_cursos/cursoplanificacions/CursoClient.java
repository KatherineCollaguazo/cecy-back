package visualizarcursos.api_cursos.cursoplanificacions;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin({ "*" })
@FeignClient(name = "bff.customer", url = "http://localhost:8080/api/planificacioncurso")
public interface CursoClient {

    @GetMapping("/{id}/")
    CursoDTO findById(@PathVariable("id") Long id);

    @GetMapping("/")
    List<CursoDTO> findAll();

    @PostMapping("/")
    CursoDTO save(CursoDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id") Long id);

    @PutMapping("/{id}/")
    CursoDTO update(@PathVariable("id") Long id, CursoDTO entity);

    @GetMapping("/findByName/{term}")
    List <CursoDTO> findByName(@PathVariable("term") String term);

    @GetMapping("/findBySchoolPeriod/{term}")
    List <CursoDTO> findBySchoolPeriod(@PathVariable("term") String term);
}
