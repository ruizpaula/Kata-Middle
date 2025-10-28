package om.portal.capacitaciones.portal_capacitaciones.servicio;

import om.portal.capacitaciones.portal_capacitaciones.modelo.Progreso;
import om.portal.capacitaciones.portal_capacitaciones.repository.ProgresoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgresoServicio {
    private final ProgresoRepository progresoRepository;


    public ProgresoServicio(ProgresoRepository progresoRepository) {
        this.progresoRepository = progresoRepository;
    }

    public List<Progreso> listaProgreso(){
        return progresoRepository.findAll();
    }

    public Progreso guardarProgreso(Progreso progreso){
        return progresoRepository.save(progreso);
    }

    public Progreso obtenerProgreso(Long id){
        return progresoRepository.findById(id).orElse(null);
    }

    public void eliminarProgreso (Long id){
        progresoRepository.deleteById(id);
    }
}
