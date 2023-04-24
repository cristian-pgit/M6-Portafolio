package cl.vrol.vrolsite.model;

public class Mesa {
	
	private int idMesa;
	private String nombreMesa;
	private String narrador;
	private String juego;
	private String formato;
	private String dia;
	private int jugadores;
	private String desCorta;
	private String descripcion;
	private String tags;
	
	public Mesa() {
		
	}
	
	
	public int getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(int idMesa) {
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
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	

}
