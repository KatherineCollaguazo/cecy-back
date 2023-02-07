package visualizarcursos.api_cursos.curso;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {

    public List<Curso> findAll();
    
}