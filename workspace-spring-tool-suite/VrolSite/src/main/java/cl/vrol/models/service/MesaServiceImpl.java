package cl.vrol.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.vrol.model.entity.Mesa;
import cl.vrol.models.repository.MesaRepository;

@Service
public class MesaServiceImpl implements IMesaService{

	@Autowired
	private MesaRepository mesaRepository;
	
	@Override
	public List<Mesa> listaMesas() {
		
		return (List<Mesa>) mesaRepository.findAll();
	}

}
