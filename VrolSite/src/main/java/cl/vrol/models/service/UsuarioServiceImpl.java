package cl.vrol.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.vrol.models.entity.Usuario;
import cl.vrol.models.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private UsuarioRepository userRepository;
	

	@Override
	public Usuario findByUserNameAndPassword(String userName, String password) {
		return userRepository.findByUserNameAndPassword(userName, password);
	}

	@Override
	public List<Usuario> listarTodos() {
		return userRepository.findAll();
	}

	@Override
	public void guardar(Usuario user) {
		userRepository.save(user);
	}

	@Override
	public Usuario buscarPorId(Long idUsuario) {
		return userRepository.findById(idUsuario).orElse(null);
	}

	@Override
	public void eliminar(Long idUsuario) {
		userRepository.deleteById(idUsuario);

	}

}
