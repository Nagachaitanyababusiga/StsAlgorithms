package Homework;

import java.util.Scanner;

public class Class5BinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        boolean flag=true;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println(n+" is a binary palindrome with binary representation as "+s);
        }else{
            System.out.println(n+" is not a binary palindrome with binary representation as "+s);
        }
        sc.close();
    }
}
