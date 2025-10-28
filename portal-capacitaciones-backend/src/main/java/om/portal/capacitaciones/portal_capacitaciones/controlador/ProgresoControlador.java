package om.portal.capacitaciones.portal_capacitaciones.controlador;

import om.portal.capacitaciones.portal_capacitaciones.modelo.Progreso;
import om.portal.capacitaciones.portal_capacitaciones.servicio.ProgresoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/progreso")
public class ProgresoControlador {
    private final ProgresoServicio progresoServicio;


    public ProgresoControlador(ProgresoServicio progresoServicio) {
        this.progresoServicio = progresoServicio;
    }

    @GetMapping
    public List<Progreso> listarProgreso(){
        return progresoServicio.listaProgreso();
    }
    @PostMapping
    public Progreso crearProgreso(@RequestBody Progreso progreso){
        return progresoServicio.guardarProgreso(progreso);
    }

    @GetMapping("/{id}")
    public Progreso obtenerProgreso(@PathVariable Long id){
        return progresoServicio.obtenerProgreso(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarProgreso(@PathVariable Long id){
        progresoServicio.eliminarProgreso(id);
    }
}

