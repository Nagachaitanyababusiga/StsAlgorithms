public class Class15MaximumSumofAHourGlass {

    public static int computeUsingSTS(int[][] a,int m,int n){
        int max=0;
        if(m<=2||n<=2) return 0;
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                int sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(computeUsingSTS(new int[][]{{1,2,3},{4,5,6},{7,8,9}},3,3));
    }

}
