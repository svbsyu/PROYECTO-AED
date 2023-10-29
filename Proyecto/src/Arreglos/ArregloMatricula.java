package Arreglos;
import Clases.Matricula;
import java.util.ArrayList;
public class ArregloMatricula {
    //Atributos Privados
    private ArrayList <Matricula> mat;
    public ArregloMatricula(){
        mat = new ArrayList<>();
    }
    public void adicionar(Matricula x){
        mat.add(x);
    }
    public int tamanio(){
        return mat.size();
    }
    public Matricula obtener(int i){
        return mat.get(i);
    }
    public Matricula buscar(int codigoMatricula){
        for(int i = 0; i < tamanio(); i++)
        if(obtener(i).getCodigoMatricula() == codigoMatricula)
            return obtener(i);
        return null;
    }
}
