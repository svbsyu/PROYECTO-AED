package Clases;
import java.util.Random;
public class Matricula {
    //Atributos Privados
    private int codigoMatricula, codigoAlumno, codigoCurso;
    //Constructor
    public Matricula(int CodigoMatricula, int CodigoAlumno, int CodigoCurso) {
        this.codigoMatricula = CodigoMatricula;
        this.codigoAlumno = CodigoAlumno;
        this.codigoCurso = CodigoCurso;
    }
    //Getters and Setters
	public int getCodigoMatricula() {
		return codigoMatricula;
	}
	public void setCodigoMatricula(int codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}
	public int getCodigoAlumno() {
		return codigoAlumno;
	}
	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}
	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
    public static int numeroaleatorio(){
        int min = 4001, max = 5000;
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
