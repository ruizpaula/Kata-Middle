package om.portal.capacitaciones.portal_capacitaciones.servicio;

import om.portal.capacitaciones.portal_capacitaciones.modelo.Usuario;
import om.portal.capacitaciones.portal_capacitaciones.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {
    private final UsuarioRepository usuarioRepository;

    public UsuarioServicio(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario crearUsuario( Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario obtenerUsuario( Long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public void eliminarUsuario( Long id){
        usuarioRepository.deleteById(id);
    }
}
