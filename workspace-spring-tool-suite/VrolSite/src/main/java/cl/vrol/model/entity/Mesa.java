package cl.vrol.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mesas")
public class Mesa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMesa;
	private String nombreMesa;
	private String narrador;
	private String juego;
	private String formato;
	private String dia;
	private int jugadores;
	private String desCorta;
	private String descripcion;
	private String tags;
	
	public Long getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(Long idMesa) {
		this.idMesa = idMesa;
	}
	public String getNombreMesa() {
		return nombreMesa;
	}
	public void setNombreMesa(String nombreMesa) {
		this.nombreMesa = nombreMesa;
	}
	public String getNarrador() {
		return narrador;
	}
	public void setNarrador(String narrador) {
		this.narrador = narrador;
	}
	public String getJuego() {
		return juego;
	}
	public void setJuego(String juego) {
		this.juego = juego;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public int getJugadores() {
		return jugadores;
	}
	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}
	public String getDesCorta() {
		return desCorta;
	}
	public void setDesCorta(String desCorta) {
		this.desCorta = desCorta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
	
	
	

}
