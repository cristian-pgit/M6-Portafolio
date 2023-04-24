package cl.vrol.vrolsite.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.vrol.vrolsite.dao.MesaDao;
import cl.vrol.vrolsite.mappers.MesaRowMapper;
import cl.vrol.vrolsite.mappers.UsuarioRowMapper;
import cl.vrol.vrolsite.model.Mesa;
import cl.vrol.vrolsite.model.Usuario;

public class MesaDaoImpl implements MesaDao{
	
	private JdbcTemplate jdbcTemp;
	
	public MesaDaoImpl(DataSource  dataSource	) {
		this.jdbcTemp = new JdbcTemplate(dataSource);
	}

	@Override
	public Mesa getUsuarioById(String idMesa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mesa> getAllMesas() {
		String sql = "SELECT idmesa, nombre_mesa, narrador, juego, formato, dia, jugadores, descripcion_breve, otros FROM mesa";
		List<Mesa> mesas = jdbcTemp.query(sql, new MesaRowMapper());
		
		return mesas;
	}

	@Override
	public void updateMesa(Mesa mesa, int idMesa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertMesa(Mesa mesa) {
		String sql = "INSERT INTO mesa (idmesa, nombre_mesa, narrador, juego, formato, dia, jugadores, descripcion_breve, descripcion, otros VALUES "
				+ "(?,?,?,?,?,?,?,?,?,?)";
		List<Mesa> mesas = jdbcTemp.query(sql, new MesaRowMapper());
		
	}

	@Override
	public void deleteMesa(Mesa mesa, int idMesa) {
		// TODO Auto-generated method stub
		
	}

}
