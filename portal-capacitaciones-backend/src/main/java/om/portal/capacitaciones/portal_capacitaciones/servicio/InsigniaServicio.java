package om.portal.capacitaciones.portal_capacitaciones.servicio;

import om.portal.capacitaciones.portal_capacitaciones.modelo.Insignia;
import om.portal.capacitaciones.portal_capacitaciones.repository.InsigniaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsigniaServicio {
    private final InsigniaRepository insigniaRepository;

    public InsigniaServicio(InsigniaRepository insigniaRepository) {
        this.insigniaRepository = insigniaRepository;
    }

    public List<Insignia> listaInsignias(){
        return insigniaRepository.findAll();
    }

    public Insignia guardarInsignia(Insignia insignia){
        return insigniaRepository.save(insignia);
    }

    public Insignia obtenerInsignia(Long id){
        return insigniaRepository.findById(id).orElse(null);
    }

    public void eliminarInsignia(Long id){
        insigniaRepository.deleteById(id);
    }
}
