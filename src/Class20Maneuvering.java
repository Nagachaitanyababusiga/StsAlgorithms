import java.util.*;

public class Class20Maneuvering {

    public static int computeUsingRecursion(int i,int j,int m,int n){
        if(i==m||j==n) return 0;
        if(i==m-1&&j==n-1) return 1;
        return computeUsingRecursion(i+1,j,m,n)+computeUsingRecursion(i, j+1, m, n);
    }

    public static int computeUsingDp(int m,int n){
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++) dp[i][n-1]=1;
        for(int j=0;j<n;j++) dp[m-1][j]=1;
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=dp[i][j+1]+dp[i+1][j];
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        System.out.println(computeUsingRecursion(0,0,10,10));
        System.out.println(computeUsingDp(10,10));
    }

}
