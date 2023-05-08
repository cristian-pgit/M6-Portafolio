package cl.vrol.models.service;

import java.util.List;

import cl.vrol.model.entity.Mesa;

public interface IMesaService {
	
	List<Mesa> listaMesas();
	
	Mesa buscarPorMesaID(Long idMesa);

	int getCuposDisponibles(Long idMesa);
	
	

}
