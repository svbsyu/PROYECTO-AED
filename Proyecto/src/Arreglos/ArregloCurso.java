package Arreglos;
import Clases.Curso;
import java.util.ArrayList;
public class ArregloCurso {
    //Atributos Privados
    private ArrayList <Curso> cur;
    //Constructor
    public ArregloCurso(){
        cur = new ArrayList<>();
    }
    public void adicionar(Curso x){
        cur.add(x);
    }
    public int tamanio(){
        return cur.size();
    }
    public Curso obtener(int i){
        return cur.get(i);
    }
    public Curso buscar(int codigoCurso){
        for(int i = 0; i < tamanio(); i++)
        if(obtener(i).getCodigoCurso() == codigoCurso)
            return obtener(i);
        return null;
    }
}
