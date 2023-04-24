package cl.vrol.vrolsite.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import cl.vrol.vrolsite.model.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario user = new Usuario();
		user.setIdUsuario(rs.getInt("id_usuario"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setPerfil(rs.getString("perfil"));
		
		return user;
	}

}
