package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStringCompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();

        String small=s.substring(0,n);
        String large=s.substring(0,n);
        String temp1;
        for(int i=0;(i+n)<=s.length();i++){
            temp1=s.substring(i,i+n);
            if(small.compareTo(temp1)>0)small=temp1;
            if(large.compareTo(temp1)<0)large=temp1;
        }

        System.out.println(small);
        System.out.print(large);

    }
}