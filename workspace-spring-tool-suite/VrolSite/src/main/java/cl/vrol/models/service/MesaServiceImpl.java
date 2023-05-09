package cl.vrol.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import cl.vrol.models.entity.Mesa;
import cl.vrol.models.repository.JugadorRepository;
import cl.vrol.models.repository.MesaRepository;

@Service
public class MesaServiceImpl implements IMesaService{

	@Autowired
	private MesaRepository mesaRepository;
	
	@Autowired
	private JugadorRepository jugadorRepository;
	
	@Override
	public List<Mesa> listaMesas() {
		
		return (List<Mesa>) mesaRepository.findAll();
	}

	@Override
	public Mesa buscarPorMesaID(Long idMesa) {

		return mesaRepository.findById(idMesa).orElse(null);
	}
	
	@Override
	public int getCuposDisponibles(Long idMesa) {
	    Mesa mesa = buscarPorMesaID(idMesa);
	    if (mesa == null) {
	        // Si la mesa no existe, se puede lanzar una excepción o retornar un valor por defecto
	        return 0;
	    }
	    int jugadoresEnMesa = mesaRepository.countJugadoresByMesaId(idMesa);
	    int cuposDisponibles = mesa.getCupos() - jugadoresEnMesa;
	    return cuposDisponibles;
	}
	

}
