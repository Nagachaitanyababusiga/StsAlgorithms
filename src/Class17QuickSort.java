import java.util.Arrays;

class Class17QuickSort{

    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public static void sortUsingQuickSort(int[] arr,int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            sortUsingQuickSort(arr, low, p-1);
            sortUsingQuickSort(arr, p+1, high);
        }
    }

    public static void swap(int[] arr,int i,int j){
        if(i==j) return;
        arr[i]+=arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }

    public static void main(String[] args) {
        int arr[]=new int[]{-3,2,0,23,4,5,78,-1,24};
        sortUsingQuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}