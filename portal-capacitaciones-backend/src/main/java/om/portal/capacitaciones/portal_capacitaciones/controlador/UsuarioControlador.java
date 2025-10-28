package om.portal.capacitaciones.portal_capacitaciones.controlador;


import om.portal.capacitaciones.portal_capacitaciones.modelo.Usuario;
import om.portal.capacitaciones.portal_capacitaciones.servicio.UsuarioServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {
    private final UsuarioServicio usuarioServicio;


    public UsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @GetMapping
    public List<Usuario> listarUsuario(){
        return usuarioServicio.listarUsuarios();
    }
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioServicio.crearUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuario(@PathVariable Long id){
        return usuarioServicio.obtenerUsuario(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioServicio.eliminarUsuario(id);
    }
}
