package cl.vrol.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jugadores_inscritos")
public class Jugador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idInscrito;
	private String nombreJugador;
	private String email;
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="mesa_id")
	private Mesa mesa;

	public Long getIdInscrito() {
		return idInscrito;
	}

	public void setIdInscrito(Long idInscrito) {
		this.idInscrito = idInscrito;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

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
