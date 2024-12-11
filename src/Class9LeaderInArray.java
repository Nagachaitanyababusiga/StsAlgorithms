import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Class9LeaderInArray {

    public static void compute(int[] arr,Stack<Integer> st){
        for(int i:arr){
            while(!st.isEmpty()&&st.peek()<i){
                st.pop();
            }
            st.add(i);
        }
    }

    public static void compute2(int[] arr,List<Integer> lst){
        int value=0;
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            if(curr>value){
                value=curr;
                lst.add(curr);
            }
        }
    }

    public static void main(String[] args) {
        //int[] arr=new int[]{10,8,9,6,5,3,1};
        //int[] arr=new int[]{15,5,10,9,3,1};
        int[] arr=new int[]{16, 17, 4, 3, 5, 2};
        Stack<Integer> st=new Stack<>();
        List<Integer> lst=new ArrayList<>();
        compute(arr,st);
        compute2(arr,lst);
        for(int i:st) System.out.println(i);
        System.out.println();
        for(int i:lst) System.out.println(i);
    }

}
