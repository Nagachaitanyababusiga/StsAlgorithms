import java.util.*;
public class Class17SelectionSort {

    
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index=selectionIndex(arr,i);
            if(index!=i) swap(arr,i,index);
        }
    }

    static int selectionIndex(int[] arr,int i){
        int mid_index=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[mid_index]) mid_index=j;
        }
        return mid_index;
    }

    static void swap(int[] arr,int i,int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }

    public static void main(String[] args) {
        int arr[]={3,-2,200,43,23,-3,-45,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
