package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.io.*;
import java.util.*;

public class JavaStringReverse{

    public static int ifPalindrome(char []A, int x, int y){
        while(A[x]==A[y] && x!=y && y!=x+1){
            x++;
            y--;
        }
        if(x==y || y==x+1)return 1;
        else return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char arr[]=A.toCharArray();

        /* Enter your code here. Print output to STDOUT. */
        if(ifPalindrome(arr,0,A.length()-1)==1)System.out.println("Yes");
        else System.out.println("No");

    }
}