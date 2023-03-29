package ex2;

import java.util.ArrayList;

public abstract class Algoritme {
    protected ArrayList objetos = new ArrayList();
    abstract void extreure ();
    abstract Object consultaPrimerElement();
    public void insertarElement (Object o ){
        objetos.add(o);
    }
    public int lenght(){
        return objetos.size();
    }
    public boolean vacio(){
        return objetos.isEmpty();
    }
    @Override
    public abstract String toString();

}
