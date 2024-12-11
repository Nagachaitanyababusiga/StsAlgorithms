import java.util.*;

public class Class12MaximumProductSubArray {

    public static int computeUsingSTSClass(int[] arr){
        int n=arr.length;
        int p=1;
        int s=1;
        int max_prod=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(s==0) s=1;
            if(p==0) p=1;
            p=p*arr[i];
            s=s*arr[n-i-1];
            max_prod=Math.max(max_prod,Math.max(p,s));
        }
        return max_prod;
    }

    public static int computeUsingLeetCode(int[] arr){
        double Max_prod=1,Min_prod=1;
        double res=Integer.MIN_VALUE; 
        for(int n:arr){
            double temp=n*Max_prod;
            Max_prod=Math.max(Math.max(n*Max_prod,n*Min_prod),n);
            Min_prod=Math.min(Math.min(temp,n*Min_prod),n);
            res=Math.max(Max_prod,res);
        }
        return (int)res;
    }


    public static void main(String[] args) {
        System.out.println(computeUsingSTSClass(new int[]{0,1,2,-2,3,0,-1}));
        System.out.println(computeUsingLeetCode(new int[]{0,1,2,-2,3,0,-1}));
    }

}
