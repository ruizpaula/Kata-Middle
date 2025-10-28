package om.portal.capacitaciones.portal_capacitaciones.repository;

import om.portal.capacitaciones.portal_capacitaciones.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
}
