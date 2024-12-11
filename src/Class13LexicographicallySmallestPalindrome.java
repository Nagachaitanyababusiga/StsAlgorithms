public class Class13LexicographicallySmallestPalindrome {

    public static String compute(String str){
        int[] mp=new int[26];
        for(char c:str.toCharArray()){
            mp[c-'a']++;
        }
        int saves=1;
        for(int i:mp){
            if(i%2!=0){
                if(saves>0) saves--;
                else return "-1";
            }
        }
        int mid=-1;
        StringBuilder s=new StringBuilder();
        for(int i=0;i<26;i++){
            if(mp[i]%2==0){
                char c=(char)('a'+i);
                int temp=mp[i]/2;
                while(temp-->0){
                    s.append(c);
                }
            }else{
                mid=i;
            }
        }
        String midPart="";
        if(mid!=-1){
            for(int i=0;i<mp[mid];i++) midPart+=(char)('a'+mid);
        }
        return s.toString()+midPart+s.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(compute("madam"));
    }

}
