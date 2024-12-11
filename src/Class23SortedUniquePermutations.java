import java.util.*;

public class Class23SortedUniquePermutations {

    private static List<String> res;
    private static List<String> res2;

    public static void swap(char ch[],int i,int j){
        if(i==j) return;
        char temp=ch[j];
        ch[j]=ch[i];
        ch[i]=temp;
    }

    public static void findPermutations(char ch[],int fi){
        if(fi==ch.length){
            res.add(new String(ch));
            System.out.println(new String(ch));
        }
        for(int i=fi;i<ch.length;i++){
            swap(ch,fi,i);
            findPermutations(ch, fi+1);
            swap(ch,fi,i);
        }
    }

    public static void findUniquePermuatitions(StringBuilder sb,int fi){
        if(fi==sb.length()-1){
            res2.add(sb.toString());
            return;
        }
        findUniquePermuatitions(sb, fi+1);
        for(int i=fi;i<sb.length();i++){
            if(sb.charAt(i)==sb.charAt(fi)) continue;
            else{
                char c=sb.charAt(fi);
                sb.setCharAt(fi, sb.charAt(i));
                sb.setCharAt(i, c);
                findUniquePermuatitions(sb, fi+1);
                c=sb.charAt(fi);
                sb.setCharAt(fi, sb.charAt(i));
                sb.setCharAt(i, c);
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        res=new ArrayList<>();
        res2=new ArrayList<>();
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        findPermutations(ch,0);
        findUniquePermuatitions(new StringBuilder(s), 0);
        //Collections.sort(res);
        System.out.println(res);
        System.out.println(res2);
        sc.close();
    }

}
