package Arreglos;
import java.util.ArrayList;
import Clases.Docente;
public class ArregloDocente {
    //Atributos Privados
    private ArrayList <Docente> doc;
    //Constructor
    public ArregloDocente(){
        doc = new ArrayList<>();
    }
    public void adicionar(Docente x){
        doc.add(x);
    }
    public int tamanio(){
        return doc.size();
    }
    public Docente obtener(int i){
        return doc.get(i);
    }
    public Docente buscar(int codigoDocente){
        for(int i = 0; i < tamanio(); i++)
        if(obtener(i).getCodigoDocente() == codigoDocente)
            return obtener(i);
        return null;
    }
    public void eliminar(Docente x){
        doc.remove(x);
    }
}
