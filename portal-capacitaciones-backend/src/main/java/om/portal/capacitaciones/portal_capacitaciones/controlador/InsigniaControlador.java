package om.portal.capacitaciones.portal_capacitaciones.controlador;

import om.portal.capacitaciones.portal_capacitaciones.modelo.Insignia;
import om.portal.capacitaciones.portal_capacitaciones.servicio.InsigniaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insignia")
public class InsigniaControlador {
    private final InsigniaServicio insigniaServicio;

    public InsigniaControlador(InsigniaServicio insigniaServicio) {
        this.insigniaServicio = insigniaServicio;
    }


    @GetMapping
    public List<Insignia> listarInsignias(){
        return insigniaServicio.listaInsignias();
    }
    @PostMapping
    public Insignia crearCurso(@RequestBody Insignia insignia){
        return insigniaServicio.guardarInsignia(insignia);
    }

    @GetMapping("/{id}")
    public Insignia obtenerCurso(@PathVariable Long id){
        return insigniaServicio.obtenerInsignia(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarInsignia(@PathVariable Long id){
        insigniaServicio.eliminarInsignia(id);
    }
}
