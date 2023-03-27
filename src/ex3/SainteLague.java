package ex3;

public class SainteLague {
    int maxescons;
    int[]escons;
    int porcentaje;
    int[]vots;
    String [] nom;
    boolean [] pValido;
    public SainteLague(int[] vots,String[]nom, int escons,int porcentaje){
        this.vots=vots;
        this.nom=nom;
        maxescons=escons;
        this.porcentaje=porcentaje;
        this.pValido= new boolean[vots.length];
        this.escons= new int [vots.length];

    }

    private void eliminarPartidosConMenosVotos(){
        int suma=0;
        int minVotos=0;
        for (int i =0;i<vots.length;i++){
            suma += vots[i];
        }
        minVotos=(suma * porcentaje)/100;
        for (int i=0; i< vots.length;i++){
            if (vots[i] >= minVotos){
                pValido[i]=true;
            }
        }
    }

    private double calQuoficient(int indexPartido){
        return (double) (vots[indexPartido] / (escons[indexPartido]*2+1));
    }
    private int obtenirIndexQuoficientMaxim(){
        int indMax=0;
        for (int i =0; i < vots.length;i++){
            if (pValido[i]){
                if (calQuoficient(i) > calQuoficient(indMax))
                    indMax = i;
            }
        }
        return indMax;
    }
    private  void calcularescons(){
        int esconsRepartits=0;
        int indPartidoGanador=0;
        while (esconsRepartits != maxescons){
            indPartidoGanador=obtenirIndexQuoficientMaxim();
            escons[indPartidoGanador]++;
            esconsRepartits++;
        }
    }
    public void imprimirEscons(){
        for (int i =0; i < escons.length;i++){
            System.out.println( " partido : " +nom[i]+" escons : "+escons[i] + " partido Valido : " + pValido[i]);
        }
    }
    public void init(){
        eliminarPartidosConMenosVotos();
        calcularescons();
    }
}
