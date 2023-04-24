package cl.vrol.vrolsite.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.vrol.vrolsite.dao.UsuarioDao;
import cl.vrol.vrolsite.mappers.UsuarioRowMapper;
import cl.vrol.vrolsite.model.Usuario;

public class UsuarioDaoImpl implements UsuarioDao{

	private JdbcTemplate jdbcTemp;

	public UsuarioDaoImpl(DataSource  dataSource	) {
		this.jdbcTemp = new JdbcTemplate(dataSource);
	}

	@Override
	public Usuario getUsuarioByUsernameAndPass(String username, String password) {
		String sql = "SELECT id_usuario, perfil, username, password FROM usuario WHERE username = ? AND password=?";
		Object[] params = {username, password};
		Usuario user = jdbcTemp.queryForObject(sql, params, new UsuarioRowMapper());
		
		return user;
	}

	@Override
	public Usuario getUsuarioById(String idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUsuario(Usuario usuario, int idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	

}
