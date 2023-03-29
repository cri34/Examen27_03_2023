package ex2;

public class Lifo extends Algoritme{
    @Override
    public void extreure (){
        super.objetos.remove(super.objetos.size()-1);
    }
    @Override
    public Object consultaPrimerElement(){
        return super.objetos.get(super.objetos.size()-1);
    }
    @Override
    public String toString(){
      return  "tipoObjeto : lifo"+"lenght : "+super.lenght();
    }
}
