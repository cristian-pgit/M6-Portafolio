/*
 * 
 */
package cl.vrol.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Contacto.
 */
@Entity
@Table(name = "contacto")
public class Contacto implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id contacto. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idContacto;
	
	/** The nom contacto. */
	private String nomContacto;
	
	/** The email. */
	private String email;
	
	/** The telefono. */
	private String telefono;
	
	/** The mensaje. */
	private String mensaje;
	
	
	/**
	 * Gets the id contacto.
	 *
	 * @return the id contacto
	 */
	public Long getIdContacto() {
		return idContacto;
	}
	
	/**
	 * Sets the id contacto.
	 *
	 * @param idContacto the new id contacto
	 */
	public void setIdContacto(Long idContacto) {
		this.idContacto = idContacto;
	}
	
	/**
	 * Gets the nom contacto.
	 *
	 * @return the nom contacto
	 */
	public String getNomContacto() {
		return nomContacto;
	}
	
	/**
	 * Sets the nom contacto.
	 *
	 * @param nomContacto the new nom contacto
	 */
	public void setNomContacto(String nomContacto) {
		this.nomContacto = nomContacto;
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
	 * Gets the mensaje.
	 *
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}
	
	/**
	 * Sets the mensaje.
	 *
	 * @param mensaje the new mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [idContacto=");
		builder.append(idContacto);
		builder.append(", contacto=");
		builder.append(nomContacto);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", mensaje=");
		builder.append(mensaje);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
