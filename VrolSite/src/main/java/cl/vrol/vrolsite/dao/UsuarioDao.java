package cl.vrol.vrolsite.dao;

import java.util.List;

import cl.vrol.vrolsite.model.Usuario;

public interface UsuarioDao {

	public Usuario getUsuarioByUsernameAndPass(String username, String password);
	public Usuario getUsuarioById(String idUsuario);
	public List<Usuario> getAllUsuarios();
	public void updateUsuario(Usuario usuario, int idUsuario);
	public void insertUsuario(Usuario usuario);
	
	
}
