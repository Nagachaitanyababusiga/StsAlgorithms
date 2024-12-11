public class Class16MaximumEquilibriumSum {

    public static int computeUsingPreSuff(int[] arr){
        int res=Integer.MIN_VALUE;
        int suffsum=0;
        int presum=0;
        for(int i:arr) suffsum+=i;
        for(int i:arr){
            presum+=i;
            if(presum==suffsum) res=Math.max(res,suffsum);
            suffsum-=i;
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(computeUsingPreSuff(new int[]{-3,4,2,1,2,-4,5}));
    }
}
