import java.util.*;

public class Class10MajorityElement {

    public static int computeUsingMoore(int arr[]){
        int res=0;
        int freq=0;
        for(int i:arr){
            if(freq==0){
                res=i;
                freq=1;
            }else{
                if(res==i) freq++;
                else freq--;
            }
        }
        int count=0;
        for(int i:arr) if(i==res) count++;
        int n=arr.length;
        if(count>n/2) return res;
        return -1;
    }

    public static int computeUsingBruteForce(int[] arr){
        int n=arr.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])) continue;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]) mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            }
        }
        // System.out.println(mp);
        for(int i:mp.keySet()) if(mp.get(i)>=n/2) return i;
        return -1;
    }

    public static void main(String[] args) {
        int res=computeUsingMoore(new int[]{3,2,2,3,2,4,2});
        res=computeUsingBruteForce(new int[]{3,2,2,3,2,4,2});
        System.out.println(res);
    }
}
