package visualizarcursos.api_cursos.curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    @Autowired CursoRepository cursoRepository;

    public Curso save(Curso entity){
        return cursoRepository.save(entity);
    }

    public Curso findById( Long id){
        return cursoRepository.findById(id).orElse(new Curso());
    }

    public void deleteById(Long id){
        cursoRepository.deleteById(id);
    }

    public List<Curso> findAll(){
        return cursoRepository.findAll();
    }

}