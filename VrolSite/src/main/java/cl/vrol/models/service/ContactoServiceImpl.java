/*
 * 
 */
package cl.vrol.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.vrol.models.entity.Contacto;
import cl.vrol.models.repository.ContactoRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactoServiceImpl.
 */
@Service
public class ContactoServiceImpl implements IContactoService {

	/** The contacto repo. */
	@Autowired
	private ContactoRepository contactoRepo;
	
	
	/**
	 * Guardar.
	 *
	 * @param contacto the contacto
	 */
	@Override
	public void guardar(Contacto contacto) {
		contactoRepo.save(contacto);
	}

}
