/*
 * 
 */
package cl.vrol.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import cl.vrol.models.entity.Contacto;
import cl.vrol.models.repository.ContactoRepository;
import cl.vrol.models.service.ContactoServiceImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactoServiceImplTest.
 */
public class ContactoServiceImplTest {

    /** The contacto repository. */
    @Mock
    private ContactoRepository contactoRepository;

    /** The contacto service. */
    @InjectMocks
    private ContactoServiceImpl contactoService;

    /** The contacto captor. */
    @Captor
    private ArgumentCaptor<Contacto> contactoCaptor;

    /**
     * Sets the up.
     */
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Guardar test.
     */
    @Test
    public void guardarTest() {
        Contacto contacto = new Contacto();
        contacto.setNomContacto("John");
        contacto.setEmail("johndoe@example.com");
        contactoService.guardar(contacto);

        verify(contactoRepository).save(contactoCaptor.capture());
        assertEquals(contacto, contactoCaptor.getValue());
    }

}
