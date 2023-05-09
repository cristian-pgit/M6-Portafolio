package cl.vrol.models.service;

import java.util.List;

import cl.vrol.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUserNameAndPassword(String userName, String password);
	public List<Usuario> listarTodos();
	public void guardar(Usuario user);
	public Usuario buscarPorId(Long idUsuario);
	public void eliminar(Long idUsuario);
	
}
