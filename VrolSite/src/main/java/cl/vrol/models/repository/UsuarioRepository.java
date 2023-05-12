/*
 * 
 */
package cl.vrol.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.vrol.models.entity.Usuario;

// TODO: Auto-generated Javadoc
/**
 * The Interface UsuarioRepository.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	/**
	 * Find by user name and password.
	 *
	 * @param userName the user name
	 * @param password the password
	 * @return the usuario
	 */
	public Usuario findByUserNameAndPassword(String userName, String password);

}
