package om.portal.capacitaciones.portal_capacitaciones.servicio;


import om.portal.capacitaciones.portal_capacitaciones.modelo.Curso;
import om.portal.capacitaciones.portal_capacitaciones.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServicio {
    private final CursoRepository cursoRepository;

    public CursoServicio(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }

    public Curso guardarCurso(Curso curso){
        return cursoRepository.save(curso);
    }

    public  Curso obtenerCurso(Long id){
        return cursoRepository.findById(id).orElse(null);
    }

    public void eliminarCurso(Long id){
        cursoRepository.deleteById(id);
    }
}
