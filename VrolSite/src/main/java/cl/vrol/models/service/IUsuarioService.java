/*
 * 
 */
package cl.vrol.models.service;

import java.util.List;

import cl.vrol.models.entity.Usuario;

// TODO: Auto-generated Javadoc
/**
 * The Interface IUsuarioService.
 */
public interface IUsuarioService {

	/**
	 * Find by user name and password.
	 *
	 * @param userName the user name
	 * @param password the password
	 * @return the usuario
	 */
	public Usuario findByUserNameAndPassword(String userName, String password);
	
	/**
	 * Listar todos.
	 *
	 * @return the list
	 */
	public List<Usuario> listarTodos();
	
	/**
	 * Guardar.
	 *
	 * @param user the user
	 */
	public void guardar(Usuario user);
	
	/**
	 * Buscar por id.
	 *
	 * @param idUsuario the id usuario
	 * @return the usuario
	 */
	public Usuario buscarPorId(Long idUsuario);
	
	/**
	 * Eliminar.
	 *
	 * @param idUsuario the id usuario
	 */
	public void eliminar(Long idUsuario);
	
}
