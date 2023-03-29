package ex2;

public class Fifo extends Algoritme{

    @Override
    public void extreure (){
        super.objetos.remove(0);
    }
    @Override
    public Object consultaPrimerElement(){
        return super.objetos.get(0);
    }
    @Override
    public String toString(){
        return "tipoObjeto : fifo"+"lenght : "+super.lenght();
    }
}
