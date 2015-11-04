package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoveLetter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String stri;
        while(t>0){
            stri=sc.next();
            char []str=stri.toCharArray();
            int count=0;
            int i=0;


            for(int j=str.length-1;i<j;j--,i++){
                count=count + Math.abs((int)str[i]-(int)str[j]);

            }
            System.out.println(count);

            t--;
        }

    }
}