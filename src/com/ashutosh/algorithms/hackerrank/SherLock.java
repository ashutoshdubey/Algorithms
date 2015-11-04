package com.ashutosh.algorithms.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherLock{

    public static int getPivot(int n) {
        while(n > 0) {
            if(n%3 == 0)
                break;
            else
                n -= 5;

        }
        return n;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n;
        while(t>0){
            n=sc.nextInt();
            int pivot=getPivot(n);
            if(pivot<0)System.out.print(-1);
            else{
                int repeat=pivot/3;
                while(repeat>0){
                    System.out.print("555");
                    repeat--;
                }
                repeat = (n-pivot)/5;
                while(repeat>0){
                    System.out.print("33333");
                    repeat--;
                }
            }
            System.out.println();
            t--;
        }

    }
}