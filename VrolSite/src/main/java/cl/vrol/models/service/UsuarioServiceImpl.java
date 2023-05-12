/*
 * 
 */
package cl.vrol.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.vrol.models.entity.Usuario;
import cl.vrol.models.repository.UsuarioRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioServiceImpl.
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	/** The user repository. */
	@Autowired
	private UsuarioRepository userRepository;
	

	/**
	 * Find by user name and password.
	 *
	 * @param userName the user name
	 * @param password the password
	 * @return the usuario
	 */
	@Override
	public Usuario findByUserNameAndPassword(String userName, String password) {
		return userRepository.findByUserNameAndPassword(userName, password);
	}

	/**
	 * Listar todos.
	 *
	 * @return the list
	 */
	@Override
	public List<Usuario> listarTodos() {
		return userRepository.findAll();
	}

	/**
	 * Guardar.
	 *
	 * @param user the user
	 */
	@Override
	public void guardar(Usuario user) {
		userRepository.save(user);
	}

	/**
	 * Buscar por id.
	 *
	 * @param idUsuario the id usuario
	 * @return the usuario
	 */
	@Override
	public Usuario buscarPorId(Long idUsuario) {
		return userRepository.findById(idUsuario).orElse(null);
	}

	/**
	 * Eliminar.
	 *
	 * @param idUsuario the id usuario
	 */
	@Override
	public void eliminar(Long idUsuario) {
		userRepository.deleteById(idUsuario);

	}

}
