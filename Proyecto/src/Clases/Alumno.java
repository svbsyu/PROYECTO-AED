package Clases; 
import java.util.Random;
public class Alumno {
    //Atributos privados
    private int CodigoAlumno;
    private String nombre, apellido, telefono, dni;
    //Constructor
    public Alumno(int CodigoAlumno, String nombre, String apellido, String telefono, String dni) {
        this.CodigoAlumno = CodigoAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
    }
    //Getters and Setters
	public int getCodigoAlumno() {
		return CodigoAlumno;
	}
	public void setCodigoAlumno(int codigoAlumno) {
		CodigoAlumno = codigoAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
    public static int numeroaleatorio(){
        int min = 2001, max = 3000;
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
