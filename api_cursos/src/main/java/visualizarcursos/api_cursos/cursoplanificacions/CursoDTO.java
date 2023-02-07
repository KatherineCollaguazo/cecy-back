package visualizarcursos.api_cursos.cursoplanificacions;

import lombok.Data;

@Data
public class CursoDTO {
    private Long id;
    private String codeCourse;
    private String name;
    private String modality;
    private String schoolPeriod;
}
