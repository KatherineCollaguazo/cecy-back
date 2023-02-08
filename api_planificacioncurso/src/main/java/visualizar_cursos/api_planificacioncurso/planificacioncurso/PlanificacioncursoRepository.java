package visualizar_cursos.api_planificacioncurso.planificacioncurso;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanificacioncursoRepository extends JpaRepository<Planificacioncurso, Long> {

    public List<Planificacioncurso> findAll();
    public List<Planificacioncurso> findByNameLikeIgnoreCase(String term);
    
}
