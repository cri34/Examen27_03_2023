package ex2;

public class Ex2 {
    public static void main(String[] args) {
        Lifo l = new Lifo();
        Fifo f = new Fifo();
        genNumerosPrimers(f);
        System.out.println("objeto:"+f);
        System.out.println("vacio : "+f.vacio());
        buidarTot(f);
        System.out.println("vacio : "+f.vacio());
        System.out.println("objeto:"+f);

        genNumerosPrimers(l);
        System.out.println("objeto:"+l);
        System.out.println( "vacio : "+l.vacio());
        buidarTot(l);
        System.out.println("vacio : "+l.vacio());
        System.out.println("objeto:"+l);
    }
    public static void genNumerosPrimers(Algoritme a){
        Integer n ;
        final int lastN=50;
        final int firstN=1;
        for (int i = firstN;i <= lastN;i++){
            n = i;
            a.insertarElement(n);
        }
    }

    public static void buidarTot(Algoritme a){
        int l=a.lenght();
        StringBuilder out = new StringBuilder();
        for (int i =0;i < l;i++){
            out.append(a.consultaPrimerElement()+" ");
            a.extreure();
        }
        System.out.println(out.toString());
    }
}

