import java.util.*;

class Class21Manachers{

    public static String computeUsingSts(String s){
        String temp="#";
        for(char c:s.toCharArray()){
            temp+="#"+c;
        }
        temp=temp+"#@";
        int[] arr=new int[2*s.length()+3];
        for(int i=1;i<2*s.length()+2;i++){
            int temp_l=i-1,temp_r=i+1;
            int count=1;
            while(temp_l>=0&&temp_r<=arr.length&&temp.charAt(temp_l)==temp.charAt(temp_r)){
                temp_l--;
                temp_r++;
                count++;
            }
            arr[i]=count;
        }
        int index=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(count<=arr[i]){
                count=arr[i];
                index=i;
            }
        }
        int l=(index-count)/2;
        int r=(index-2+count)/2;
        return s.substring(l, r);
    }

    public static String trueManachers(String s){
        return "";
    }

    public static void main(String[] args) {
        System.out.println(computeUsingSts("madam"));
    }

}