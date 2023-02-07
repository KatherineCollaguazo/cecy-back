package visualizar_cursos.api_planificacioncurso.planificacioncurso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Planificacioncurso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codeCourse;
    private String name;
    private String modality;    
    private String schoolPeriod;    
}
