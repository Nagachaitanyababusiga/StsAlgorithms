import java.util.*;

public class Class20Combination {

    static List<List<Integer>> res;

    public static void computeUsingBackTrackingNoRepeat(List<Integer> nums,List<Integer> path,int sum,int i,int tar){
        if(sum==tar){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int j=i;j<nums.size();j++){
            if(nums.get(j)+sum<=tar){
                path.add(nums.get(j));
                computeUsingBackTrackingNoRepeat(nums, path, sum+nums.get(j), j+1, tar);
                path.remove(path.size()-1);
            }else break;
        }
    }

    public static void computeUsingBackTrackingWithRepeat(List<Integer> nums,List<Integer> path,int sum,int tar){
        if(sum==tar){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i:nums){
            if(i+sum<=tar){
                path.add(i);
                computeUsingBackTrackingWithRepeat(nums, path, sum+i,tar);
                path.remove(path.size()-1);
            }else break;
        }
    }

    public static void computeUsingBackTrackingWithRepeatOriginal(List<Integer> nums,List<Integer> path,int sum,int i,int tar){
        if(sum==tar){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int j=i;j<nums.size();j++){
            if(nums.get(j)+sum<=tar){
                path.add(nums.get(j));
                computeUsingBackTrackingWithRepeatOriginal(nums, path, sum+nums.get(j), j, tar);
                path.remove(path.size()-1);
            }else break;
        }
    }

    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        res=new ArrayList<>();
        lst.add(2);
        lst.add(4);
        lst.add(6);
        lst.add(8);
        int tar=8;
        List<Integer> helper=new ArrayList<>();
        Collections.sort(lst);
        // computeUsingBackTrackingNoRepeat(lst,helper,0,0,tar);
        // computeUsingBackTrackingWithRepeat(lst, helper,0, tar);
        computeUsingBackTrackingWithRepeatOriginal(lst, helper,0,0, tar);
        System.out.println(res);
    }
}
