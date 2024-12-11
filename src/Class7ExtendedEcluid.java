public class Class7ExtendedEcluid {

    static class Result{
        int x,y;
        Result(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public static int computeExtendedGCD(int a,int b,Result r){
        if(a==0){
            r.x=0;
            r.y=1;
            return b;
        }
        Result temp=new Result(1,1);
        int gcd=computeExtendedGCD(b%a,a, temp);
        r.x=temp.y-(b/a)*temp.x;
        r.y=temp.x;
        return gcd;
    }

    public static void main(String[] args) {
        int a=35,b=14;
        Result r=new Result(1,1);
        int gcd=computeExtendedGCD(a, b, r);
        System.out.println(gcd+" : "+r.x+" : "+r.y);
    }

}
