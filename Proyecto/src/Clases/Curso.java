package Clases;
import java.util.Random;
public class Curso {
    //Atributos Privados
    private int codigoCurso, codigoDocente, nombre, horas;
    //Constructor
    public Curso(int CodigoCurso, int CodigoDocente, int nombre, int horas) {
        this.codigoCurso = CodigoCurso;
        this.codigoDocente = CodigoDocente;
        this.nombre = nombre;
        this.horas = horas;
    }
    //Getters and Setters
	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public int getCodigoDocente() {
		return codigoDocente;
	}
	public void setCodigoDocente(int codigoDocente) {
		this.codigoDocente = codigoDocente;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
    public static int numeroaleatorio(){
        int min = 3001, max = 4000;
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
