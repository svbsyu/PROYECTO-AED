package Clases;

public class Docente{
	protected int codigoDocente, categoria;
	protected String nombres, apellidos,telefono, dni;
	public Docente(int codigoDocente, String nombres, String apellidos, String telefono, String dni, int categoria) {
	this.codigoDocente=codigoDocente;
	this.nombres=nombres;
	this.apellidos=apellidos;
	this.telefono=telefono;
	this.dni=dni;
	this.categoria=categoria;
	}
	public int getCodigoDocente() {
		return codigoDocente;
	}
	public void setCodigoDocente(int codigoDocente) {
		this.codigoDocente = codigoDocente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
}