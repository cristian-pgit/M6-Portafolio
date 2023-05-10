package cl.vrol.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.vrol.models.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findByUserNameAndPassword(String userName, String password);

}
