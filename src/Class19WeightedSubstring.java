import java.util.*;

public class Class19WeightedSubstring {

    public static int computeUsingSTS(String P,String Q,int k){
        Set<String> st=new HashSet<>();
        int count=0;
        for(int i=0;i<P.length();i++){
            String s="";
            int sum=0;
            for(int j=i;j<P.length();j++){
                int index=P.charAt(j)-'a';
                int val=Q.charAt(index)-'0';
                s+=P.charAt(j);
                sum+=val;
                if(sum<=k){ 
                    if(!st.contains(s)){
                        st.add(s);
                        count++;
                    }
                }
                else break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String P=sc.nextLine();
        String Q=sc.nextLine();
        int k=sc.nextInt();
        System.out.println(computeUsingSTS(P, Q, k));
        sc.close();    
    }

}
