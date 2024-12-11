import java.util.*;

/*
    Booths Algorithm
    5 * 4(multiplier - 'Q')
    Multiplicand(M)
    Accumulator A
    Extrabit Q_1

    M=0101
    Q=0100
*/

public class Class6BoothsAlgorithm {

    public static long Boothmultiplier(int M,int Q){
        if(M==0||Q==0) return 0;
        // if(M<100&&Q<100) return M*Q;
        long pos=M;
        long neg=~M;
        long ACC=Q<<1;
        int n=Integer.toBinaryString(Q).length()+2;
        int temp=n;
        while(temp-1>0){
            String s=Long.toBinaryString(ACC);
            String option=s.substring(s.length()-2,s.length());
            if(option.equals("01")){
                long value=pos<<n;
                ACC=ACC+value;
            }else if(option.equals("10")){
                long value=(neg+1)<<n;
                ACC=ACC+value;
            }
            ACC=ACC>>1;
            temp--;
        }
        ACC=ACC>>1;
        return ACC;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int M = sc.nextInt();
        int Q=sc.nextInt();
        System.out.println(Boothmultiplier(M, Q));
        sc.close();
    }
}
