import java.util.*;

public class Class4ChineseRemainder {

    public static int findMinX(int num[],int rem[],int k){
        int x=1;
        while(true){
            int j;
            for(j=0;j<k;j++){
                if(x%num[j]!=rem[j]){
                    break;
                }
            }
            if(j==k) return x;
            x++;
        }
    }
    public static void main(String[] args) {
        System.out.println(Class4ChineseRemainder.findMinX(new int[]{3,4,5},new int[]{2,3,1},3));
    }
}
