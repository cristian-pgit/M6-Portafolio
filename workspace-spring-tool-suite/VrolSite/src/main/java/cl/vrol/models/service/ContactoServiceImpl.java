package cl.vrol.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.vrol.model.entity.Contacto;
import cl.vrol.models.repository.ContactoRepository;

@Service
public class ContactoServiceImpl implements IContactoService {

	@Autowired
	private ContactoRepository contactoRepo;
	
	
	@Override
	public void guardar(Contacto contacto) {
		contactoRepo.save(contacto);
	}

}
