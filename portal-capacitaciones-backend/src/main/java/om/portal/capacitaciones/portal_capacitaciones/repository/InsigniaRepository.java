package om.portal.capacitaciones.portal_capacitaciones.repository;

import om.portal.capacitaciones.portal_capacitaciones.modelo.Insignia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsigniaRepository extends JpaRepository<Insignia,Long> {
}
