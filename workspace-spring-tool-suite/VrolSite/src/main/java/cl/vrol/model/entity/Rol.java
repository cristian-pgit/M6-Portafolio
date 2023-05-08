package cl.vrol.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name ="rol")
	private String rol;
	
	public Long getId() {
		return id;
	}
	public void setIdRol(Long id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String nombre) {
		this.rol = nombre;
	}
	
	public Rol () {};
	
	public Rol(Long id, String nombre) {
		super();
		this.id = id;
		this.rol = nombre;
	};
	
	public Rol(String nombre) {
		super();
		this.rol = nombre;
	};
	
	
	
	

}
