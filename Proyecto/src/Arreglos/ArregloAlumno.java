package Arreglos;
import java.util.ArrayList;
import Clases.Alumno;
public class ArregloAlumno {
    //Atributos Privados
    private ArrayList <Alumno> alu;
    //Constructor
    public ArregloAlumno(){
        alu = new ArrayList<Alumno>();
    }
    public void adicionar(Alumno x){
        alu.add(x);
    }
    public int tamanio(){
        return alu.size();
    }
    public Alumno obtener(int i){
        return alu.get(i);
    }
    public Alumno buscar(int CodigoAlumno){
        for(int i = 0; i < tamanio(); i++)
        if(obtener(i).getCodigoAlumno() == CodigoAlumno)
            return obtener(i);
        return null;
    }
}
