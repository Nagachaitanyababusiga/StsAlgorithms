public class Class8Karatsuba {

    //aim to find ab*cd
    // (1) -> a*c
    // (2) -> b*d
    // (3) -> (a+b)*(c+d)
    // (4) -> (3) - (2) - (1)
    // res -> (1)*10^(no of digits in (ab)) + (2) + (4)*10^(half of no of digits in (ab))

    public static int computeKaratsuba(int x,int y){
        if(x<10||y<10) return x*y;
        int digits = Math.max(giveNoOfDigits(x),giveNoOfDigits(y));
        int powerOf10 = (int)(Math.pow(10, digits/2));
        int a=x/powerOf10;
        int b=x%powerOf10;
        int c=y/powerOf10;
        int d=y%powerOf10;
        int ac=computeKaratsuba(a, c);
        int bd=computeKaratsuba(b, d);
        int abcd=computeKaratsuba(a+b,c+d);
        int fourth=abcd-bd-ac;
        int res = (int)(ac*Math.pow(10,digits) + bd + fourth*powerOf10);
        return res;
    }

    public static int giveNoOfDigits(int a){
        if(a==0) return 1;
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int res = computeKaratsuba(34, 23);
        System.out.println(res);
    }

}
