public class Test {
    public static void main(String[] args) {
        int [] n= {5,1,12,-5,16};
        print(bubblesort(n));
    }
    public static int [] bubblesort(int[]n) {
        int[] r = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            r[i] = n[i];
        }
        int temp = 0;
        while (!ordenat(r)) {
            for (int i = 0; i < r.length - 1; i++) {
                if (r[i] > r[i + 1]) {
                    temp = r[i];
                    r[i] = r[i + 1];
                    r[i + 1] = temp;
                }
            }
        }
    return r;
    }
    private static boolean ordenat(int []n){
        for (int i=0;i<n.length-1;i++){
            if (n[i] > n[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void print(int [] n){
        StringBuilder out = new StringBuilder();
        for (int i =0;i<n.length;i++){
            out.append(n[i]+" ");
        }
        System.out.println(out.toString());
    }
}
