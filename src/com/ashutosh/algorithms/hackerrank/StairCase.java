package com.ashutosh.algorithms.hackerrank;

import java.util.Scanner;

/**
 * Created by dell on 11/4/2015.
 */

public class StairCase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n+1;i++){
            int j=n-i;
            for(int k=j;k>0;k--)System.out.print(" ");
            for(int l=i;l>0;l--)System.out.print("#");

            System.out.println();
        }
    }
}