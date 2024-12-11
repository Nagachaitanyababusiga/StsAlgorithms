import java.util.*;

public class Class26ActivitySelection {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        int f[]=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            f[i]=sc.nextInt();
        }
        int i=0;
        System.out.println(i+" ");
        for(int j=1;j<n;j++){
            if(s[j]>=f[i]) System.out.println(j+" ");
            i=j;
        }
    }
}

