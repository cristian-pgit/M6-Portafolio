package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import DAO.UsuarioDAO;
import conection.Singleton;
import models.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	private Connection conn;
	private Statement stm;
	private ResultSet rs;
	private PreparedStatement st;

	@Override
	public Usuario getUsuarioByNameandPass(String userName, String password) {
		final String sql = "SELECT user_name, password, perfil FROM usuarios WHERE user_name=? AND password=?";
		initConnection();
		Usuario user = null;
		try {

			conn = Singleton.getConnection();
			st = conn.prepareStatement(sql);
			st.setString(1, userName);
			st.setString(2, password);
			rs = st.executeQuery();

			if (rs.next()) {
	            user = new Usuario();
	            user.setUserName(rs.getString(1));
	            user.setPassword(rs.getString(2));
	            user.setPerfil(rs.getString(3));
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<Usuario> getAllUsuario() {
		String sql = "SELECT * FROM usuarios;";
		initConnection();
		List<Usuario> usuarios = null;
		try {
			conn = Singleton.getConnection();
			stm = conn.createStatement();
			stm.executeQuery(sql);
			rs = stm.getResultSet();

			usuarios = new ArrayList<Usuario>();
			while (rs.next()) {
				Usuario usu = new Usuario();
				usu.setIdUsuario(rs.getInt(1));
				usu.setUserName(rs.getString(2));
				usu.setPerfil(rs.getString(4));

				usuarios.add(usu);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuarios;

	}

	@Override
	public int deleteUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateUsuario(Usuario usuario, int idUsuario) {
		String sqlu = "UPDATE usuarios SET user_name=?, password=?, WHERE idUsuario=?";
		initConnection();
		try {
			conn = Singleton.getConnection();
			st = conn.prepareStatement(sqlu);
			st.setString(1, usuario.getUserName());
			st.setString(2, usuario.getPassword());
			st.setInt(3, idUsuario);
			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertUsuario(Usuario usuario) {
		String sql = "INSERT INTO usuarios (user_name, password, perfil) VALUES (?, ?, ?)";
		initConnection();
		try {
			conn = Singleton.getConnection();
			st = conn.prepareStatement(sql);
			st.setString(1, usuario.getUserName());
			st.setString(2, usuario.getPassword());
			st.setString(3, usuario.getPerfil());
			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void initConnection() {
		conn = null;
		stm = null;
		rs = null;
		st = null;

	}

}
