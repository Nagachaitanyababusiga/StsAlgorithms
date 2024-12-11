import java.util.*;

public class Class11LongestSequenceOf1sInASequence {

    public static int compute(int n,int k){
        String num=Integer.toBinaryString(n);
        // System.out.println(num);
        int i=0;
        int res=0;
        int saves=0;
        for(int j=0;j<num.length();j++){
            if(num.charAt(j)=='0'){
                saves++;
            }
            while(saves>k){
                if(num.charAt(i++)=='0') saves--;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=compute(n,k);
        System.out.println(ans);
        sc.close();
    }
}
