/*
 * Each every row & col - 1 Queen
 * No Queen should attack another Queen
 * A Queen can attack in 8 directions (horizantal,vertical,diagnol)
 */

import java.util.*;

class Class25NQueens{
    private static List<List<String>> res;

    public static void compute(char c[][],int col,int n){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(char i[]:c) temp.add(new String(i));
            res.add(temp);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(c,row,col,n)){
                c[row][col]='Q';
                compute(c,col+1,n);
                c[row][col]='.';
            }
        }
    }

    public static boolean isSafe(char car[][],int r,int c,int n){
        for(int i=c;i>=0;i--) if(car[r][i]=='Q') return false;
        for(int i=r,j=c;i>=0&&j>=0;i--,j--) if(car[i][j]=='Q') return false;
        for(int i=r,j=c;i<n&&j>=0;i++,j--) if(car[i][j]=='Q') return false;
        return true;
    }

    public static void solveNQueens(int n) {
        res=new ArrayList<>();
        char[][] c=new char[n][n];
        for(char[] i:c) Arrays.fill(i,'.');
        compute(c,0,n);
        System.out.println(res);
    }

    public static void main(String[] args) {
        solveNQueens(4);
    }

}