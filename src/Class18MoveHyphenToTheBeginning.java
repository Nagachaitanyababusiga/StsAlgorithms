import java.util.*;
public class Class18MoveHyphenToTheBeginning {

    public static void computeUsingMe(char[] arr,int e){
        int i=e;
        for(int j=e;j>=0;j--){
            if(arr[j]!='-'){
                // System.out.println(i+" "+j);
                char c=arr[j];
                arr[j]=arr[i];
                arr[i]=c;
                i--;
            }
        }
    }

    public static void swap(char[] arr,int i,int j){
        if(i==j) return;
        char c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }

    public static String computeUsingSTS(char[] arr,char tar){
        String res="";
        for(char c:arr){
            if(c==tar) res=tar+res;
            else res+=c;
        }
        return res;
    }

    public static void main(String[] args) {
        char[] c="a-b-cde".toCharArray();
        computeUsingMe(c,c.length-1);
        System.out.println(Arrays.toString(c));
        System.out.println(computeUsingSTS("a-b-cde".toCharArray(),'-'));
    }

}
