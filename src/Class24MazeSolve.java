import java.util.*;

public class Class24MazeSolve {

    private static List<String> res;

    public static void computeUsingSTS(int[][] mat,List<String> sb,int i,int j,int m,int n){
        if(i==m-1&&j==n-1){
            res.add(sb.toString());
            return;
        }
        sb.add(((i+1)+" "+j));
        if(i+1<m&&mat[i+1][j]==1) computeUsingSTS(mat, sb, i+1, j, m, n);
        sb.remove(sb.size()-1);
        sb.add((i+" "+(j+1)));
        if(j+1<n&&mat[i][j+1]==1) computeUsingSTS(mat, sb, i, j+1, m, n);
        sb.remove(sb.size()-1);
    }

    public static void main(String[] args) {
        res=new ArrayList<>();
        int[][] arr=new int[][]{
            {1,1,1},
            {1,1,1},
            {0,0,1}
        };
        List<String> help=new ArrayList<>();
        help.add("0 0");
        if(arr[0][0]==1) computeUsingSTS(arr,help,0,0,3,3);
        System.out.println(res.size()==0?"NO":res);
    }


}
