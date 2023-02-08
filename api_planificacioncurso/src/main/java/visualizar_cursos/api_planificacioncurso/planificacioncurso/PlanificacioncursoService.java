package visualizar_cursos.api_planificacioncurso.planificacioncurso;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanificacioncursoService {
    @Autowired PlanificacioncursoRepository planificacioncursoRepository;

    public Planificacioncurso save(Planificacioncurso entity){
        return planificacioncursoRepository.save(entity);
    }

    public Planificacioncurso findById( Long id){
        return planificacioncursoRepository.findById(id).orElse(new Planificacioncurso());
    }

    public void deleteById(Long id){
        planificacioncursoRepository.deleteById(id);
    }

    public List<Planificacioncurso> findAll(){
        return planificacioncursoRepository.findAll();
    }

    public List<Planificacioncurso> findByName(String term){
        return planificacioncursoRepository.findByNameLikeIgnoreCase(term+"%");
    }

    public List<Planificacioncurso> findBySchoolPeriod(String term){
        return planificacioncursoRepository.findBySchoolPeriodLikeIgnoreCase(term+"%");
    }
}