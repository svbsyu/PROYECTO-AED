package Clases;
import java.util.Random;
public class Docente {
    //atributos privados
    private int CodigoDocente;
    private String nombre, apellidos, categoria, telefonia, dni;
    //Constructor
    public Docente(int CodigoDocente, String nombre, String apellidos, String categoria, String telefonia, String dni) {
        this.CodigoDocente = CodigoDocente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.categoria = categoria;
        this.telefonia = telefonia;
        this.dni = dni;
    }
    //Getters and Setters
	public int getCodigoDocente() {
		return CodigoDocente;
	}
	public void setCodigoDocente(int codigoDocente) {
		CodigoDocente = codigoDocente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTelefonia() {
		return telefonia;
	}
	public void setTelefonia(String telefonia) {
		this.telefonia = telefonia;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
    public static int numeroaleatorio(){
        int min = 1001, max = 2000;
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
