public class Class7EuclidsAlgorithm {

    public static int compute(int a,int b){
        if(a==0) return b;
        return compute(b%a, a);
    }
    public static void main(String[] args) {
        System.out.println(compute(21,14));
    }
}
