import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Class5StrobogrammaticNumber {
    public static void main(String[] args) {
        Map<Character,Character> mp=new HashMap<>();
        mp.put('0','0');
        mp.put('1','1');
        mp.put('9','6');
        mp.put('6','9');
        mp.put('8','8');
        Scanner sc=new Scanner(System.in);
        String value=sc.nextLine();
        int i=0,j=value.length()-1;
        boolean flag=true;
        while(i<=j){
            if(mp.containsKey(value.charAt(i))&&mp.get(value.charAt(i))==value.charAt(j)){
                i++;
                j--;
            }else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(value+" is a StrobogrammaticNumber");
        }else{
            System.out.println(value+" is not a StrobogrammaticNumber");
        }
        sc.close();
    }
}
