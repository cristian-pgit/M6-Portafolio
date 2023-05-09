package cl.vrol.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.vrol.models.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {

}
