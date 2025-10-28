package om.portal.capacitaciones.portal_capacitaciones.controlador;

import om.portal.capacitaciones.portal_capacitaciones.modelo.Curso;
import om.portal.capacitaciones.portal_capacitaciones.servicio.CursoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@CrossOrigin(origins = "*")
public class CursoControlador {
    private final CursoServicio cursoServicio;

    public CursoControlador(CursoServicio cursoServicio) {
        this.cursoServicio = cursoServicio;
    }

    @GetMapping
    public List<Curso> listaCursos(){
        return cursoServicio.listarCursos();
    }

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso){
        return cursoServicio.guardarCurso(curso);
    }

    @GetMapping("/{id}")
    public Curso obtenerCurso(@PathVariable Long id){
        return cursoServicio.obtenerCurso(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCurso(Long id){
        cursoServicio.eliminarCurso(id);
    }

}
