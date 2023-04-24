package cl.vrol.vrolsite.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import cl.vrol.vrolsite.model.Mesa;


public class MesaRowMapper implements RowMapper<Mesa> {
	
	@Override
	public Mesa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mesa mesa = new Mesa();
		mesa.setIdMesa(rs.getInt("idmesa"));
		mesa.setNombreMesa(rs.getString("nombre_mesa"));
		mesa.setNarrador(rs.getString("narrador"));
		mesa.setJuego(rs.getString("juego"));
		mesa.setFormato(rs.getString("formato"));
		mesa.setDia(rs.getString("dia"));
		mesa.setJugadores(rs.getInt("jugadores"));
		mesa.setDesCorta(rs.getString("descripcion_breve"));
		mesa.setDescripcion(rs.getString("descripcion"));
		mesa.setTags(rs.getString("otros"));
			
		return mesa;
	}


}
