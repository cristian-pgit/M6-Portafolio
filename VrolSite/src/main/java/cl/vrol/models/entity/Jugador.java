/*
 * 
 */
package cl.vrol.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

// TODO: Auto-generated Javadoc
/**
 * The Class Jugador.
 */
@Entity
@Table(name = "jugadores_inscritos")
public class Jugador implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id inscrito. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idInscrito;
	
	/** The nombre jugador. */
	@NotEmpty
	private String nombreJugador;
	
	/** The email. */
	@NotEmpty
	@Email
	private String email;
	
	/** The telefono. */
	@NotEmpty
	@Pattern(regexp="[0-9]{9}")
	private String telefono;
	
	/** The mesa. */
	@ManyToOne
	@JoinColumn(name="mesa_id")
	private Mesa mesa;

	/**
	 * Gets the id inscrito.
	 *
	 * @return the id inscrito
	 */
	public Long getIdInscrito() {
		return idInscrito;
	}

	/**
	 * Sets the id inscrito.
	 *
	 * @param idInscrito the new id inscrito
	 */
	public void setIdInscrito(Long idInscrito) {
		this.idInscrito = idInscrito;
	}

	/**
	 * Gets the nombre jugador.
	 *
	 * @return the nombre jugador
	 */
	public String getNombreJugador() {
		return nombreJugador;
	}

	/**
	 * Sets the nombre jugador.
	 *
	 * @param nombreJugador the new nombre jugador
	 */
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Sets the telefono.
	 *
	 * @param telefono the new telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Gets the mesa.
	 *
	 * @return the mesa
	 */
	public Mesa getMesa() {
		return mesa;
	}

	/**
	 * Sets the mesa.
	 *
	 * @param mesa the new mesa
	 */
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador [idInscrito=");
		builder.append(idInscrito);
		builder.append(", nombreJugador=");
		builder.append(nombreJugador);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", mesa=");
		builder.append(mesa);
		builder.append("]");
		return builder.toString();
	}

}
