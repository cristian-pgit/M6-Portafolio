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
 * The Class Mesa.
 */
@Entity
@Table(name = "mesas")
public class Mesa implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id mesa. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMesa;
	
	/** The nombre mesa. */
	private String nombreMesa;
	
	/** The narrador. */
	private String narrador;
	
	/** The juego. */
	private String juego;
	
	/** The formato. */
	private String formato;
	
	/** The dia. */
	private String dia;
	
	/** The cupos. */
	private int cupos;
	
	/** The des corta. */
	private String desCorta;
	
	/** The descripcion. */
	private String descripcion;
	
	/** The tags. */
	private String tags;
	
	/**
	 * Gets the id mesa.
	 *
	 * @return the id mesa
	 */
	public Long getIdMesa() {
		return idMesa;
	}
	
	/**
	 * Sets the id mesa.
	 *
	 * @param idMesa the new id mesa
	 */
	public void setIdMesa(Long idMesa) {
		this.idMesa = idMesa;
	}
	
	/**
	 * Gets the nombre mesa.
	 *
	 * @return the nombre mesa
	 */
	public String getNombreMesa() {
		return nombreMesa;
	}
	
	/**
	 * Sets the nombre mesa.
	 *
	 * @param nombreMesa the new nombre mesa
	 */
	public void setNombreMesa(String nombreMesa) {
		this.nombreMesa = nombreMesa;
	}
	
	/**
	 * Gets the narrador.
	 *
	 * @return the narrador
	 */
	public String getNarrador() {
		return narrador;
	}
	
	/**
	 * Sets the narrador.
	 *
	 * @param narrador the new narrador
	 */
	public void setNarrador(String narrador) {
		this.narrador = narrador;
	}
	
	/**
	 * Gets the juego.
	 *
	 * @return the juego
	 */
	public String getJuego() {
		return juego;
	}
	
	/**
	 * Sets the juego.
	 *
	 * @param juego the new juego
	 */
	public void setJuego(String juego) {
		this.juego = juego;
	}
	
	/**
	 * Gets the formato.
	 *
	 * @return the formato
	 */
	public String getFormato() {
		return formato;
	}
	
	/**
	 * Sets the formato.
	 *
	 * @param formato the new formato
	 */
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	/**
	 * Gets the dia.
	 *
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}
	
	/**
	 * Sets the dia.
	 *
	 * @param dia the new dia
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	/**
	 * Gets the cupos.
	 *
	 * @return the cupos
	 */
	public int getCupos() {
		return cupos;
	}
	
	/**
	 * Sets the cupos.
	 *
	 * @param jugadores the new cupos
	 */
	public void setCupos(int jugadores) {
		this.cupos = jugadores;
	}
	
	/**
	 * Gets the des corta.
	 *
	 * @return the des corta
	 */
	public String getDesCorta() {
		return desCorta;
	}
	
	/**
	 * Sets the des corta.
	 *
	 * @param desCorta the new des corta
	 */
	public void setDesCorta(String desCorta) {
		this.desCorta = desCorta;
	}
	
	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Gets the tags.
	 *
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}
	
	/**
	 * Sets the tags.
	 *
	 * @param tags the new tags
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
	
	
	

}
