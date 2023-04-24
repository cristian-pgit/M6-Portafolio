package cl.vrol.vrolsite.model;

public class Usuario {
	
	private int idUsuario;
	private String username;
	private String password;
	private String perfil;
	private String nick;
	private String correo;
	private int fono;
	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getFono() {
		return fono;
	}

	public void setFono(int fono) {
		this.fono = fono;
	}

	public Usuario() {}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	};
	
	

}
