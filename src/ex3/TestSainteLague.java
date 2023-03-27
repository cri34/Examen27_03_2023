package ex3;

public class TestSainteLague {
    public static void main(String[] args) {
        int[] vots={120000,100000,40000,5};
        String[] noms={"A","B","C","D"};

        SainteLague s = new SainteLague(vots,noms,8,3);
        s.init();
        s.imprimirEscons();
    }
}
