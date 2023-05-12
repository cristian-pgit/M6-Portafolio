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
	@NotEmpty
	private String nombreJugador;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	@Pattern(regexp="[0-9]{9}")
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
