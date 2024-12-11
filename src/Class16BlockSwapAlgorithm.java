import java.util.Arrays;

public class Class16BlockSwapAlgorithm {

    public static void computeBlockSwap(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i]=arr[k+i];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-n+k];
        }
    }

    public static int[] computeUsingSts(int[] arr,int k){
        int n=arr.length;
        int[] res=new int[n];
        k=k%n;
        for(int i=0;i<arr.length;i++){
            res[i]=arr[(i+k)%n];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int[] arr2=arr.clone();
        computeBlockSwap(arr, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(computeUsingSts(arr2, 4)));
    }

}
