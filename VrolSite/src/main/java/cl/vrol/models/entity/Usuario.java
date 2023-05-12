/*
 * 
 */
package cl.vrol.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * The Class Usuario.
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity(name = "users")
public class Usuario {

	/** The id usuario. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	/** The user name. */
	@NotEmpty
	private String userName;
	
	/** The password. */
	@NotEmpty
	private String password;
	
	/** The nick. */
	@NotEmpty
	private String nick;
	
	/** The email. */
	@NotEmpty
	@Email
	private String email;
	
	/** The perfil. */
	@NotEmpty
	private String perfil;
	
	/**
	 * Gets the id usuario.
	 *
	 * @return the id usuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	/**
	 * Sets the id usuario.
	 *
	 * @param idUsuario the new id usuario
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Gets the nick.
	 *
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}
	
	/**
	 * Sets the nick.
	 *
	 * @param nick the new nick
	 */
	public void setNick(String nick) {
		this.nick = nick;
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
	 * Gets the perfil.
	 *
	 * @return the perfil
	 */
	public String getPerfil() {
		return perfil;
	}
	
	/**
	 * Sets the perfil.
	 *
	 * @param perfil the new perfil
	 */
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	
	
	
}
