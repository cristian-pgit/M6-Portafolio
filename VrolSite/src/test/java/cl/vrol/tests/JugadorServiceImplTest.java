/*
 * 
 */
package cl.vrol.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import cl.vrol.models.entity.Jugador;
import cl.vrol.models.entity.Mesa;
import cl.vrol.models.repository.JugadorRepository;
import cl.vrol.models.service.JugadorServiceImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class JugadorServiceImplTest.
 */
@SpringBootTest
public class JugadorServiceImplTest {

	/** The jugador repository. */
	@Mock
    private JugadorRepository jugadorRepository;

    /** The jugador service. */
    @InjectMocks
    private JugadorServiceImpl jugadorService;

    /**
     * Sets the up.
     */
    @BeforeEach
    public void setUp() {
        // Setup mock objects if needed
    }

    /**
     * Test listar todos.
     */
    @Test
    public void testListarTodos() {
        Jugador jugador = new Jugador();
        jugador.setIdInscrito(1L);
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador);
        when(jugadorRepository.findAll()).thenReturn(jugadores);

        List<Jugador> result = jugadorService.listarTodos();

        assertEquals(jugadores, result);
    }

    /**
     * Test guardar.
     */
    @Test
    public void testGuardar() {
        Jugador jugador = new Jugador();
        jugador.setIdInscrito(1L);
        when(jugadorRepository.save(jugador)).thenReturn(jugador);

        jugadorService.guardar(jugador);

        // Assert no exception is thrown
    }

    /**
     * Test buscar por id.
     */
    @Test
    public void testBuscarPorId() {
        Jugador jugador = new Jugador();
        jugador.setIdInscrito(1L);
        when(jugadorRepository.findById(1L)).thenReturn(Optional.of(jugador));

        Jugador result = jugadorService.buscarPorId(1L);

        assertEquals(jugador, result);
    }

    /**
     * Test eliminar.
     */
    @Test
    public void testEliminar() {
        // Assert no exception is thrown
        jugadorService.eliminar(1L);
    }

    /**
     * Test find allby order id asc.
     */
    @Test
    public void testFindAllbyOrderIdAsc() {
        Jugador jugador = new Jugador();
        jugador.setIdInscrito(1L);
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador);
        when(jugadorRepository.findAllByOrderByIdInscritoAsc()).thenReturn(jugadores);

        List<Jugador> result = jugadorService.findAllbyOrderIdAsc();

        assertEquals(jugadores, result);
    }

    /**
     * Test find allby order id des.
     */
    @Test
    public void testFindAllbyOrderIdDes() {
        Jugador jugador = new Jugador();
        jugador.setIdInscrito(1L);
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador);
        when(jugadorRepository.findAllByOrderByIdInscritoDesc()).thenReturn(jugadores);

        List<Jugador> result = jugadorService.findAllbyOrderIdDes();

        assertEquals(jugadores, result);
    }

    /**
     * Test find all by mesa.
     */
    @Test
    public void testFindAllByMesa() {
        Jugador jugador = new Jugador();
        jugador.setIdInscrito(1L);
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador);
        Mesa mesa = new Mesa();
        mesa.setIdMesa(1L);
        when(jugadorRepository.findAllByMesa(mesa)).thenReturn(jugadores);

        List<Jugador> result = jugadorService.findAllByMesa(mesa);

        assertEquals(jugadores, result);
    }

}